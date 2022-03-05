package ast.definition;

import ast.Statement;
import ast.Type;

public class FunctionDefinition extends AbstractDefinition {

    private Statement[] body;
    private Type functionType;

    public FunctionDefinition(int line, int column, String name, Type functionType, Statement...body) {
        super(line, column, name);
        this.body = body;
        this.functionType = functionType;
    }
}
