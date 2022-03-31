package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

public class VoidType extends AbstractType {
    public VoidType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Void builtin";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public String getTypeName() {
        return "VoidType";
    }
}