package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class WhileLoop extends AbstractASTNode implements Statement {
    private Expression condition;
    private List<Statement> body;

    public WhileLoop(int line, int row, Expression condition, List<Statement> body){
        super(line, row);

        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "while ("+ condition+") { body - size " + body.size() + "}";
    }
}
