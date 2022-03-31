package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import ast.definition.VariableDefinition;
import semantic.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
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
        return v.visit(this, param);
    }

    public List<VariableDefinition> getParameterVariableDefinitions() {
        return parameterVariableDefinitions;
    }

    public Type getReturnType() {
        return returnType;
    }

    @Override
    public Type parentheses(List<Type> argTypes) {
        if (argTypes.size() != getParameterVariableDefinitions().size())
            return new ErrorType(this.getLine(), this.getColumn(), "Wrong arguments size for function call.");
        else {
            List<VariableDefinition> declaredParams = getParameterVariableDefinitions();
            for (int i = 0; i < argTypes.size(); i++) {
                if (argTypes.get(i).getClass() != declaredParams.get(i).getType().getClass()) {
                    return new ErrorType(this.getLine(), this.getColumn(),
                            "Wrong type on parameter " + i + ":"
                                    + " Expected " + declaredParams.get(i).getType().getClass().getSimpleName()
                                    + " but got " + argTypes.get(i));
                }
            }
        }
        return getReturnType();
    }

    @Override
    public String getTypeName() {
        return "FunctionType";
    }

}
