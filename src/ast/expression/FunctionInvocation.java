package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractASTNode implements Expression, Statement {
    private Variable name;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column, Variable name, List<Expression> parameters) {
        super(line, column);
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return name.toString() + "(" + parameters.size()+" parameters)";
    }
}
