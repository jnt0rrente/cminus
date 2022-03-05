package ast.type;

import ast.AbstractASTNode;
import ast.Type;

public class IntType extends AbstractASTNode implements Type {
    public IntType(int line, int column) {
        super(line, column);

    }
}
