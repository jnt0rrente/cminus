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
		RULE_program = 0, RULE_programDefinitions = 1, RULE_expression = 2, RULE_intLiteral = 3, 
		RULE_variable = 4, RULE_function_invocation = 5, RULE_statement = 6, RULE_readBlock = 7, 
		RULE_writeBlock = 8, RULE_block = 9, RULE_procedure_invocation = 10, RULE_arguments = 11, 
		RULE_type = 12, RULE_returnable_type = 13, RULE_struct_type = 14, RULE_builtin_type = 15, 
		RULE_struct_body = 16, RULE_record_field_line = 17, RULE_definition = 18, 
		RULE_variable_definition = 19, RULE_function_definition = 20, RULE_function_definition_parameter_declaration = 21, 
		RULE_function_definition_body_variables = 22, RULE_function_definition_body_statements = 23, 
		RULE_main_function_definition = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programDefinitions", "expression", "intLiteral", "variable", 
			"function_invocation", "statement", "readBlock", "writeBlock", "block", 
			"procedure_invocation", "arguments", "type", "returnable_type", "struct_type", 
			"builtin_type", "struct_body", "record_field_line", "definition", "variable_definition", 
			"function_definition", "function_definition_parameter_declaration", "function_definition_body_variables", 
			"function_definition_body_statements", "main_function_definition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'='", "';'", "'while'", "'if'", "'else'", "'return'", "'read'", "'write'", 
			"','", "'{'", "'}'", "'void'", "'struct'", "'int'", "'double'", "'char'", 
			"'main'"
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
		public Program ast;
		public ProgramDefinitionsContext d1;
		public Main_function_definitionContext m1;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public ProgramDefinitionsContext programDefinitions() {
			return getRuleContext(ProgramDefinitionsContext.class,0);
		}
		public Main_function_definitionContext main_function_definition() {
			return getRuleContext(Main_function_definitionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((ProgramContext)_localctx).d1 = programDefinitions();
			setState(51);
			((ProgramContext)_localctx).m1 = main_function_definition();
			((ProgramContext)_localctx).ast =  new Program(0,0, ((ProgramContext)_localctx).d1.ast, ((ProgramContext)_localctx).m1.ast);
			setState(53);
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

	public static class ProgramDefinitionsContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public Variable_definitionContext v1;
		public Function_definitionContext f1;
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
		public ProgramDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programDefinitions; }
	}

	public final ProgramDefinitionsContext programDefinitions() throws RecognitionException {
		ProgramDefinitionsContext _localctx = new ProgramDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programDefinitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						{
						setState(55);
						((ProgramDefinitionsContext)_localctx).v1 = variable_definition();

								for (Definition d : ((ProgramDefinitionsContext)_localctx).v1.ast) _localctx.ast.add(d);
							
						}
						}
						break;
					case 2:
						{
						{
						setState(58);
						((ProgramDefinitionsContext)_localctx).f1 = function_definition();

								_localctx.ast.add(((ProgramDefinitionsContext)_localctx).f1.ast);
							
						}
						}
						break;
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public Builtin_typeContext b1;
		public Function_invocationContext f1;
		public VariableContext id;
		public IntLiteralContext i1;
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(67);
				match(T__0);
				setState(68);
				((ExpressionContext)_localctx).e1 = expression(0);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast;
				setState(70);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(72);
				match(T__0);
				setState(73);
				((ExpressionContext)_localctx).b1 = builtin_type();
				setState(74);
				match(T__1);
				setState(75);
				((ExpressionContext)_localctx).e1 = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).b1.ast.getLine(), ((ExpressionContext)_localctx).b1.ast.getColumn(),
							((ExpressionContext)_localctx).b1.ast, ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 3:
				{
				setState(78);
				match(T__5);
				setState(79);
				((ExpressionContext)_localctx).e1 = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
				            ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 4:
				{
				setState(82);
				match(T__6);
				setState(83);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
							((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 5:
				{
				setState(86);
				((ExpressionContext)_localctx).f1 = function_invocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).f1.ast;
				}
				break;
			case 6:
				{
				setState(89);
				((ExpressionContext)_localctx).id = variable();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).id.ast;
				}
				break;
			case 7:
				{
				setState(92);
				((ExpressionContext)_localctx).i1 = intLiteral();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).i1.ast; 
				}
				break;
			case 8:
				{
				setState(95);
				((ExpressionContext)_localctx).r1 = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).r1.getLine(), ((ExpressionContext)_localctx).r1.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).r1!=null?((ExpressionContext)_localctx).r1.getText():null))); 
				}
				break;
			case 9:
				{
				setState(97);
				((ExpressionContext)_localctx).c1 = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).c1.getLine(), ((ExpressionContext)_localctx).c1.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c1!=null?((ExpressionContext)_localctx).c1.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(102);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
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
						setState(106);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(107);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__10) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
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
						setState(111);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(112);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
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
						setState(116);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(117);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
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
						setState(121);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(122);
						match(T__2);
						setState(123);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(124);
						match(T__3);
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
						setState(127);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(128);
						match(T__4);
						setState(129);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
						          			(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast);
						}
						break;
					}
					} 
				}
				setState(135);
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

	public static class IntLiteralContext extends ParserRuleContext {
		public IntLiteral ast;
		public Token i1;
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((IntLiteralContext)_localctx).i1 = match(INT_CONSTANT);
			((IntLiteralContext)_localctx).ast =  new IntLiteral(((IntLiteralContext)_localctx).i1.getLine(), ((IntLiteralContext)_localctx).i1.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((IntLiteralContext)_localctx).i1!=null?((IntLiteralContext)_localctx).i1.getText():null))); 
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

	public static class VariableContext extends ParserRuleContext {
		public Variable ast;
		public Token id;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((VariableContext)_localctx).id = match(ID);
			((VariableContext)_localctx).ast =  new Variable(((VariableContext)_localctx).id.getLine(), ((VariableContext)_localctx).id.getCharPositionInLine()+1, (((VariableContext)_localctx).id!=null?((VariableContext)_localctx).id.getText():null)); 
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

	public static class Function_invocationContext extends ParserRuleContext {
		public Expression ast;
		public VariableContext e1;
		public ArgumentsContext a1;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_function_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((Function_invocationContext)_localctx).e1 = variable();
			setState(143);
			match(T__0);
			setState(144);
			((Function_invocationContext)_localctx).a1 = arguments();
			((Function_invocationContext)_localctx).ast =  new FunctionInvocation(((Function_invocationContext)_localctx).e1.ast.getLine(), ((Function_invocationContext)_localctx).e1.ast.getColumn(), ((Function_invocationContext)_localctx).e1.ast, ((Function_invocationContext)_localctx).a1.ast);
			setState(146);
			match(T__1);
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
		public List<Statement> ast = new ArrayList<Statement>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public BlockContext b1;
		public BlockContext b2;
		public Token s;
		public ReadBlockContext rb;
		public WriteBlockContext wb;
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
		public ReadBlockContext readBlock() {
			return getRuleContext(ReadBlockContext.class,0);
		}
		public WriteBlockContext writeBlock() {
			return getRuleContext(WriteBlockContext.class,0);
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
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((StatementContext)_localctx).e1 = expression(0);
				setState(149);
				match(T__19);
				setState(150);
				((StatementContext)_localctx).e2 = expression(0);
				setState(151);
				match(T__20);
				_localctx.ast.add(new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__21);
				setState(155);
				match(T__0);
				setState(156);
				((StatementContext)_localctx).e1 = expression(0);
				setState(157);
				match(T__1);
				setState(158);
				((StatementContext)_localctx).b1 = block();
				_localctx.ast.add(new WhileLoop(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(T__22);
				setState(162);
				match(T__0);
				setState(163);
				((StatementContext)_localctx).e1 = expression(0);
				setState(164);
				match(T__1);
				setState(165);
				((StatementContext)_localctx).b1 = block();
				setState(166);
				match(T__23);
				setState(167);
				((StatementContext)_localctx).b2 = block();
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).b2.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(T__22);
				setState(171);
				match(T__0);
				setState(172);
				((StatementContext)_localctx).e1 = expression(0);
				setState(173);
				match(T__1);
				setState(174);
				((StatementContext)_localctx).b1 = block();
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(T__24);
				setState(178);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new Return(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast));
				setState(180);
				match(T__20);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				((StatementContext)_localctx).s = match(T__25);
				setState(183);
				((StatementContext)_localctx).rb = readBlock();
				for (Read r : ((StatementContext)_localctx).rb.ast) { _localctx.ast.add(r); }
				setState(185);
				match(T__20);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				((StatementContext)_localctx).s = match(T__26);
				setState(188);
				((StatementContext)_localctx).wb = writeBlock();
				for (Write w : ((StatementContext)_localctx).wb.ast) { _localctx.ast.add(w); }
				setState(190);
				match(T__20);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(192);
				((StatementContext)_localctx).p1 = procedure_invocation();
				_localctx.ast.add(((StatementContext)_localctx).p1.ast);
				setState(194);
				match(T__20);
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

	public static class ReadBlockContext extends ParserRuleContext {
		public List<Read> ast = new ArrayList<Read>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReadBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readBlock; }
	}

	public final ReadBlockContext readBlock() throws RecognitionException {
		ReadBlockContext _localctx = new ReadBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_readBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			((ReadBlockContext)_localctx).e1 = expression(0);
			_localctx.ast.add(new Read(((ReadBlockContext)_localctx).e1.ast.getLine(), ((ReadBlockContext)_localctx).e1.ast.getColumn(), ((ReadBlockContext)_localctx).e1.ast));
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(200);
				match(T__27);
				setState(201);
				((ReadBlockContext)_localctx).e2 = expression(0);
				_localctx.ast.add(new Read(((ReadBlockContext)_localctx).e2.ast.getLine(), ((ReadBlockContext)_localctx).e2.ast.getColumn(), ((ReadBlockContext)_localctx).e2.ast));
				}
				}
				setState(208);
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

	public static class WriteBlockContext extends ParserRuleContext {
		public List<Write> ast = new ArrayList<Write>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WriteBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeBlock; }
	}

	public final WriteBlockContext writeBlock() throws RecognitionException {
		WriteBlockContext _localctx = new WriteBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_writeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			((WriteBlockContext)_localctx).e1 = expression(0);
			_localctx.ast.add(new Write(((WriteBlockContext)_localctx).e1.ast.getLine(), ((WriteBlockContext)_localctx).e1.ast.getColumn(), ((WriteBlockContext)_localctx).e1.ast));
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(211);
				match(T__27);
				setState(212);
				((WriteBlockContext)_localctx).e2 = expression(0);
				_localctx.ast.add(new Write(((WriteBlockContext)_localctx).e2.ast.getLine(), ((WriteBlockContext)_localctx).e2.ast.getColumn(), ((WriteBlockContext)_localctx).e2.ast));
				}
				}
				setState(219);
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case T__21:
			case T__22:
			case T__24:
			case T__25:
			case T__26:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				((BlockContext)_localctx).s1 = statement();
				_localctx.ast.addAll(((BlockContext)_localctx).s1.ast);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(T__28);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					{
					setState(224);
					((BlockContext)_localctx).s1 = statement();
					_localctx.ast.addAll(((BlockContext)_localctx).s1.ast);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(T__29);
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
		public VariableContext v1;
		public ArgumentsContext a1;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_procedure_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			((Procedure_invocationContext)_localctx).v1 = variable();
			setState(236);
			match(T__0);
			setState(237);
			((Procedure_invocationContext)_localctx).a1 = arguments();
			((Procedure_invocationContext)_localctx).ast =  new FunctionInvocation(((Procedure_invocationContext)_localctx).v1.ast.getLine(), ((Procedure_invocationContext)_localctx).v1.ast.getColumn(), ((Procedure_invocationContext)_localctx).v1.ast,
			    			((Procedure_invocationContext)_localctx).a1.ast);
			setState(239);
			match(T__1);
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
		enterRule(_localctx, 22, RULE_arguments);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((ArgumentsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ArgumentsContext)_localctx).e1.ast);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(243);
					match(T__27);
					setState(244);
					((ArgumentsContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ArgumentsContext)_localctx).e2.ast);
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
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
		public Struct_typeContext s1;
		public IntLiteralContext e1;
		public IntLiteralContext e2;
		public Builtin_typeContext builtin_type() {
			return getRuleContext(Builtin_typeContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IntLiteralContext> intLiteral() {
			return getRuleContexts(IntLiteralContext.class);
		}
		public IntLiteralContext intLiteral(int i) {
			return getRuleContext(IntLiteralContext.class,i);
		}
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				{
				setState(256);
				((TypeContext)_localctx).b1 = builtin_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b1.ast;
				}
				break;
			case T__31:
				{
				setState(259);
				((TypeContext)_localctx).s1 = struct_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).s1.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
					setState(264);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(265);
					match(T__2);
					setState(266);
					((TypeContext)_localctx).e1 = intLiteral();
					setState(267);
					match(T__3);
					((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).t1.ast.getLine(), ((TypeContext)_localctx).t1.ast.getColumn(), ((TypeContext)_localctx).e1.ast, ((TypeContext)_localctx).t1.ast);
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(269);
							match(T__2);
							setState(270);
							((TypeContext)_localctx).e2 = intLiteral();
							setState(271);
							match(T__3);
							((ArrayType)_localctx.ast).setType(new ArrayType(((TypeContext)_localctx).t1.ast.getLine(), ((TypeContext)_localctx).t1.ast.getColumn(), ((TypeContext)_localctx).e2.ast, ((TypeContext)_localctx).t1.ast));
							}
							} 
						}
						setState(278);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Returnable_typeContext extends ParserRuleContext {
		public Type ast;
		public Builtin_typeContext b1;
		public Token s;
		public Builtin_typeContext builtin_type() {
			return getRuleContext(Builtin_typeContext.class,0);
		}
		public Returnable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnable_type; }
	}

	public final Returnable_typeContext returnable_type() throws RecognitionException {
		Returnable_typeContext _localctx = new Returnable_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnable_type);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((Returnable_typeContext)_localctx).b1 = builtin_type();
				((Returnable_typeContext)_localctx).ast =  ((Returnable_typeContext)_localctx).b1.ast;
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				((Returnable_typeContext)_localctx).s = match(T__30);
				((Returnable_typeContext)_localctx).ast =  new VoidType(((Returnable_typeContext)_localctx).s.getLine(), ((Returnable_typeContext)_localctx).s.getCharPositionInLine()+1);
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

	public static class Struct_typeContext extends ParserRuleContext {
		public StructType ast;
		public Token s1;
		public Struct_bodyContext b2;
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((Struct_typeContext)_localctx).s1 = match(T__31);
			setState(292);
			match(T__28);
			setState(293);
			((Struct_typeContext)_localctx).b2 = struct_body();
			setState(294);
			match(T__29);
			((Struct_typeContext)_localctx).ast =  new StructType(((Struct_typeContext)_localctx).s1.getLine(), ((Struct_typeContext)_localctx).s1.getCharPositionInLine()+1, ((Struct_typeContext)_localctx).b2.ast);
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
		enterRule(_localctx, 30, RULE_builtin_type);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				((Builtin_typeContext)_localctx).s = match(T__32);
				((Builtin_typeContext)_localctx).ast =  new IntType(((Builtin_typeContext)_localctx).s.getLine(), ((Builtin_typeContext)_localctx).s.getCharPositionInLine()+1);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				((Builtin_typeContext)_localctx).s = match(T__33);
				((Builtin_typeContext)_localctx).ast =  new DoubleType(((Builtin_typeContext)_localctx).s.getLine(), ((Builtin_typeContext)_localctx).s.getCharPositionInLine()+1);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				((Builtin_typeContext)_localctx).s = match(T__34);
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
		enterRule(_localctx, 32, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(305);
				((Struct_bodyContext)_localctx).r1 = record_field_line();
				for (RecordField r : ((Struct_bodyContext)_localctx).r1.ast) _localctx.ast.add(r);
				}
				}
				setState(312);
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
		enterRule(_localctx, 34, RULE_record_field_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((Record_field_lineContext)_localctx).t1 = type(0);
			{
			setState(314);
			((Record_field_lineContext)_localctx).i1 = match(ID);
			_localctx.ast.add(new RecordField(((Record_field_lineContext)_localctx).t1.ast.getLine(), ((Record_field_lineContext)_localctx).t1.ast.getColumn(), (((Record_field_lineContext)_localctx).i1!=null?((Record_field_lineContext)_localctx).i1.getText():null), ((Record_field_lineContext)_localctx).t1.ast));
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(316);
				match(T__27);
				setState(317);
				((Record_field_lineContext)_localctx).i2 = match(ID);
				_localctx.ast.add(new RecordField(((Record_field_lineContext)_localctx).i2.getLine(), ((Record_field_lineContext)_localctx).i2.getCharPositionInLine()+1, (((Record_field_lineContext)_localctx).i2!=null?((Record_field_lineContext)_localctx).i2.getText():null), ((Record_field_lineContext)_localctx).t1.ast));
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(324);
			match(T__20);
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

	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public Variable_definitionContext v1;
		public Function_definitionContext f1;
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_definition);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				((DefinitionContext)_localctx).v1 = variable_definition();
				for (Definition d : ((DefinitionContext)_localctx).v1.ast) _localctx.ast.add(d);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				((DefinitionContext)_localctx).f1 = function_definition();
				_localctx.ast.add(((DefinitionContext)_localctx).f1.ast);
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

	public static class Variable_definitionContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
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
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			((Variable_definitionContext)_localctx).t1 = type(0);
			{
			setState(335);
			((Variable_definitionContext)_localctx).i1 = match(ID);
			_localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).t1.ast.getLine(), ((Variable_definitionContext)_localctx).t1.ast.getColumn(), (((Variable_definitionContext)_localctx).i1!=null?((Variable_definitionContext)_localctx).i1.getText():null), ((Variable_definitionContext)_localctx).t1.ast));
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(337);
				match(T__27);
				setState(338);
				((Variable_definitionContext)_localctx).i2 = match(ID);
				_localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).t1.ast.getLine(), ((Variable_definitionContext)_localctx).t1.ast.getColumn(), (((Variable_definitionContext)_localctx).i2!=null?((Variable_definitionContext)_localctx).i2.getText():null), ((Variable_definitionContext)_localctx).t1.ast));
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(345);
			match(T__20);
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
		public FunctionDefinition ast;
		public Returnable_typeContext r1;
		public Token i1;
		public Function_definition_parameter_declarationContext f1;
		public Function_definition_body_variablesContext b1;
		public Function_definition_body_statementsContext b2;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public Function_definition_parameter_declarationContext function_definition_parameter_declaration() {
			return getRuleContext(Function_definition_parameter_declarationContext.class,0);
		}
		public Function_definition_body_variablesContext function_definition_body_variables() {
			return getRuleContext(Function_definition_body_variablesContext.class,0);
		}
		public Function_definition_body_statementsContext function_definition_body_statements() {
			return getRuleContext(Function_definition_body_statementsContext.class,0);
		}
		public Returnable_typeContext returnable_type() {
			return getRuleContext(Returnable_typeContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(347);
			((Function_definitionContext)_localctx).r1 = returnable_type();
			}
			setState(348);
			((Function_definitionContext)_localctx).i1 = match(ID);
			setState(349);
			match(T__0);
			setState(350);
			((Function_definitionContext)_localctx).f1 = function_definition_parameter_declaration();
			setState(351);
			match(T__1);
			setState(352);
			match(T__28);
			setState(353);
			((Function_definitionContext)_localctx).b1 = function_definition_body_variables();
			setState(354);
			((Function_definitionContext)_localctx).b2 = function_definition_body_statements();
			setState(355);
			match(T__29);
			((Function_definitionContext)_localctx).ast =  new FunctionDefinition(
					((Function_definitionContext)_localctx).r1.ast.getLine(),
					((Function_definitionContext)_localctx).r1.ast.getColumn(),
					(((Function_definitionContext)_localctx).i1!=null?((Function_definitionContext)_localctx).i1.getText():null),
					new FunctionType(
						((Function_definitionContext)_localctx).r1.ast.getLine(),
						((Function_definitionContext)_localctx).r1.ast.getColumn(),
						((Function_definitionContext)_localctx).r1.ast,
						((Function_definitionContext)_localctx).f1.ast),
					((Function_definitionContext)_localctx).b1.ast,
					((Function_definitionContext)_localctx).b2.ast);
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

	public static class Function_definition_parameter_declarationContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
		public TypeContext t1;
		public Token i1;
		public TypeContext t2;
		public Token i2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public Function_definition_parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_parameter_declaration; }
	}

	public final Function_definition_parameter_declarationContext function_definition_parameter_declaration() throws RecognitionException {
		Function_definition_parameter_declarationContext _localctx = new Function_definition_parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_definition_parameter_declaration);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(358);
				((Function_definition_parameter_declarationContext)_localctx).t1 = type(0);
				setState(359);
				((Function_definition_parameter_declarationContext)_localctx).i1 = match(ID);
				_localctx.ast.add(new VariableDefinition(((Function_definition_parameter_declarationContext)_localctx).t1.ast.getLine(), ((Function_definition_parameter_declarationContext)_localctx).t1.ast.getColumn(), (((Function_definition_parameter_declarationContext)_localctx).i1!=null?((Function_definition_parameter_declarationContext)_localctx).i1.getText():null), ((Function_definition_parameter_declarationContext)_localctx).t1.ast));
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(361);
					match(T__27);
					setState(362);
					((Function_definition_parameter_declarationContext)_localctx).t2 = type(0);
					setState(363);
					((Function_definition_parameter_declarationContext)_localctx).i2 = match(ID);
					_localctx.ast.add(new VariableDefinition(((Function_definition_parameter_declarationContext)_localctx).t2.ast.getLine(), ((Function_definition_parameter_declarationContext)_localctx).t2.ast.getColumn(), (((Function_definition_parameter_declarationContext)_localctx).i2!=null?((Function_definition_parameter_declarationContext)_localctx).i2.getText():null), ((Function_definition_parameter_declarationContext)_localctx).t2.ast));
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__1:
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

	public static class Function_definition_body_variablesContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
		public Variable_definitionContext v1;
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public Function_definition_body_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body_variables; }
	}

	public final Function_definition_body_variablesContext function_definition_body_variables() throws RecognitionException {
		Function_definition_body_variablesContext _localctx = new Function_definition_body_variablesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_definition_body_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(374);
				((Function_definition_body_variablesContext)_localctx).v1 = variable_definition();
				for (VariableDefinition d : ((Function_definition_body_variablesContext)_localctx).v1.ast) _localctx.ast.add(d);
				}
				}
				setState(381);
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

	public static class Function_definition_body_statementsContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext s1;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definition_body_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body_statements; }
	}

	public final Function_definition_body_statementsContext function_definition_body_statements() throws RecognitionException {
		Function_definition_body_statementsContext _localctx = new Function_definition_body_statementsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_definition_body_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(382);
				((Function_definition_body_statementsContext)_localctx).s1 = statement();
				_localctx.ast.addAll(((Function_definition_body_statementsContext)_localctx).s1.ast);
				}
				}
				setState(389);
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

	public static class Main_function_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token v1;
		public Token m1;
		public Function_definition_body_variablesContext b1;
		public Function_definition_body_statementsContext b2;
		public Function_definition_body_variablesContext function_definition_body_variables() {
			return getRuleContext(Function_definition_body_variablesContext.class,0);
		}
		public Function_definition_body_statementsContext function_definition_body_statements() {
			return getRuleContext(Function_definition_body_statementsContext.class,0);
		}
		public Main_function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function_definition; }
	}

	public final Main_function_definitionContext main_function_definition() throws RecognitionException {
		Main_function_definitionContext _localctx = new Main_function_definitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_main_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((Main_function_definitionContext)_localctx).v1 = match(T__30);
			setState(391);
			((Main_function_definitionContext)_localctx).m1 = match(T__35);
			setState(392);
			match(T__0);
			setState(393);
			match(T__1);
			setState(394);
			match(T__28);
			setState(395);
			((Main_function_definitionContext)_localctx).b1 = function_definition_body_variables();
			setState(396);
			((Main_function_definitionContext)_localctx).b2 = function_definition_body_statements();
			setState(397);
			match(T__29);
			((Main_function_definitionContext)_localctx).ast =  new FunctionDefinition(
					((Main_function_definitionContext)_localctx).v1.getLine(),
					((Main_function_definitionContext)_localctx).v1.getCharPositionInLine()+1,
					(((Main_function_definitionContext)_localctx).m1!=null?((Main_function_definitionContext)_localctx).m1.getText():null),
					new FunctionType( //tried to refactor this, did not work
			        		((Main_function_definitionContext)_localctx).v1.getLine(),
			        		((Main_function_definitionContext)_localctx).v1.getCharPositionInLine()+1,
			        	    new VoidType(((Main_function_definitionContext)_localctx).v1.getLine(), ((Main_function_definitionContext)_localctx).v1.getCharPositionInLine()+1),
			        	    new ArrayList<VariableDefinition>()
			        	    ),
					((Main_function_definitionContext)_localctx).b1.ast,
					((Main_function_definitionContext)_localctx).b2.ast);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 12:
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
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0193\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16"+
		"\3C\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4f\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0086"+
		"\n\4\f\4\16\4\u0089\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c7\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u00cf\n\t\f\t\16\t\u00d2\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u00da\n\n\f\n\16\n\u00dd\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00e6\n\13\f\13\16\13\u00e9\13\13\3\13\5\13\u00ec\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fa\n\r\f\r\16"+
		"\r\u00fd\13\r\3\r\5\r\u0100\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0109\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0115"+
		"\n\16\f\16\16\16\u0118\13\16\7\16\u011a\n\16\f\16\16\16\u011d\13\16\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0124\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0132\n\21\3\22\3\22\3\22\7\22\u0137"+
		"\n\22\f\22\16\22\u013a\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0142"+
		"\n\23\f\23\16\23\u0145\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u014f\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0157\n\25\f\25\16\25"+
		"\u015a\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0171\n\27\f\27"+
		"\16\27\u0174\13\27\3\27\5\27\u0177\n\27\3\30\3\30\3\30\7\30\u017c\n\30"+
		"\f\30\16\30\u017f\13\30\3\31\3\31\3\31\7\31\u0184\n\31\f\31\16\31\u0187"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\2\4\6\32"+
		"\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\n\f"+
		"\4\2\b\b\r\r\3\2\16\23\3\2\24\25\2\u01a4\2\64\3\2\2\2\4A\3\2\2\2\6e\3"+
		"\2\2\2\b\u008a\3\2\2\2\n\u008d\3\2\2\2\f\u0090\3\2\2\2\16\u00c6\3\2\2"+
		"\2\20\u00c8\3\2\2\2\22\u00d3\3\2\2\2\24\u00eb\3\2\2\2\26\u00ed\3\2\2\2"+
		"\30\u00ff\3\2\2\2\32\u0108\3\2\2\2\34\u0123\3\2\2\2\36\u0125\3\2\2\2 "+
		"\u0131\3\2\2\2\"\u0138\3\2\2\2$\u013b\3\2\2\2&\u014e\3\2\2\2(\u0150\3"+
		"\2\2\2*\u015d\3\2\2\2,\u0176\3\2\2\2.\u017d\3\2\2\2\60\u0185\3\2\2\2\62"+
		"\u0188\3\2\2\2\64\65\5\4\3\2\65\66\5\62\32\2\66\67\b\2\1\2\678\7\2\2\3"+
		"8\3\3\2\2\29:\5(\25\2:;\b\3\1\2;@\3\2\2\2<=\5*\26\2=>\b\3\1\2>@\3\2\2"+
		"\2?9\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CA\3\2"+
		"\2\2DE\b\4\1\2EF\7\3\2\2FG\5\6\4\2GH\b\4\1\2HI\7\4\2\2If\3\2\2\2JK\7\3"+
		"\2\2KL\5 \21\2LM\7\4\2\2MN\5\6\4\16NO\b\4\1\2Of\3\2\2\2PQ\7\b\2\2QR\5"+
		"\6\4\rRS\b\4\1\2Sf\3\2\2\2TU\7\t\2\2UV\5\6\4\fVW\b\4\1\2Wf\3\2\2\2XY\5"+
		"\f\7\2YZ\b\4\1\2Zf\3\2\2\2[\\\5\n\6\2\\]\b\4\1\2]f\3\2\2\2^_\5\b\5\2_"+
		"`\b\4\1\2`f\3\2\2\2ab\7+\2\2bf\b\4\1\2cd\7*\2\2df\b\4\1\2eD\3\2\2\2eJ"+
		"\3\2\2\2eP\3\2\2\2eT\3\2\2\2eX\3\2\2\2e[\3\2\2\2e^\3\2\2\2ea\3\2\2\2e"+
		"c\3\2\2\2f\u0087\3\2\2\2gh\f\13\2\2hi\t\2\2\2ij\5\6\4\fjk\b\4\1\2k\u0086"+
		"\3\2\2\2lm\f\n\2\2mn\t\3\2\2no\5\6\4\13op\b\4\1\2p\u0086\3\2\2\2qr\f\t"+
		"\2\2rs\t\4\2\2st\5\6\4\ntu\b\4\1\2u\u0086\3\2\2\2vw\f\b\2\2wx\t\5\2\2"+
		"xy\5\6\4\tyz\b\4\1\2z\u0086\3\2\2\2{|\f\20\2\2|}\7\5\2\2}~\5\6\4\2~\177"+
		"\7\6\2\2\177\u0080\b\4\1\2\u0080\u0086\3\2\2\2\u0081\u0082\f\17\2\2\u0082"+
		"\u0083\7\7\2\2\u0083\u0084\7(\2\2\u0084\u0086\b\4\1\2\u0085g\3\2\2\2\u0085"+
		"l\3\2\2\2\u0085q\3\2\2\2\u0085v\3\2\2\2\u0085{\3\2\2\2\u0085\u0081\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\7\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7)\2\2\u008b\u008c\b\5\1\2"+
		"\u008c\t\3\2\2\2\u008d\u008e\7(\2\2\u008e\u008f\b\6\1\2\u008f\13\3\2\2"+
		"\2\u0090\u0091\5\n\6\2\u0091\u0092\7\3\2\2\u0092\u0093\5\30\r\2\u0093"+
		"\u0094\b\7\1\2\u0094\u0095\7\4\2\2\u0095\r\3\2\2\2\u0096\u0097\5\6\4\2"+
		"\u0097\u0098\7\26\2\2\u0098\u0099\5\6\4\2\u0099\u009a\7\27\2\2\u009a\u009b"+
		"\b\b\1\2\u009b\u00c7\3\2\2\2\u009c\u009d\7\30\2\2\u009d\u009e\7\3\2\2"+
		"\u009e\u009f\5\6\4\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2"+
		"\b\b\1\2\u00a2\u00c7\3\2\2\2\u00a3\u00a4\7\31\2\2\u00a4\u00a5\7\3\2\2"+
		"\u00a5\u00a6\5\6\4\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9"+
		"\7\32\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\b\b\1\2\u00ab\u00c7\3\2\2"+
		"\2\u00ac\u00ad\7\31\2\2\u00ad\u00ae\7\3\2\2\u00ae\u00af\5\6\4\2\u00af"+
		"\u00b0\7\4\2\2\u00b0\u00b1\5\24\13\2\u00b1\u00b2\b\b\1\2\u00b2\u00c7\3"+
		"\2\2\2\u00b3\u00b4\7\33\2\2\u00b4\u00b5\5\6\4\2\u00b5\u00b6\b\b\1\2\u00b6"+
		"\u00b7\7\27\2\2\u00b7\u00c7\3\2\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00ba\5"+
		"\20\t\2\u00ba\u00bb\b\b\1\2\u00bb\u00bc\7\27\2\2\u00bc\u00c7\3\2\2\2\u00bd"+
		"\u00be\7\35\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\b\b\1\2\u00c0\u00c1\7"+
		"\27\2\2\u00c1\u00c7\3\2\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\b\b\1\2\u00c4"+
		"\u00c5\7\27\2\2\u00c5\u00c7\3\2\2\2\u00c6\u0096\3\2\2\2\u00c6\u009c\3"+
		"\2\2\2\u00c6\u00a3\3\2\2\2\u00c6\u00ac\3\2\2\2\u00c6\u00b3\3\2\2\2\u00c6"+
		"\u00b8\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\17\3\2\2"+
		"\2\u00c8\u00c9\5\6\4\2\u00c9\u00d0\b\t\1\2\u00ca\u00cb\7\36\2\2\u00cb"+
		"\u00cc\5\6\4\2\u00cc\u00cd\b\t\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2"+
		"\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\21\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\5\6\4\2\u00d4\u00db\b\n\1"+
		"\2\u00d5\u00d6\7\36\2\2\u00d6\u00d7\5\6\4\2\u00d7\u00d8\b\n\1\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\23\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df"+
		"\5\16\b\2\u00df\u00e0\b\13\1\2\u00e0\u00ec\3\2\2\2\u00e1\u00e7\7\37\2"+
		"\2\u00e2\u00e3\5\16\b\2\u00e3\u00e4\b\13\1\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\7 \2\2\u00eb"+
		"\u00de\3\2\2\2\u00eb\u00e1\3\2\2\2\u00ec\25\3\2\2\2\u00ed\u00ee\5\n\6"+
		"\2\u00ee\u00ef\7\3\2\2\u00ef\u00f0\5\30\r\2\u00f0\u00f1\b\f\1\2\u00f1"+
		"\u00f2\7\4\2\2\u00f2\27\3\2\2\2\u00f3\u00f4\5\6\4\2\u00f4\u00fb\b\r\1"+
		"\2\u00f5\u00f6\7\36\2\2\u00f6\u00f7\5\6\4\2\u00f7\u00f8\b\r\1\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00f3\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\31\3\2\2"+
		"\2\u0101\u0102\b\16\1\2\u0102\u0103\5 \21\2\u0103\u0104\b\16\1\2\u0104"+
		"\u0109\3\2\2\2\u0105\u0106\5\36\20\2\u0106\u0107\b\16\1\2\u0107\u0109"+
		"\3\2\2\2\u0108\u0101\3\2\2\2\u0108\u0105\3\2\2\2\u0109\u011b\3\2\2\2\u010a"+
		"\u010b\f\5\2\2\u010b\u010c\7\5\2\2\u010c\u010d\5\b\5\2\u010d\u010e\7\6"+
		"\2\2\u010e\u0116\b\16\1\2\u010f\u0110\7\5\2\2\u0110\u0111\5\b\5\2\u0111"+
		"\u0112\7\6\2\2\u0112\u0113\b\16\1\2\u0113\u0115\3\2\2\2\u0114\u010f\3"+
		"\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u010a\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\33\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011e\u011f\5 \21\2\u011f\u0120\b\17\1\2\u0120\u0124\3\2\2\2"+
		"\u0121\u0122\7!\2\2\u0122\u0124\b\17\1\2\u0123\u011e\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\35\3\2\2\2\u0125\u0126\7\"\2\2\u0126\u0127\7\37\2\2\u0127"+
		"\u0128\5\"\22\2\u0128\u0129\7 \2\2\u0129\u012a\b\20\1\2\u012a\37\3\2\2"+
		"\2\u012b\u012c\7#\2\2\u012c\u0132\b\21\1\2\u012d\u012e\7$\2\2\u012e\u0132"+
		"\b\21\1\2\u012f\u0130\7%\2\2\u0130\u0132\b\21\1\2\u0131\u012b\3\2\2\2"+
		"\u0131\u012d\3\2\2\2\u0131\u012f\3\2\2\2\u0132!\3\2\2\2\u0133\u0134\5"+
		"$\23\2\u0134\u0135\b\22\1\2\u0135\u0137\3\2\2\2\u0136\u0133\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139#\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013b\u013c\5\32\16\2\u013c\u013d\7(\2\2\u013d\u0143"+
		"\b\23\1\2\u013e\u013f\7\36\2\2\u013f\u0140\7(\2\2\u0140\u0142\b\23\1\2"+
		"\u0141\u013e\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\27\2\2"+
		"\u0147%\3\2\2\2\u0148\u0149\5(\25\2\u0149\u014a\b\24\1\2\u014a\u014f\3"+
		"\2\2\2\u014b\u014c\5*\26\2\u014c\u014d\b\24\1\2\u014d\u014f\3\2\2\2\u014e"+
		"\u0148\3\2\2\2\u014e\u014b\3\2\2\2\u014f\'\3\2\2\2\u0150\u0151\5\32\16"+
		"\2\u0151\u0152\7(\2\2\u0152\u0158\b\25\1\2\u0153\u0154\7\36\2\2\u0154"+
		"\u0155\7(\2\2\u0155\u0157\b\25\1\2\u0156\u0153\3\2\2\2\u0157\u015a\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015b\u015c\7\27\2\2\u015c)\3\2\2\2\u015d\u015e\5\34\17"+
		"\2\u015e\u015f\7(\2\2\u015f\u0160\7\3\2\2\u0160\u0161\5,\27\2\u0161\u0162"+
		"\7\4\2\2\u0162\u0163\7\37\2\2\u0163\u0164\5.\30\2\u0164\u0165\5\60\31"+
		"\2\u0165\u0166\7 \2\2\u0166\u0167\b\26\1\2\u0167+\3\2\2\2\u0168\u0169"+
		"\5\32\16\2\u0169\u016a\7(\2\2\u016a\u0172\b\27\1\2\u016b\u016c\7\36\2"+
		"\2\u016c\u016d\5\32\16\2\u016d\u016e\7(\2\2\u016e\u016f\b\27\1\2\u016f"+
		"\u0171\3\2\2\2\u0170\u016b\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0177\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0168\3\2\2\2\u0176\u0175\3\2\2\2\u0177-\3\2\2\2"+
		"\u0178\u0179\5(\25\2\u0179\u017a\b\30\1\2\u017a\u017c\3\2\2\2\u017b\u0178"+
		"\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"/\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\5\16\b\2\u0181\u0182\b\31\1"+
		"\2\u0182\u0184\3\2\2\2\u0183\u0180\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\61\3\2\2\2\u0187\u0185\3\2\2\2\u0188"+
		"\u0189\7!\2\2\u0189\u018a\7&\2\2\u018a\u018b\7\3\2\2\u018b\u018c\7\4\2"+
		"\2\u018c\u018d\7\37\2\2\u018d\u018e\5.\30\2\u018e\u018f\5\60\31\2\u018f"+
		"\u0190\7 \2\2\u0190\u0191\b\32\1\2\u0191\63\3\2\2\2\33?Ae\u0085\u0087"+
		"\u00c6\u00d0\u00db\u00e7\u00eb\u00fb\u00ff\u0108\u0116\u011b\u0123\u0131"+
		"\u0138\u0143\u014e\u0158\u0172\u0176\u017d\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}