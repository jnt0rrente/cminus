package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Statement;
import semantic.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    private Variable name;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column, Variable name, List<Expression> parameters) {
        super(line, column);
        this.name = name;
        this.parameters = parameters;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public Variable getName() {
        return name;
    }

    @Override
    public String toString() {
        return name.toString() + "(" + parameters.size()+" parameters)";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
