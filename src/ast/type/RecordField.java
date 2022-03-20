package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

public class RecordField extends AbstractASTNode {
    private String name;
    private Type type;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
