package ast.type;

import ast.AbstractASTNode;
import ast.Type;

public class StructType extends AbstractASTNode implements Type {
    RecordField[] records;

    public StructType(int line, int column, RecordField...records) {
        super(line, column);
        this.records = records;
    }

    public class RecordField {
        private String name;
        private Type type;

        public RecordField(String name, Type type) {
            this.name = name;
            this.type = type;
        }
    }

}

