package ast.statement;

import ast.AbstractASTNode;
import ast.Statement;
import ast.Type;

public abstract class AbstractStatement extends AbstractASTNode implements Statement {

    private Type returnType;

    @Override
    public Type getReturnType() {
        return returnType;
    }

    @Override
    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public AbstractStatement(int line, int column) {
        super(line, column);
    }
}
