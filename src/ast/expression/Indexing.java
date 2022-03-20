package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import semantic.Visitor;

public class Indexing extends AbstractExpression {

    private Expression index;
    private Expression array;

    public Indexing(int line, int column, Expression array, Expression index) {
        super(line, column);

        this.array = array;
        this.index = index;
    }

    public Expression getIndex() {
        return index;
    }

    public Expression getArray() {
        return array;
    }

    @Override
    public String toString() {
        return array+"["+index+"]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }
}
