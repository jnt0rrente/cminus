package ast.definition;

import ast.Statement;
import ast.Type;
import semantic.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<VariableDefinition> bodyVariableDefinitions;
    private List<Statement> bodyStatements;

    private Type functionType;

    public FunctionDefinition(int line, int column, String name, Type functionType,
                              List<VariableDefinition> bodyVariableDefinitions, List<Statement> bodyStatements) {
        super(line, column, name);
        this.functionType = functionType;
        this.bodyVariableDefinitions = bodyVariableDefinitions;
        this.bodyStatements = bodyStatements;
    }

    public List<Statement> getBodyStatements() {
        return bodyStatements;
    }

    public List<VariableDefinition> getBodyVariableDefinitions() {
        return bodyVariableDefinitions;
    }

    @Override
    public String toString() {
        return "Function definition: [name: "+ getName()+", " + bodyVariableDefinitions.size()+" variables, "+bodyStatements.size()+" statements, type: " + functionType.toString() + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }
}
