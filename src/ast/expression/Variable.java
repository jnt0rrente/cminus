package ast.expression;

import ast.Definition;
import semantic.Visitor;

public class Variable extends AbstractExpression {

    private Definition definition;
    private String identifier;

    public Variable(int line, int column, String identifier) {
        super(line, column);
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this, param);
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;

        setType(getDefinition().getType());
    }

    public Definition getDefinition() {
        return definition;
    }

}
