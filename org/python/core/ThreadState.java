package org.python.core;

public class ThreadState {
    //public InterpreterState interp;
    public PySystemState systemState;
    public PyFrame frame;
    //public PyObject curexc_type, curexc_value, curexc_traceback;
    //public PyObject exc_type, exc_value, exc_traceback;
    public PyException exception;
    public Thread thread;
    public boolean tracing;
    public PyList reprStack = null;
    public PyInstance initializingProxy = null;

    public ThreadState(Thread t, PySystemState systemState) {
        thread = t;
        // Fake multiple interpreter states for now
        /*if (Py.interp == null) {
            Py.interp = InterpreterState.getInterpreterState();
        }*/
        this.systemState = systemState;
        //interp = Py.interp;
        tracing = false;
        //System.out.println("new thread state");
    }
    
    public boolean enterRepr(PyObject obj) {
        //if (reprStack == null) System.err.println("reprStack: null");
        //else System.err.println("reprStack: "+reprStack.__len__());
        if (reprStack == null) {
            reprStack = new PyList(new PyObject[] {obj});
            return true;
        }
        for(int i=reprStack.length-1; i>=0; i--) {
            if (obj == reprStack.get(i)) return false;
        }
        reprStack.append(obj);
        return true;
    }
    
    public void exitRepr(PyObject obj) {
        if (reprStack == null) return;

		for(int i = reprStack.length-1; i>=0; i--) {
			if (reprStack.get(i) == obj) {
			    reprStack.delRange(i, reprStack.length, 1);
			}
		}
    }
}
