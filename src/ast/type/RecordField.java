package ast.type;

import ast.AbstractASTNode;
import ast.Type;

public class RecordField {
    private String name;
    private Type type;

    public RecordField(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "record field: " + type + " " + name;
    }
}
