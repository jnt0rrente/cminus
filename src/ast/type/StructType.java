package ast.type;

import ast.AbstractASTNode;
import ast.Type;

import java.util.List;

public class StructType extends AbstractASTNode implements Type {
    List<RecordField> records;

    public StructType(int line, int column, List<RecordField> records) {
        super(line, column);
        this.records = records;
    }


    @Override
    public String toString() {
        return "struct: " + records.size() + " records";
    }
}

