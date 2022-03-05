package ast.statement;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;

import java.util.ArrayList;
import java.util.List;

public class IfElse extends AbstractASTNode implements Statement {
    private Expression condition;
    private List<Statement> body;
    private List<Statement> bodyElse;

    public IfElse(int line, int row, Expression condition, List<Statement> body, List<Statement> bodyElse){
        super(line, row);

        this.condition = condition;
        this.body = body;
        this.bodyElse = bodyElse;
    }

    public IfElse(int line, int row, Expression condition, List<Statement> body){
        super(line, row);

        this.condition = condition;
        this.body = body;
        this.bodyElse = new ArrayList<Statement>();
    }


}
