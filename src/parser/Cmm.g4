grammar Cmm;	

@header {
	import ast.*;
	import ast.definition.*;
	import ast.expression.*;
	import ast.statement.*;
	import ast.type.*;
}

program:
		(variable_definition|function_definition)*  'void' 'main' '('  ')' '{' function_body '}' EOF
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
	| id=ID {$ast = new Variable($id.getLine(), $id.getCharPositionInLine()+1, $id.text); }
	| i1=INT_CONSTANT  {$ast = new IntLiteral($i1.getLine(), $i1.getCharPositionInLine()+1, LexerHelper.lexemeToInt($i1.text)); }
	| r1=REAL_CONSTANT {$ast = new RealLiteral($r1.getLine(), $r1.getCharPositionInLine()+1, LexerHelper.lexemeToReal($r1.text)); }
	| c1=CHAR_CONSTANT {$ast = new CharLiteral($c1.getLine(), $c1.getCharPositionInLine()+1, LexerHelper.lexemeToChar($c1.text)); }
	;

function_invocation returns [Expression ast]:
	ID '(' a1=arguments {$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text,
			$a1.ast);} ')'
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
    '{' (s1=statement {$ast.add($s1.ast);})* '}'
	| s1=statement {$ast.add($s1.ast);}
	;

procedure_invocation returns [FunctionInvocation ast]:
	ID '(' a1=arguments {$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text,
    			$a1.ast);} ')'
    ;

arguments returns [List<Expression> ast = new ArrayList<Expression>()]:
	e1=expression {$ast.add($e1.ast);} (',' e2=expression {$ast.add($e2.ast);})*
	|
	;


//Type
type returns [Type ast]: builtin_type
	| 'struct' '{' record_field* '}'//structs can be empty
	| type '[' INT_CONSTANT ']'
	;

builtin_type returns [Type ast]: 'int'
	| 'double'
	| 'char'
	;

record_field: type (ID (',' ID)*) ';' //refactored for clarity
	;


//Definition
variable_definition: type (ID (',' ID)*) ';'
	;

function_definition: (builtin_type|'void') ID      '(' (type ID(',' type ID)*)? ')'        '{' function_body '}'
	;

function_body: variable_definition* statement*
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