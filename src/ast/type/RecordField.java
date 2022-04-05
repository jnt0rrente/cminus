package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

public class RecordField extends AbstractASTNode {
    private String name;
    private Type type;
    private int offset;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Record field: " + type + " " + name;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

}
