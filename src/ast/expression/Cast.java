package ast.expression;

import ast.Expression;
import ast.Type;
import semantic.Visitor;

public class Cast extends AbstractExpression {
    private Type castType;
    private Expression expression;

    public Cast(int line, int column, Type castType, Expression expression) {
        super(line, column);

        this.castType = castType;
        this.expression = expression;
    }

    public Type getCastType() {
        return castType;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return ("("+ castType +") " + expression);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
