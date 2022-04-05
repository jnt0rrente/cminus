package ast.definition;

import ast.*;
import ast.statement.AbstractStatement;
import semantic.Visitor;

public class VariableDefinition extends AbstractDefinition implements Statement, Definition {

    private int offset;

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    @Override
    public String toString() {
        return "Variable definition: [" + super.getType().toString() + ", name: " + getName() + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public void setReturnType(Type type) {

    }

    @Override
    public Type getReturnType() {
        return null;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
