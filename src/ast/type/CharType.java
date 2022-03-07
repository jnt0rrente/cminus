package ast.type;

import ast.AbstractASTNode;
import ast.Type;

public class CharType extends AbstractASTNode implements Type {
    public CharType(int line, int column) {
        super(line, column);

    }

    @Override
    public String toString() {
        return "Char builtin";
    }
}
