package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;

public class Assignment extends AbstractASTNode implements Statement {
    private Expression exp1;
    private Expression exp2;

    public Assignment(int line, int column, Expression exp1, Expression exp2) {
        super(line, column);
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
