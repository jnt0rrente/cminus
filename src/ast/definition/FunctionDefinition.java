package ast.definition;

import ast.Statement;
import ast.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<VariableDefinition> bodyVariables;
    private List<Statement> bodyStatements;

    private Type functionType;

    public FunctionDefinition(int line, int column, String name, Type functionType,
                              List<VariableDefinition> bodyVariables, List<Statement> bodyStatements) {
        super(line, column, name);
        this.functionType = functionType;
        this.bodyVariables = bodyVariables;
        this.bodyStatements = bodyStatements;
    }

    @Override
    public String toString() {
        return "Function definition: [name: "+ getName()+", " +bodyVariables.size()+" variables, "+bodyStatements.size()+" statements, type: " + functionType.toString() + "]";
    }
}
