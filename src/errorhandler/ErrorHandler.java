package errorhandler;

import ast.AbstractASTNode;
import ast.type.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler instance = new ErrorHandler();
    private List<ErrorType> errors = new ArrayList<ErrorType>();

    private ErrorHandler() {}
    public static ErrorHandler getInstance() {
        return instance;
    }

    public boolean anyErrors() {
        return errors.size() > 0;
    }

    public void showErrors(PrintStream err) {
        errors.forEach(err::println);
    }

    public void addError(ErrorType e) {
        errors.add(e);
    }

    public void showErrorsSorted(PrintStream err) {
        errors.sort(Comparator.comparingInt(AbstractASTNode::getLine));
        errors.forEach(err::println);
    }
}
