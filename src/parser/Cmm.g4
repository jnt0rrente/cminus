grammar Cmm;	

program: (CHAR_CONSTANT|WS|INT_CONSTANT|MULTI_LINE_COMMENT|REAL_CONSTANT|ID|SINGLE_LINE_COMMENT)*EOF
       ;

expression:
	| '(' expression ')'
	| expression '[' expression ']'
	| expression '.' ID
	| '(' 'type' ')' expression
	| '-' expression
	| '!' expression
	| expression ('*'|'/'|'%') expression
	| expression ('+'|'-') expression
	| expression ('>'|'>='|'<'|'<='|'!='|'==') expression
	| expression ('&&'|'||') expression
	| INT_CONSTANT
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