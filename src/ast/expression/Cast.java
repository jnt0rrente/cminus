package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;

public class Cast extends AbstractASTNode implements Expression {
    private Type castType;
    private Expression exp;

    public Cast(int line, int column, Type castType, Expression exp) {
        super(line, column);

        this.castType = castType;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return ("("+ castType +") " + exp);
    }
}
