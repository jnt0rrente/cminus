package ast.definition;

import ast.*;
import semantic.Visitor;

public class VariableDefinition extends AbstractDefinition implements Expression, Definition {
    private Type type;

    public VariableDefinition(int line, int column, String name, Type type) {
        super(line, column, name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Variable definition: [" + type.toString() + ", name: " + getName() + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return null;
    }

    @Override
    public boolean getLvalue() {
        return false;
    }

    @Override
    public void setLvalue(boolean lvalue) {

    }
}
