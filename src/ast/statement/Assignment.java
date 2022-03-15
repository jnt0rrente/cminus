package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;

public class Assignment extends AbstractASTNode implements Statement {
    private Expression lhs;
    private Expression rhs;

    public Assignment(int line, int column, Expression lhs, Expression rhs) {
        super(line, column);
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public String toString() {
        return lhs.toString() + " = " + rhs.toString();
    }

    public Expression getLHS() {
        return lhs;
    }

    public Expression getRHS() {
        return rhs;
    }
}
