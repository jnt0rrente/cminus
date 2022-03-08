package errorhandler;

import ast.type.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private ErrorHandler instance = new ErrorHandler();
    private List<ErrorType> errors = new ArrayList<ErrorType>();

    private ErrorHandler() {};
    public ErrorHandler getInstance() {
        return instance;
    }

    public boolean anyError() {
        return errors.size() > 0;
    }

    public void showErrors(PrintStream out) {
        errors.forEach(out::println);
    }

    public void addError(ErrorType e) {
        errors.add(e);
    }
}
