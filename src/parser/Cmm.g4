grammar Cmm;	

@header {
	import ast.*;
	import ast.definition.*;
	import ast.expression.*;
	import ast.statement.*;
	import ast.type.*;
}

program returns [Program ast]:
		d1=programDefinitions
		m1=main_function_definition
		{$ast = new Program(0,0, $d1.ast, $m1.ast);}
		EOF
       ;

programDefinitions returns [List<Definition> ast = new ArrayList<Definition>()]:
	((v1=variable_definition {
		for (Definition d : $v1.ast) $ast.add(d);
	})|(f1=function_definition{
		$ast.add($f1.ast);
	}))*
	;

// {$ast = new Expression($e1.ast.getLine(), $e1.start.getCharPositionInLine()+1, );}
//Expression
expression returns [Expression ast]:
	  '(' e1=expression {$ast = $e1.ast;} ')'
	| e1=expression '[' e2=expression ']' {$ast = new Indexing($e1.ast.getLine(), $e1.ast.getColumn(),
			$e1.ast, $e2.ast); }
	| e1=expression '.' ID {$ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(),
			$ID.text, $e1.ast);}
	| '(' b1=builtin_type ')' e1=expression {$ast = new Cast($b1.ast.getLine(), $b1.ast.getColumn(),
			$b1.ast, $e1.ast);}
	| '-' e1=expression {$ast = new UnaryMinus($e1.ast.getLine(), $e1.ast.getColumn(),
            $e1.ast);}
	| '!' e1=expression {$ast = new UnaryNot($e1.ast.getLine(), $e1.ast.getColumn(),
			$e1.ast);}
	| e1=expression op=('*'|'/'|'%') e2=expression {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(),
			LexerHelper.lexemeToChar($op.text), $e1.ast, $e2.ast);}
	| e1=expression op=('+'|'-') e2=expression {$ast = new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(),
			LexerHelper.lexemeToChar($op.text), $e1.ast, $e2.ast);}
	| e1=expression op=('>'|'>='|'<'|'<='|'!='|'==') e2=expression {$ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(),
			$op.text, $e1.ast, $e2.ast);}
	| e1=expression op=('&&'|'||') e2=expression {$ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(),
			$op.text, $e1.ast, $e2.ast);}
	| f1=function_invocation {$ast = $f1.ast;}
	| id=variable {$ast = $id.ast;}
	| i1=INT_CONSTANT  {$ast = new IntLiteral($i1.getLine(), $i1.getCharPositionInLine()+1, LexerHelper.lexemeToInt($i1.text)); }
	| r1=REAL_CONSTANT {$ast = new RealLiteral($r1.getLine(), $r1.getCharPositionInLine()+1, LexerHelper.lexemeToReal($r1.text)); }
	| c1=CHAR_CONSTANT {$ast = new CharLiteral($c1.getLine(), $c1.getCharPositionInLine()+1, LexerHelper.lexemeToChar($c1.text)); }
	;

variable returns [Variable ast]:
	id=ID {$ast = new Variable($id.getLine(), $id.getCharPositionInLine()+1, $id.text); }
	;

function_invocation returns [Expression ast]:
	e1=variable '(' a1=arguments {$ast = new FunctionInvocation($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $a1.ast);} ')'
	;

//Statement
statement returns [Statement ast]:
	e1=expression '=' e2=expression ';' {$ast = new Assignment($e1.ast.getLine(), $e1.ast.getColumn(),
		$e1.ast, $e2.ast);}
	| 'while' '(' e1=expression ')' b1=block {$ast = new WhileLoop($e1.ast.getLine(), $e1.ast.getColumn(),
		$e1.ast, $b1.ast);}
	| 'if' '(' e1=expression ')' b1=block 'else' b2=block {$ast = new IfElse($e1.ast.getLine(), $e1.ast.getColumn(),
		$e1.ast, $b1.ast, $b2.ast);}
	| 'if' '(' e1=expression ')' b1=block{$ast = new IfElse($e1.ast.getLine(), $e1.ast.getColumn(),
		$e1.ast, $b1.ast);}
	| 'return' e1=expression {$ast = new Return($e1.ast.getLine(), $e1.ast.getColumn(),
		$e1.ast);} ';'
	| s='read' r1=readWriteBlock {$ast = new Read($s.getLine(), $s.getCharPositionInLine()+1, $r1.ast);} ';'
	| s='write' r1=readWriteBlock {$ast = new Write($s.getLine(), $s.getCharPositionInLine()+1, $r1.ast);} ';' //write 't', 'r', 'u', 'e', '\n';
	| p1=procedure_invocation {$ast = $p1.ast;} ';'
	;

readWriteBlock returns [List<Expression> ast = new ArrayList<Expression>()]:
	(e1=expression {$ast.add($e1.ast);} (',' e2=expression {$ast.add($e2.ast);})*)
	;

block returns [List<Statement> ast = new ArrayList<Statement>()]:
    s1=statement {$ast.add($s1.ast);}
	| '{' (s1=statement {$ast.add($s1.ast);})* '}'
	;

procedure_invocation returns [FunctionInvocation ast]:
	v1=variable '(' a1=arguments {$ast = new FunctionInvocation($v1.ast.getLine(), $v1.ast.getColumn(), $v1.ast,
    			$a1.ast);} ')'
    ;

arguments returns [List<Expression> ast = new ArrayList<Expression>()]:
	e1=expression {$ast.add($e1.ast);} (',' e2=expression {$ast.add($e2.ast);})*
	|
	;

