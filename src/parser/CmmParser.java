// Generated from /home/rhean/files/clase/dlp/project/src/parser/Cmm.g4 by ANTLR 4.9.2
package parser;

	import ast.*;
	import ast.definition.*;
	import ast.expression.*;
	import ast.statement.*;
	import ast.type.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, WS=37, ID=38, INT_CONSTANT=39, 
		CHAR_CONSTANT=40, REAL_CONSTANT=41, REAL_CONSTANT_MANTISSA=42, MULTI_LINE_COMMENT=43, 
		SINGLE_LINE_COMMENT=44;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_function_invocation = 2, RULE_statement = 3, 
		RULE_readWriteBlock = 4, RULE_block = 5, RULE_procedure_invocation = 6, 
		RULE_arguments = 7, RULE_type = 8, RULE_builtin_type = 9, RULE_struct_body = 10, 
		RULE_record_field_line = 11, RULE_variable_definition = 12, RULE_function_definition = 13, 
		RULE_function_body = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "function_invocation", "statement", "readWriteBlock", 
			"block", "procedure_invocation", "arguments", "type", "builtin_type", 
			"struct_body", "record_field_line", "variable_definition", "function_definition", 
			"function_body"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'main'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", 
			"'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", 
			"'!='", "'=='", "'&&'", "'||'", "'='", "';'", "'while'", "'if'", "'else'", 
			"'return'", "'read'", "'write'", "','", "'struct'", "'int'", "'double'", 
			"'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "REAL_CONSTANT_MANTISSA", 
			"MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(32);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(30);
						variable_definition();
						}
						break;
					case 2:
						{
						setState(31);
						function_definition();
						}
						break;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(37);
			match(T__0);
			setState(38);
			match(T__1);
			setState(39);
			match(T__2);
			setState(40);
			match(T__3);
			setState(41);
			match(T__4);
			setState(42);
			function_body();
			setState(43);
			match(T__5);
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public Builtin_typeContext b1;
		public Function_invocationContext f1;
		public Token id;
		public Token i1;
		public Token r1;
		public Token c1;
		public Token op;
		public ExpressionContext e2;
		public Token ID;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Builtin_typeContext builtin_type() {
			return getRuleContext(Builtin_typeContext.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(47);
				match(T__2);
				setState(48);
				((ExpressionContext)_localctx).e1 = expression(0);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast;
				setState(50);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(52);
				match(T__2);
				setState(53);
				((ExpressionContext)_localctx).b1 = builtin_type();
				setState(54);
				match(T__3);
				setState(55);
				((ExpressionContext)_localctx).e1 = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).b1.ast.getLine(), ((ExpressionContext)_localctx).b1.ast.getColumn(),
							((ExpressionContext)_localctx).b1.ast, ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 3:
				{
				setState(58);
				match(T__9);
				setState(59);
				((ExpressionContext)_localctx).e1 = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
				            ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 4:
				{
				setState(62);
				match(T__10);
				setState(63);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
							((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 5:
				{
				setState(66);
				((ExpressionContext)_localctx).f1 = function_invocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).f1.ast;
				}
				break;
			case 6:
				{
				setState(69);
				((ExpressionContext)_localctx).id = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).id.getLine(), ((ExpressionContext)_localctx).id.getCharPositionInLine()+1, (((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null)); 
				}
				break;
			case 7:
				{
				setState(71);
				((ExpressionContext)_localctx).i1 = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).i1.getLine(), ((ExpressionContext)_localctx).i1.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i1!=null?((ExpressionContext)_localctx).i1.getText():null))); 
				}
				break;
			case 8:
				{
				setState(73);
				((ExpressionContext)_localctx).r1 = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).r1.getLine(), ((ExpressionContext)_localctx).r1.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).r1!=null?((ExpressionContext)_localctx).r1.getText():null))); 
				}
				break;
			case 9:
				{
				setState(75);
				((ExpressionContext)_localctx).c1 = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).c1.getLine(), ((ExpressionContext)_localctx).c1.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c1!=null?((ExpressionContext)_localctx).c1.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(80);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						((ExpressionContext)_localctx).e2 = expression(10);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
						          			LexerHelper.lexemeToChar((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(85);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__14) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						((ExpressionContext)_localctx).e2 = expression(9);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
						          			LexerHelper.lexemeToChar((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null)), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(90);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						((ExpressionContext)_localctx).e2 = expression(8);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
						          			(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(95);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						((ExpressionContext)_localctx).e2 = expression(7);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
						          			(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(100);
						match(T__6);
						setState(101);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(102);
						match(T__7);
						((ExpressionContext)_localctx).ast =  new Indexing(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
						          			((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(106);
						match(T__8);
						setState(107);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
						          			(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_invocationContext extends ParserRuleContext {
		public Expression ast;
		public Token ID;
		public ArgumentsContext a1;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation; }
	}

	public final Function_invocationContext function_invocation() throws RecognitionException {
		Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((Function_invocationContext)_localctx).ID = match(ID);
			setState(115);
			match(T__2);
			setState(116);
			((Function_invocationContext)_localctx).a1 = arguments();
			((Function_invocationContext)_localctx).ast =  new FunctionInvocation(((Function_invocationContext)_localctx).ID.getLine(), ((Function_invocationContext)_localctx).ID.getCharPositionInLine()+1, (((Function_invocationContext)_localctx).ID!=null?((Function_invocationContext)_localctx).ID.getText():null),
						((Function_invocationContext)_localctx).a1.ast);
			setState(118);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public BlockContext b1;
		public BlockContext b2;
		public Token s;
		public ReadWriteBlockContext r1;
		public Procedure_invocationContext p1;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ReadWriteBlockContext readWriteBlock() {
			return getRuleContext(ReadWriteBlockContext.class,0);
		}
		public Procedure_invocationContext procedure_invocation() {
			return getRuleContext(Procedure_invocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((StatementContext)_localctx).e1 = expression(0);
				setState(121);
				match(T__23);
				setState(122);
				((StatementContext)_localctx).e2 = expression(0);
				setState(123);
				match(T__24);
				((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__25);
				setState(127);
				match(T__2);
				setState(128);
				((StatementContext)_localctx).e1 = expression(0);
				setState(129);
				match(T__3);
				setState(130);
				((StatementContext)_localctx).b1 = block();
				((StatementContext)_localctx).ast =  new WhileLoop(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(T__26);
				setState(134);
				match(T__2);
				setState(135);
				((StatementContext)_localctx).e1 = expression(0);
				setState(136);
				match(T__3);
				setState(137);
				((StatementContext)_localctx).b1 = block();
				setState(138);
				match(T__27);
				setState(139);
				((StatementContext)_localctx).b2 = block();
				((StatementContext)_localctx).ast =  new IfElse(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).b2.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(T__26);
				setState(143);
				match(T__2);
				setState(144);
				((StatementContext)_localctx).e1 = expression(0);
				setState(145);
				match(T__3);
				setState(146);
				((StatementContext)_localctx).b1 = block();
				((StatementContext)_localctx).ast =  new IfElse(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(T__28);
				setState(150);
				((StatementContext)_localctx).e1 = expression(0);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast);
				setState(152);
				match(T__24);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				((StatementContext)_localctx).s = match(T__29);
				setState(155);
				((StatementContext)_localctx).r1 = readWriteBlock();
				((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).s.getLine(), ((StatementContext)_localctx).s.getCharPositionInLine()+1, ((StatementContext)_localctx).r1.ast);
				setState(157);
				match(T__24);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				((StatementContext)_localctx).s = match(T__30);
				setState(160);
				((StatementContext)_localctx).r1 = readWriteBlock();
				((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).s.getLine(), ((StatementContext)_localctx).s.getCharPositionInLine()+1, ((StatementContext)_localctx).r1.ast);
				setState(162);
				match(T__24);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				((StatementContext)_localctx).p1 = procedure_invocation();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).p1.ast;
				setState(166);
				match(T__24);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadWriteBlockContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReadWriteBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readWriteBlock; }
	}

	public final ReadWriteBlockContext readWriteBlock() throws RecognitionException {
		ReadWriteBlockContext _localctx = new ReadWriteBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_readWriteBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			((ReadWriteBlockContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ReadWriteBlockContext)_localctx).e1.ast);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(172);
				match(T__31);
				setState(173);
				((ReadWriteBlockContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ReadWriteBlockContext)_localctx).e2.ast);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext s1;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__10:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				((BlockContext)_localctx).s1 = statement();
				_localctx.ast.add(((BlockContext)_localctx).s1.ast);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__4);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					{
					setState(185);
					((BlockContext)_localctx).s1 = statement();
					_localctx.ast.add(((BlockContext)_localctx).s1.ast);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure_invocationContext extends ParserRuleContext {
		public FunctionInvocation ast;
		public Token ID;
		public ArgumentsContext a1;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Procedure_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_invocation; }
	}

	public final Procedure_invocationContext procedure_invocation() throws RecognitionException {
		Procedure_invocationContext _localctx = new Procedure_invocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedure_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((Procedure_invocationContext)_localctx).ID = match(ID);
			setState(197);
			match(T__2);
			setState(198);
			((Procedure_invocationContext)_localctx).a1 = arguments();
			((Procedure_invocationContext)_localctx).ast =  new FunctionInvocation(((Procedure_invocationContext)_localctx).ID.getLine(), ((Procedure_invocationContext)_localctx).ID.getCharPositionInLine()+1, (((Procedure_invocationContext)_localctx).ID!=null?((Procedure_invocationContext)_localctx).ID.getText():null),
			    			((Procedure_invocationContext)_localctx).a1.ast);
			setState(200);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__10:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((ArgumentsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ArgumentsContext)_localctx).e1.ast);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(204);
					match(T__31);
					setState(205);
					((ArgumentsContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ArgumentsContext)_localctx).e2.ast);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext t1;
		public Builtin_typeContext b1;
		public Token s1;
		public Struct_bodyContext b2;
		public Token i1;
		public Builtin_typeContext builtin_type() {
			return getRuleContext(Builtin_typeContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
				{
				setState(217);
				((TypeContext)_localctx).b1 = builtin_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b1.ast;
				}
				break;
			case T__32:
				{
				setState(220);
				((TypeContext)_localctx).s1 = match(T__32);
				setState(221);
				match(T__4);
				setState(222);
				((TypeContext)_localctx).b2 = struct_body();
				setState(223);
				match(T__5);
				((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).s1.getLine(), ((TypeContext)_localctx).s1.getCharPositionInLine()+1, ((TypeContext)_localctx).b2.ast);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(228);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(229);
					match(T__6);
					setState(230);
					((TypeContext)_localctx).i1 = match(INT_CONSTANT);
					setState(231);
					match(T__7);
					((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).t1.ast.getLine(), ((TypeContext)_localctx).t1.ast.getColumn(), LexerHelper.lexemeToInt((((TypeContext)_localctx).i1!=null?((TypeContext)_localctx).i1.getText():null)), ((TypeContext)_localctx).t1.ast);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Builtin_typeContext extends ParserRuleContext {
		public Type ast;
		public Token s;
		public Builtin_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_type; }
	}

	public final Builtin_typeContext builtin_type() throws RecognitionException {
		Builtin_typeContext _localctx = new Builtin_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_builtin_type);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((Builtin_typeContext)_localctx).s = match(T__33);
				((Builtin_typeContext)_localctx).ast =  new IntType(((Builtin_typeContext)_localctx).s.getLine(), ((Builtin_typeContext)_localctx).s.getCharPositionInLine()+1);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				((Builtin_typeContext)_localctx).s = match(T__34);
				((Builtin_typeContext)_localctx).ast =  new DoubleType(((Builtin_typeContext)_localctx).s.getLine(), ((Builtin_typeContext)_localctx).s.getCharPositionInLine()+1);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				((Builtin_typeContext)_localctx).s = match(T__35);
				((Builtin_typeContext)_localctx).ast =  new CharType(((Builtin_typeContext)_localctx).s.getLine(), ((Builtin_typeContext)_localctx).s.getCharPositionInLine()+1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<RecordField>();
		public Record_field_lineContext r1;
		public List<Record_field_lineContext> record_field_line() {
			return getRuleContexts(Record_field_lineContext.class);
		}
		public Record_field_lineContext record_field_line(int i) {
			return getRuleContext(Record_field_lineContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				{
				setState(246);
				((Struct_bodyContext)_localctx).r1 = record_field_line();
				for (RecordField r : ((Struct_bodyContext)_localctx).r1.ast) _localctx.ast.add(r);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_field_lineContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<RecordField>();
		public TypeContext t1;
		public Token i1;
		public Token i2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public Record_field_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_field_line; }
	}

	public final Record_field_lineContext record_field_line() throws RecognitionException {
		Record_field_lineContext _localctx = new Record_field_lineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_record_field_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((Record_field_lineContext)_localctx).t1 = type(0);
			{
			setState(255);
			((Record_field_lineContext)_localctx).i1 = match(ID);
			_localctx.ast.add(new RecordField((((Record_field_lineContext)_localctx).i1!=null?((Record_field_lineContext)_localctx).i1.getText():null), ((Record_field_lineContext)_localctx).t1.ast));
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(257);
				match(T__31);
				setState(258);
				((Record_field_lineContext)_localctx).i2 = match(ID);
				_localctx.ast.add(new RecordField((((Record_field_lineContext)_localctx).i2!=null?((Record_field_lineContext)_localctx).i2.getText():null), ((Record_field_lineContext)_localctx).t1.ast));
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(265);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			type(0);
			{
			setState(268);
			match(ID);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(269);
				match(T__31);
				setState(270);
				match(ID);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(276);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Builtin_typeContext builtin_type() {
			return getRuleContext(Builtin_typeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
				{
				setState(278);
				builtin_type();
				}
				break;
			case T__0:
				{
				setState(279);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(282);
			match(ID);
			setState(283);
			match(T__2);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				setState(284);
				type(0);
				setState(285);
				match(ID);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(286);
					match(T__31);
					setState(287);
					type(0);
					setState(288);
					match(ID);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(297);
			match(T__3);
			setState(298);
			match(T__4);
			setState(299);
			function_body();
			setState(300);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				{
				setState(302);
				variable_definition();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(308);
				statement();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 8:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ab\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u00b3\n\6\f\6\16\6\u00b6\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u00bf\n\7\f\7\16\7\u00c2\13\7\3\7\5\7\u00c5\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d3\n\t\f\t\16\t\u00d6"+
		"\13\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e5"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ec\n\n\f\n\16\n\u00ef\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00f7\n\13\3\f\3\f\3\f\7\f\u00fc\n\f\f\f\16\f"+
		"\u00ff\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0107\n\r\f\r\16\r\u010a\13\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0112\n\16\f\16\16\16\u0115\13\16\3"+
		"\16\3\16\3\17\3\17\5\17\u011b\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0125\n\17\f\17\16\17\u0128\13\17\5\17\u012a\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\7\20\u0132\n\20\f\20\16\20\u0135\13\20\3\20\7\20"+
		"\u0138\n\20\f\20\16\20\u013b\13\20\3\20\2\4\4\22\21\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36\2\6\3\2\16\20\4\2\f\f\21\21\3\2\22\27\3\2\30\31"+
		"\2\u0155\2$\3\2\2\2\4O\3\2\2\2\6t\3\2\2\2\b\u00aa\3\2\2\2\n\u00ac\3\2"+
		"\2\2\f\u00c4\3\2\2\2\16\u00c6\3\2\2\2\20\u00d8\3\2\2\2\22\u00e4\3\2\2"+
		"\2\24\u00f6\3\2\2\2\26\u00fd\3\2\2\2\30\u0100\3\2\2\2\32\u010d\3\2\2\2"+
		"\34\u011a\3\2\2\2\36\u0133\3\2\2\2 #\5\32\16\2!#\5\34\17\2\" \3\2\2\2"+
		"\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\3"+
		"\2\2()\7\4\2\2)*\7\5\2\2*+\7\6\2\2+,\7\7\2\2,-\5\36\20\2-.\7\b\2\2./\7"+
		"\2\2\3/\3\3\2\2\2\60\61\b\3\1\2\61\62\7\5\2\2\62\63\5\4\3\2\63\64\b\3"+
		"\1\2\64\65\7\6\2\2\65P\3\2\2\2\66\67\7\5\2\2\678\5\24\13\289\7\6\2\29"+
		":\5\4\3\16:;\b\3\1\2;P\3\2\2\2<=\7\f\2\2=>\5\4\3\r>?\b\3\1\2?P\3\2\2\2"+
		"@A\7\r\2\2AB\5\4\3\fBC\b\3\1\2CP\3\2\2\2DE\5\6\4\2EF\b\3\1\2FP\3\2\2\2"+
		"GH\7(\2\2HP\b\3\1\2IJ\7)\2\2JP\b\3\1\2KL\7+\2\2LP\b\3\1\2MN\7*\2\2NP\b"+
		"\3\1\2O\60\3\2\2\2O\66\3\2\2\2O<\3\2\2\2O@\3\2\2\2OD\3\2\2\2OG\3\2\2\2"+
		"OI\3\2\2\2OK\3\2\2\2OM\3\2\2\2Pq\3\2\2\2QR\f\13\2\2RS\t\2\2\2ST\5\4\3"+
		"\fTU\b\3\1\2Up\3\2\2\2VW\f\n\2\2WX\t\3\2\2XY\5\4\3\13YZ\b\3\1\2Zp\3\2"+
		"\2\2[\\\f\t\2\2\\]\t\4\2\2]^\5\4\3\n^_\b\3\1\2_p\3\2\2\2`a\f\b\2\2ab\t"+
		"\5\2\2bc\5\4\3\tcd\b\3\1\2dp\3\2\2\2ef\f\20\2\2fg\7\t\2\2gh\5\4\3\2hi"+
		"\7\n\2\2ij\b\3\1\2jp\3\2\2\2kl\f\17\2\2lm\7\13\2\2mn\7(\2\2np\b\3\1\2"+
		"oQ\3\2\2\2oV\3\2\2\2o[\3\2\2\2o`\3\2\2\2oe\3\2\2\2ok\3\2\2\2ps\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2r\5\3\2\2\2sq\3\2\2\2tu\7(\2\2uv\7\5\2\2vw\5\20\t"+
		"\2wx\b\4\1\2xy\7\6\2\2y\7\3\2\2\2z{\5\4\3\2{|\7\32\2\2|}\5\4\3\2}~\7\33"+
		"\2\2~\177\b\5\1\2\177\u00ab\3\2\2\2\u0080\u0081\7\34\2\2\u0081\u0082\7"+
		"\5\2\2\u0082\u0083\5\4\3\2\u0083\u0084\7\6\2\2\u0084\u0085\5\f\7\2\u0085"+
		"\u0086\b\5\1\2\u0086\u00ab\3\2\2\2\u0087\u0088\7\35\2\2\u0088\u0089\7"+
		"\5\2\2\u0089\u008a\5\4\3\2\u008a\u008b\7\6\2\2\u008b\u008c\5\f\7\2\u008c"+
		"\u008d\7\36\2\2\u008d\u008e\5\f\7\2\u008e\u008f\b\5\1\2\u008f\u00ab\3"+
		"\2\2\2\u0090\u0091\7\35\2\2\u0091\u0092\7\5\2\2\u0092\u0093\5\4\3\2\u0093"+
		"\u0094\7\6\2\2\u0094\u0095\5\f\7\2\u0095\u0096\b\5\1\2\u0096\u00ab\3\2"+
		"\2\2\u0097\u0098\7\37\2\2\u0098\u0099\5\4\3\2\u0099\u009a\b\5\1\2\u009a"+
		"\u009b\7\33\2\2\u009b\u00ab\3\2\2\2\u009c\u009d\7 \2\2\u009d\u009e\5\n"+
		"\6\2\u009e\u009f\b\5\1\2\u009f\u00a0\7\33\2\2\u00a0\u00ab\3\2\2\2\u00a1"+
		"\u00a2\7!\2\2\u00a2\u00a3\5\n\6\2\u00a3\u00a4\b\5\1\2\u00a4\u00a5\7\33"+
		"\2\2\u00a5\u00ab\3\2\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\b\5\1\2\u00a8"+
		"\u00a9\7\33\2\2\u00a9\u00ab\3\2\2\2\u00aaz\3\2\2\2\u00aa\u0080\3\2\2\2"+
		"\u00aa\u0087\3\2\2\2\u00aa\u0090\3\2\2\2\u00aa\u0097\3\2\2\2\u00aa\u009c"+
		"\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\t\3\2\2\2\u00ac"+
		"\u00ad\5\4\3\2\u00ad\u00b4\b\6\1\2\u00ae\u00af\7\"\2\2\u00af\u00b0\5\4"+
		"\3\2\u00b0\u00b1\b\6\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\13\3\2\2"+
		"\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\5\b\5\2\u00b8\u00b9\b\7\1\2\u00b9\u00c5"+
		"\3\2\2\2\u00ba\u00c0\7\7\2\2\u00bb\u00bc\5\b\5\2\u00bc\u00bd\b\7\1\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c5\7\b\2\2\u00c4\u00b7\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c5\r\3\2\2\2"+
		"\u00c6\u00c7\7(\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca"+
		"\b\b\1\2\u00ca\u00cb\7\6\2\2\u00cb\17\3\2\2\2\u00cc\u00cd\5\4\3\2\u00cd"+
		"\u00d4\b\t\1\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\5\4\3\2\u00d0\u00d1\b\t"+
		"\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\21\3\2\2\2\u00da\u00db\b\n\1\2\u00db\u00dc\5\24\13\2\u00dc\u00dd\b\n"+
		"\1\2\u00dd\u00e5\3\2\2\2\u00de\u00df\7#\2\2\u00df\u00e0\7\7\2\2\u00e0"+
		"\u00e1\5\26\f\2\u00e1\u00e2\7\b\2\2\u00e2\u00e3\b\n\1\2\u00e3\u00e5\3"+
		"\2\2\2\u00e4\u00da\3\2\2\2\u00e4\u00de\3\2\2\2\u00e5\u00ed\3\2\2\2\u00e6"+
		"\u00e7\f\3\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00e9\7)\2\2\u00e9\u00ea\7\n"+
		"\2\2\u00ea\u00ec\b\n\1\2\u00eb\u00e6\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\23\3\2\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00f0\u00f1\7$\2\2\u00f1\u00f7\b\13\1\2\u00f2\u00f3\7%\2\2\u00f3\u00f7"+
		"\b\13\1\2\u00f4\u00f5\7&\2\2\u00f5\u00f7\b\13\1\2\u00f6\u00f0\3\2\2\2"+
		"\u00f6\u00f2\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\25\3\2\2\2\u00f8\u00f9"+
		"\5\30\r\2\u00f9\u00fa\b\f\1\2\u00fa\u00fc\3\2\2\2\u00fb\u00f8\3\2\2\2"+
		"\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\27"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\5\22\n\2\u0101\u0102\7(\2\2\u0102"+
		"\u0108\b\r\1\2\u0103\u0104\7\"\2\2\u0104\u0105\7(\2\2\u0105\u0107\b\r"+
		"\1\2\u0106\u0103\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\33"+
		"\2\2\u010c\31\3\2\2\2\u010d\u010e\5\22\n\2\u010e\u0113\7(\2\2\u010f\u0110"+
		"\7\"\2\2\u0110\u0112\7(\2\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\7\33\2\2\u0117\33\3\2\2\2\u0118\u011b\5\24\13\2\u0119"+
		"\u011b\7\3\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\7(\2\2\u011d\u0129\7\5\2\2\u011e\u011f\5\22\n\2\u011f"+
		"\u0126\7(\2\2\u0120\u0121\7\"\2\2\u0121\u0122\5\22\n\2\u0122\u0123\7("+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u011e\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\7\6\2\2\u012c\u012d\7\7\2\2\u012d\u012e\5\36\20\2\u012e\u012f\7"+
		"\b\2\2\u012f\35\3\2\2\2\u0130\u0132\5\32\16\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0139\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0138\5\b\5\2\u0137\u0136\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\37\3\2\2"+
		"\2\u013b\u0139\3\2\2\2\30\"$Ooq\u00aa\u00b4\u00c0\u00c4\u00d4\u00d8\u00e4"+
		"\u00ed\u00f6\u00fd\u0108\u0113\u011a\u0126\u0129\u0133\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}