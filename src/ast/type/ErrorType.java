package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import errorhandler.ErrorHandler;
import semantic.Visitor;

public class ErrorType extends AbstractASTNode implements Type {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "Error (" + getLine() + ":" + getColumn() + "): " + this.message;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return null;
    }
}
