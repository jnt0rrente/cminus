package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;
import semantic.Visitor;

public class Cast extends AbstractExpression {
    private Type castType;
    private Expression exp;

    public Cast(int line, int column, Type castType, Expression exp) {
        super(line, column);

        this.castType = castType;
        this.exp = exp;
    }

    public Expression getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return ("("+ castType +") " + exp);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
