package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;

public class Cast extends AbstractASTNode implements Expression {
    private Type type;
    private Expression exp;

    public Cast(int line, int column, Type type, Expression exp) {
        super(line, column);

        this.type = type;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return ("("+ type +") " + exp);
    }
}