//Type
type returns [Type ast]:
	t1=type '[' e1=expression ']' {$ast = new ArrayType($t1.ast.getLine(), $t1.ast.getColumn(), $e1.ast, $t1.ast);}
		('[' e2=expression ']'{((ArrayType)$ast).setType(new ArrayType($t1.ast.getLine(), $t1.ast.getColumn(), $e2.ast, $t1.ast));})*
	| b1=builtin_type {$ast = $b1.ast;}
	| s1=struct_type {$ast = $s1.ast;}
	;

returnable_type returns [Type ast]:
	b1=builtin_type {$ast = $b1.ast;}
	| s='void' {$ast = new VoidType($s.getLine(), $s.getCharPositionInLine()+1);}
	;

struct_type returns [StructType ast]:
	s1='struct' '{' b2=struct_body '}' {$ast = new StructType($s1.getLine(), $s1.getCharPositionInLine()+1, $b2.ast);}
	;

builtin_type returns [Type ast]: s='int' {$ast = new IntType($s.getLine(), $s.getCharPositionInLine()+1);}
	| s='double'{$ast = new DoubleType($s.getLine(), $s.getCharPositionInLine()+1);}
	| s='char'{$ast = new CharType($s.getLine(), $s.getCharPositionInLine()+1);}
	;

struct_body returns [List<RecordField> ast = new ArrayList<RecordField>()]:
	(r1=record_field_line{for (RecordField r : $r1.ast) $ast.add(r);})*
	;

record_field_line returns [List<RecordField> ast = new ArrayList<RecordField>()]: //for the "int a, b, c" case
	t1=type (i1=ID {$ast.add(new RecordField($t1.ast.getLine(), $t1.ast.getColumn(), $i1.text, $t1.ast));}
     (',' i2=ID {$ast.add(new RecordField($i2.getLine(), $i2.getCharPositionInLine()+1, $i2.text, $t1.ast));})*) ';'
	;

//definition
definition returns [List<Definition> ast = new ArrayList<Definition>()]:
	v1=variable_definition {for (Definition d : $v1.ast) $ast.add(d);}
	| f1=function_definition {$ast.add($f1.ast);}
	;

variable_definition returns [List<VariableDefinition> ast = new ArrayList<VariableDefinition>()]:
	t1=type (i1=ID {$ast.add(new VariableDefinition($t1.ast.getLine(), $t1.ast.getColumn(), $i1.text, $t1.ast));}
         (',' i2=ID {$ast.add(new VariableDefinition($t1.ast.getLine(), $t1.ast.getColumn(), $i2.text, $t1.ast));})*) ';'
    ;

function_definition returns [FunctionDefinition ast]:
	(r1=returnable_type) i1=ID
	'(' f1=function_definition_parameter_declaration ')'
	'{'
		b1=function_definition_body_variables
		b2=function_definition_body_statements
	'}'
	{$ast = new FunctionDefinition(
		$r1.ast.getLine(),
		$r1.ast.getColumn(),
		$i1.text,
		new FunctionType(
			$r1.ast.getLine(),
			$r1.ast.getColumn(),
			$r1.ast,
			$f1.ast),
		$b1.ast,
		$b2.ast);}
	;

function_definition_parameter_declaration returns [List<VariableDefinition> ast = new ArrayList<VariableDefinition>()]:
	(t1=type i1=ID {$ast.add(new VariableDefinition($t1.ast.getLine(), $t1.ast.getColumn(), $i1.text, $t1.ast));}
	(',' t2=type i2=ID {$ast.add(new VariableDefinition($t2.ast.getLine(), $t2.ast.getColumn(), $i2.text, $t2.ast));})*)
	|
	;

function_definition_body_variables returns [List<VariableDefinition> ast = new ArrayList<VariableDefinition>()] :
		(v1=variable_definition {for (VariableDefinition d : $v1.ast) $ast.add(d);})* //Interface or concrete type?
	;

function_definition_body_statements returns [List<Statement> ast = new ArrayList<Statement>()]:
		(s1=statement{$ast.add($s1.ast);})*
	;

main_function_definition returns [FunctionDefinition ast]:
	v1='void' m1='main' '('  ')' '{'
	    b1=function_definition_body_variables
    	b2=function_definition_body_statements
	'}'

	{$ast = new FunctionDefinition(
		$v1.getLine(),
		$v1.getCharPositionInLine()+1,
		$m1.text,
		new FunctionType( //tried to refactor this, did not work
        		$v1.getLine(),
        		$v1.getCharPositionInLine()+1,
        	    new VoidType($v1.getLine(), $v1.getCharPositionInLine()+1),
        	    new ArrayList<VariableDefinition>()
        	    ),
		$b1.ast,
		$b2.ast);}
	;

WS: [ \n\t\r]+ -> skip
	;

ID: [a-zA-Z_][a-zA-Z0-9_]*
    ;

INT_CONSTANT: '0'
            | [1-9][0-9]*
            ;

CHAR_CONSTANT: '\''.'\''
            | '\'\\\''
            | '\'\\\'\''
            | '\'\\'INT_CONSTANT'\''
            | '\'\\'[ntr]'\''
            ;

REAL_CONSTANT: (REAL_CONSTANT_MANTISSA|INT_CONSTANT) ([eE]   ('-'|'+')?  INT_CONSTANT)?
			;

REAL_CONSTANT_MANTISSA: INT_CONSTANT '.'
            | '.' [0-9]+
            | INT_CONSTANT '.' [0-9]+
            ;

MULTI_LINE_COMMENT: '/*'.*?'*/' -> skip;


SINGLE_LINE_COMMENT: '//'.*?('\n'|EOF) -> skip;