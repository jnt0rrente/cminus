package ast.type;

import ast.AbstractASTNode;
import ast.Type;

public class VoidType extends AbstractASTNode implements Type {
    public VoidType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "void type";
    }
}