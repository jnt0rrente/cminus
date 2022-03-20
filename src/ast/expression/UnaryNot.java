package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import semantic.Visitor;

public class UnaryNot extends AbstractExpression {
    Expression target;

    public UnaryNot(int row, int column, Expression exp) {
        super(row,column);
        this.target = exp;
    }

    public Expression getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return ("-" + target);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
