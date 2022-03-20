package ast.type;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StructType extends AbstractASTNode implements Type {
    List<RecordField> records;

    public StructType(int line, int column, List<RecordField> records) {
        super(line, column);

        if (!checkRecords(records)) {
            new ErrorType(line, column, "repeated record field");
        }

        this.records = records;
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
        return null;
    }
}

