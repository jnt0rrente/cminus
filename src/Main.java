import ast.*;
import codegeneration.*;
import errorhandler.ErrorHandler;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import parser.*;

import org.antlr.v4.runtime.*;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;
import semantic.symboltable.SymbolTable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {

    public static void main(String... args) throws Exception {
        if (args.length < 1) {
            System.err.println("Please, pass me the input file.");
            return;
        }
        if (args.length < 2) {
            System.err.println("Please, pass me the output file.");
            return;
        }

        // create a lexer that feeds off of input CharStream
        CharStream input = CharStreams.fromFileName(args[0]);
        CmmLexer lexer = new CmmLexer(input);

        // create a parser that feeds off the tokens buffer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmmParser parser = new CmmParser(tokens);

        Program ast = parser.program().ast;

        ast.accept(new IdentificationVisitor(), new SymbolTable());
        ast.accept(new TypeCheckingVisitor(), null);
        ast.accept(new OffsetVisitor(), null);

        if (ErrorHandler.getInstance().anyErrors())
            ErrorHandler.getInstance().showErrors(System.err);

//        else {
//            IntrospectorModel model = new IntrospectorModel("Program", ast);
//            new IntrospectorTree("Introspector", model);
//        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
        CodeGenerator codeGenerator = CodeGenerator.getInstance();
        codeGenerator.setParams(bw, args[0]);

        AddressCGVisitor addressCGVisitor = new AddressCGVisitor();
        ValueCGVisitor valueCGVisitor = new ValueCGVisitor(addressCGVisitor);
        addressCGVisitor.setValueCGVisitor(valueCGVisitor);
        ExecuteCGVisitor executeCGVisitor = new ExecuteCGVisitor(addressCGVisitor, valueCGVisitor);

        ast.accept(executeCGVisitor, null);
        bw.close();
    }


}
