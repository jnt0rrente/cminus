package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractASTNode implements Expression, Statement {
    private String name;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column, String name, List<Expression> parameters) {
        super(line, column);
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return name + "(" + parameters.size()+" parameters)";
    }
}
