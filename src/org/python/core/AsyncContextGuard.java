package org.python.core;

/**
 * Created by isaiah on 5/18/16.
 */
public class AsyncContextGuard implements AsyncContextManager {
    private final PyObject __aenter__method;
    private final PyObject __aexit__method;

    public AsyncContextGuard(PyObject manager) {
        __aenter__method = manager.__finditem__("__aenter__");
        __aexit__method = manager.__finditem__("__aexit__");
    }

    public static AsyncContextManager getManager(PyObject manager) {
        if (manager instanceof AsyncContextManager) {
            return (AsyncContextManager) manager;
        }
        return new AsyncContextGuard(manager);
    }
    @Override
    public PyObject __aenter__(ThreadState ts) {
        return __aenter__method.__call__(ts);
    }

    @Override
    public boolean __aexit__(ThreadState ts, PyException exception) {
        final PyObject type, value, traceback;
        if (exception != null) {
            type = exception.type;
            value = exception.value;
            traceback = exception.traceback;
        } else {
            type = value = traceback = Py.None;
        }
        return __aexit__method.__call__(ts, type,
                value == null ? Py.None : value,
                traceback == null ? Py.None : traceback).__bool__();
    }
}
