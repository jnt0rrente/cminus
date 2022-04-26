package ast.expression;

import ast.Expression;
import ast.type.RecordField;
import ast.type.StructType;
import semantic.Visitor;

public class FieldAccess extends AbstractExpression {
    private String name;
    private Expression expression;

    public FieldAccess(int line, int column, String name, Expression expression) {
        super(line,column);

        this.name = name;
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return expression + "." + name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    public RecordField getSpecificRecord() {
        return ((StructType) expression.getType()).getRecord(name);
    }
}
