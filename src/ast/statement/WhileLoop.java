package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;
import semantic.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getBody() {
        return body;
    }
}
