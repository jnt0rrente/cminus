package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class IfElse extends AbstractASTNode implements Statement {
    private Expression condition;
    private List<Statement> body;
    private List<Statement> bodyElse;

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }

    public List<Statement> getBodyElse() {
        return bodyElse;
    }

    public void setBodyElse(List<Statement> bodyElse) {
        this.bodyElse = bodyElse;
    }

    public IfElse(int line, int row, Expression condition, List<Statement> body, List<Statement> bodyElse) {
        super(line, row);

        this.condition = condition;
        this.body = body;
        this.bodyElse = bodyElse;
    }

    public IfElse(int line, int row, Expression condition, List<Statement> body) {
        super(line, row);

        this.condition = condition;
        this.body = body;
        this.bodyElse = new ArrayList<Statement>();
    }

    @Override
    public String toString() {
        if (bodyElse.size() != 0) {
            return "if (" + condition + ") { body - size " + body.size() + "} else {Body - size " + bodyElse.size() + "}";
        } else {
            return "if (" + condition + ") { body - size " + body.size() + "}";
        }
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
