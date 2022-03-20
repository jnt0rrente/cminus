package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

public class CharType extends AbstractASTNode implements Type {
    public CharType(int line, int column) {
        super(line, column);

    }

    @Override
    public String toString() {
        return "Char builtin";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return null;
    }
}
