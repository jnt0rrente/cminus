package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import ast.definition.VariableDefinition;
import semantic.Visitor;

import java.util.List;

public class FunctionType extends AbstractASTNode implements Type {
    private List<VariableDefinition> parameterVariableDefinitions;
    private Type returnType;

    public FunctionType(int line, int column, Type type, List<VariableDefinition> parameterVariableDefinitions) {
        super(line, column);
        this.parameterVariableDefinitions = parameterVariableDefinitions;
        this.returnType = type;
    }

    @Override
    public String toString() {
        return "Function: " + parameterVariableDefinitions.size() + " parameters, returns " + returnType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    public List<VariableDefinition> getParameterVariableDefinitions() {
        return parameterVariableDefinitions;
    }

    public Type getReturnType() {
        return returnType;
    }
}
