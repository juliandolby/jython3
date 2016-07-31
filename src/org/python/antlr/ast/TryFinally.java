// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.Token;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.base.stmt;
import org.python.core.ArgParser;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyUnicode;
import org.python.core.PyStringMap;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;

import java.util.ArrayList;

@ExposedType(name = "_ast.TryFinally", base = stmt.class)
public class TryFinally extends stmt {
public static final PyType TYPE = PyType.fromClass(TryFinally.class);
    private java.util.List<stmt> body;
    public java.util.List<stmt> getInternalBody() {
        return body;
    }
    @ExposedGet(name = "body")
    public PyObject getBody() {
        return new AstList(body, AstAdapters.stmtAdapter);
    }
    @ExposedSet(name = "body")
    public void setBody(PyObject body) {
        this.body = AstAdapters.py2stmtList(body);
    }

    private java.util.List<stmt> finalbody;
    public java.util.List<stmt> getInternalFinalbody() {
        return finalbody;
    }
    @ExposedGet(name = "finalbody")
    public PyObject getFinalbody() {
        return new AstList(finalbody, AstAdapters.stmtAdapter);
    }
    @ExposedSet(name = "finalbody")
    public void setFinalbody(PyObject finalbody) {
        this.finalbody = AstAdapters.py2stmtList(finalbody);
    }


    private final static PyUnicode[] fields =
    new PyUnicode[] {new PyUnicode("body"), new PyUnicode("finalbody")};
    @ExposedGet(name = "_fields")
    public PyUnicode[] get_fields() { return fields; }

    private final static PyUnicode[] attributes =
    new PyUnicode[] {new PyUnicode("lineno"), new PyUnicode("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyUnicode[] get_attributes() { return attributes; }

    public TryFinally(PyType subType) {
        super(subType);
    }
    public TryFinally() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void TryFinally___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("TryFinally", args, keywords, new String[]
            {"body", "finalbody", "lineno", "col_offset"}, 2, true);
        setBody(ap.getPyObject(0, Py.None));
        setFinalbody(ap.getPyObject(1, Py.None));
        int lin = ap.getInt(2, -1);
        if (lin != -1) {
            setLineno(lin);
        }

        int col = ap.getInt(3, -1);
        if (col != -1) {
            setLineno(col);
        }

    }

    public TryFinally(PyObject body, PyObject finalbody) {
        setBody(body);
        setFinalbody(finalbody);
    }

    public TryFinally(Token token, java.util.List<stmt> body, java.util.List<stmt> finalbody) {
        super(token);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmt>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.finalbody = finalbody;
        if (finalbody == null) {
            this.finalbody = new ArrayList<stmt>();
        }
        for(PythonTree t : this.finalbody) {
            addChild(t);
        }
    }

    public TryFinally(Integer ttype, Token token, java.util.List<stmt> body, java.util.List<stmt>
    finalbody) {
        super(ttype, token);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmt>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.finalbody = finalbody;
        if (finalbody == null) {
            this.finalbody = new ArrayList<stmt>();
        }
        for(PythonTree t : this.finalbody) {
            addChild(t);
        }
    }

    public TryFinally(PythonTree tree, java.util.List<stmt> body, java.util.List<stmt> finalbody) {
        super(tree);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmt>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.finalbody = finalbody;
        if (finalbody == null) {
            this.finalbody = new ArrayList<stmt>();
        }
        for(PythonTree t : this.finalbody) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "TryFinally";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("TryFinally(");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("finalbody=");
        sb.append(dumpThis(finalbody));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitTryFinally(this);
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (finalbody != null) {
            for (PythonTree t : finalbody) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    public PyObject __dict__;

    @Override
    public PyObject fastGetDict() {
        ensureDict();
        return __dict__;
    }

    @ExposedGet(name = "__dict__")
    public PyObject getDict() {
        return fastGetDict();
    }

    private void ensureDict() {
        if (__dict__ == null) {
            __dict__ = new PyStringMap();
        }
    }

    private int lineno = -1;
    @ExposedGet(name = "lineno")
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    @ExposedSet(name = "lineno")
    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    @ExposedGet(name = "col_offset")
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    @ExposedSet(name = "col_offset")
    public void setCol_offset(int num) {
        col_offset = num;
    }

}
