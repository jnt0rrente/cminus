package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class Indexing extends AbstractASTNode implements Expression {

    private Expression index;
    private Expression array;

    public Indexing(int line, int column, Expression array, Expression index) {
        super(line, column);

        this.array = array;
        this.index = index;
    }
}
