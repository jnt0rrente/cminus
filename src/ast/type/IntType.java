package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

public class IntType extends AbstractASTNode implements Type {
    public IntType(int line, int column) {
        super(line, column);

    }

    @Override
    public String toString() {
        return "Int builtin";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return null;
    }
}
