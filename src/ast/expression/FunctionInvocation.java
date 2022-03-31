package ast.expression;

import ast.Expression;
import ast.Statement;
import ast.Type;
import semantic.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {
    private Variable variable;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column, Variable name, List<Expression> parameters) {
        super(line, column);
        this.variable = name;
        this.parameters = parameters;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public Variable getVariable() {
        return variable;
    }

    @Override
    public String toString() {
        return variable.toString() + "(" + parameters.size()+" parameters)";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    @Override
    public void setReturnType(Type type) {

    }

    @Override
    public Type getReturnType() {
        return null;
    }
}
