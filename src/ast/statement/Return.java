package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;

public class Return extends AbstractASTNode implements Statement {
    private Expression returnValue;

    public Return(int line, int column, Expression returnValue) {
        super(line, column);
        this.returnValue = returnValue;
    }
}
