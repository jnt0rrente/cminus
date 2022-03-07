package ast.type;

import ast.AbstractASTNode;
import ast.Type;

public class ArrayType extends AbstractASTNode implements Type {
    public int size;
    public Type elementType;

    public ArrayType(int line, int column, int size, Type elementType) {
        super(line,column);
        this.size = size;
        this.elementType = elementType;
    }

    @Override
    public String toString() {
        return "Array [type: " + elementType + " size: " + size+"]";
    }
}
