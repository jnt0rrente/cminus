package ast.type;

import ast.AbstractASTNode;
import ast.Type;

public class ErrorType extends AbstractASTNode implements Type {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
    }

    @Override
    public String toString() {
        return "Error (" + getLine() + ":" + getColumn() + "): " + this.message;
    }

}
