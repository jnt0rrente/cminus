package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StructType extends AbstractType {
    List<RecordField> records;

    public StructType(int line, int column, List<RecordField> records) {
        super(line, column);

        if (!checkRecords(records)) {
            new ErrorType(line, column, "repeated record field");
        }

        this.records = records;
    }

    public List<RecordField> getRecords() {
        return records;
    }

    @Override
    public String toString() {
        return "Struct: " + records.size() + " records";
    }

    public boolean checkRecords(List<RecordField> records) {
        List<String> names = new ArrayList<String>();

        for (RecordField r : records) {
            if (names.contains(r.getName())) {
                //new ErrorType(getLine(), getColumn(), "Repeated record field \"" + r.getName() + "\"");
                return false;
            } else {
                names.add(r.getName());
            }
        }

        return true;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP param) {
        return v.visit(this,param);
    }

    @Override
    public Type dot(String name) {
        for (RecordField r : getRecords()) {
            if (r.getName().equals(name)) {
                return r.getType();
            }
        }

        return new ErrorType(0,0, String.format("Field %s does not exist.", name));
    }

    @Override
    public String getTypeName() {
        return "StructType";
    }
}

