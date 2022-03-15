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
		RULE_program = 0, RULE_programDefinitions = 1, RULE_expression = 2, RULE_variable = 3, 
		RULE_function_invocation = 4, RULE_statement = 5, RULE_readWriteBlock = 6, 
		RULE_block = 7, RULE_procedure_invocation = 8, RULE_arguments = 9, RULE_type = 10, 
		RULE_returnable_type = 11, RULE_struct_type = 12, RULE_builtin_type = 13, 
		RULE_struct_body = 14, RULE_record_field_line = 15, RULE_definition = 16, 
		RULE_variable_definition = 17, RULE_function_definition = 18, RULE_function_definition_parameter_declaration = 19, 
		RULE_function_definition_body_variables = 20, RULE_function_definition_body_statements = 21, 
		RULE_main_function_definition = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programDefinitions", "expression", "variable", "function_invocation", 
			"statement", "readWriteBlock", "block", "procedure_invocation", "arguments", 
			"type", "returnable_type", "struct_type", "builtin_type", "struct_body", 
			"record_field_line", "definition", "variable_definition", "function_definition", 
			"function_definition_parameter_declaration", "function_definition_body_variables", 
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
			setState(46);
			((ProgramContext)_localctx).d1 = programDefinitions();
			setState(47);
			((ProgramContext)_localctx).m1 = main_function_definition();
			((ProgramContext)_localctx).ast =  new Program(0,0, ((ProgramContext)_localctx).d1.ast, ((ProgramContext)_localctx).m1.ast);
			setState(49);
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
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						{
						setState(51);
						((ProgramDefinitionsContext)_localctx).v1 = variable_definition();

								for (Definition d : ((ProgramDefinitionsContext)_localctx).v1.ast) _localctx.ast.add(d);
							
						}
						}
						break;
					case 2:
						{
						{
						setState(54);
						((ProgramDefinitionsContext)_localctx).f1 = function_definition();

								_localctx.ast.add(((ProgramDefinitionsContext)_localctx).f1.ast);
							
						}
						}
						break;
					}
					} 
				}
				setState(61);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(63);
				match(T__0);
				setState(64);
				((ExpressionContext)_localctx).e1 = expression(0);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast;
				setState(66);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(68);
				match(T__0);
				setState(69);
				((ExpressionContext)_localctx).b1 = builtin_type();
				setState(70);
				match(T__1);
				setState(71);
				((ExpressionContext)_localctx).e1 = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).b1.ast.getLine(), ((ExpressionContext)_localctx).b1.ast.getColumn(),
							((ExpressionContext)_localctx).b1.ast, ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 3:
				{
				setState(74);
				match(T__5);
				setState(75);
				((ExpressionContext)_localctx).e1 = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
				            ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 4:
				{
				setState(78);
				match(T__6);
				setState(79);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
							((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 5:
				{
				setState(82);
				((ExpressionContext)_localctx).f1 = function_invocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).f1.ast;
				}
				break;
			case 6:
				{
				setState(85);
				((ExpressionContext)_localctx).id = variable();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).id.ast;
				}
				break;
			case 7:
				{
				setState(88);
				((ExpressionContext)_localctx).i1 = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).i1.getLine(), ((ExpressionContext)_localctx).i1.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i1!=null?((ExpressionContext)_localctx).i1.getText():null))); 
				}
				break;
			case 8:
				{
				setState(90);
				((ExpressionContext)_localctx).r1 = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).r1.getLine(), ((ExpressionContext)_localctx).r1.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).r1!=null?((ExpressionContext)_localctx).r1.getText():null))); 
				}
				break;
			case 9:
				{
				setState(92);
				((ExpressionContext)_localctx).c1 = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).c1.getLine(), ((ExpressionContext)_localctx).c1.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c1!=null?((ExpressionContext)_localctx).c1.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(97);
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
						setState(98);
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
						setState(101);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(102);
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
						setState(103);
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
						setState(106);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(107);
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
						setState(108);
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
						setState(111);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(112);
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
						setState(113);
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
						setState(116);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(117);
						match(T__2);
						setState(118);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(119);
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
						setState(122);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(123);
						match(T__4);
						setState(124);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
						          			(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast);
						}
						break;
					}
					} 
				}
				setState(130);
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
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		enterRule(_localctx, 8, RULE_function_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((Function_invocationContext)_localctx).e1 = variable();
			setState(135);
			match(T__0);
			setState(136);
			((Function_invocationContext)_localctx).a1 = arguments();
			((Function_invocationContext)_localctx).ast =  new FunctionInvocation(((Function_invocationContext)_localctx).e1.ast.getLine(), ((Function_invocationContext)_localctx).e1.ast.getColumn(), ((Function_invocationContext)_localctx).e1.ast, ((Function_invocationContext)_localctx).a1.ast);
			setState(138);
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
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((StatementContext)_localctx).e1 = expression(0);
				setState(141);
				match(T__19);
				setState(142);
				((StatementContext)_localctx).e2 = expression(0);
				setState(143);
				match(T__20);
				((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__21);
				setState(147);
				match(T__0);
				setState(148);
				((StatementContext)_localctx).e1 = expression(0);
				setState(149);
				match(T__1);
				setState(150);
				((StatementContext)_localctx).b1 = block();
				((StatementContext)_localctx).ast =  new WhileLoop(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__22);
				setState(154);
				match(T__0);
				setState(155);
				((StatementContext)_localctx).e1 = expression(0);
				setState(156);
				match(T__1);
				setState(157);
				((StatementContext)_localctx).b1 = block();
				setState(158);
				match(T__23);
				setState(159);
				((StatementContext)_localctx).b2 = block();
				((StatementContext)_localctx).ast =  new IfElse(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).b2.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(T__22);
				setState(163);
				match(T__0);
				setState(164);
				((StatementContext)_localctx).e1 = expression(0);
				setState(165);
				match(T__1);
				setState(166);
				((StatementContext)_localctx).b1 = block();
				((StatementContext)_localctx).ast =  new IfElse(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(T__24);
				setState(170);
				((StatementContext)_localctx).e1 = expression(0);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast);
				setState(172);
				match(T__20);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				((StatementContext)_localctx).s = match(T__25);
				setState(175);
				((StatementContext)_localctx).r1 = readWriteBlock();
				((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).s.getLine(), ((StatementContext)_localctx).s.getCharPositionInLine()+1, ((StatementContext)_localctx).r1.ast);
				setState(177);
				match(T__20);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				((StatementContext)_localctx).s = match(T__26);
				setState(180);
				((StatementContext)_localctx).r1 = readWriteBlock();
				((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).s.getLine(), ((StatementContext)_localctx).s.getCharPositionInLine()+1, ((StatementContext)_localctx).r1.ast);
				setState(182);
				match(T__20);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				((StatementContext)_localctx).p1 = procedure_invocation();
				((StatementContext)_localctx).ast =  ((StatementContext)_localctx).p1.ast;
				setState(186);
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
		enterRule(_localctx, 12, RULE_readWriteBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			((ReadWriteBlockContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ReadWriteBlockContext)_localctx).e1.ast);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(192);
				match(T__27);
				setState(193);
				((ReadWriteBlockContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ReadWriteBlockContext)_localctx).e2.ast);
				}
				}
				setState(200);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			setState(214);
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
				setState(201);
				((BlockContext)_localctx).s1 = statement();
				_localctx.ast.add(((BlockContext)_localctx).s1.ast);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(T__28);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					{
					setState(205);
					((BlockContext)_localctx).s1 = statement();
					_localctx.ast.add(((BlockContext)_localctx).s1.ast);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
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
		enterRule(_localctx, 16, RULE_procedure_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((Procedure_invocationContext)_localctx).v1 = variable();
			setState(217);
			match(T__0);
			setState(218);
			((Procedure_invocationContext)_localctx).a1 = arguments();
			((Procedure_invocationContext)_localctx).ast =  new FunctionInvocation(((Procedure_invocationContext)_localctx).v1.ast.getLine(), ((Procedure_invocationContext)_localctx).v1.ast.getColumn(), ((Procedure_invocationContext)_localctx).v1.ast,
			    			((Procedure_invocationContext)_localctx).a1.ast);
			setState(220);
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
		enterRule(_localctx, 18, RULE_arguments);
		int _la;
		try {
			setState(234);
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
				setState(222);
				((ArgumentsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ArgumentsContext)_localctx).e1.ast);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(224);
					match(T__27);
					setState(225);
					((ArgumentsContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ArgumentsContext)_localctx).e2.ast);
					}
					}
					setState(232);
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
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Builtin_typeContext builtin_type() {
			return getRuleContext(Builtin_typeContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				{
				setState(237);
				((TypeContext)_localctx).b1 = builtin_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b1.ast;
				}
				break;
			case T__31:
				{
				setState(240);
				((TypeContext)_localctx).s1 = struct_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).s1.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
					setState(245);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(246);
					match(T__2);
					setState(247);
					((TypeContext)_localctx).e1 = expression(0);
					setState(248);
					match(T__3);
					((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).t1.ast.getLine(), ((TypeContext)_localctx).t1.ast.getColumn(), ((TypeContext)_localctx).e1.ast, ((TypeContext)_localctx).t1.ast);
					setState(257);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(250);
							match(T__2);
							setState(251);
							((TypeContext)_localctx).e2 = expression(0);
							setState(252);
							match(T__3);
							((ArrayType)_localctx.ast).setType(new ArrayType(((TypeContext)_localctx).t1.ast.getLine(), ((TypeContext)_localctx).t1.ast.getColumn(), ((TypeContext)_localctx).e2.ast, ((TypeContext)_localctx).t1.ast));
							}
							} 
						}
						setState(259);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 22, RULE_returnable_type);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				((Returnable_typeContext)_localctx).b1 = builtin_type();
				((Returnable_typeContext)_localctx).ast =  ((Returnable_typeContext)_localctx).b1.ast;
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
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
		enterRule(_localctx, 24, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((Struct_typeContext)_localctx).s1 = match(T__31);
			setState(273);
			match(T__28);
			setState(274);
			((Struct_typeContext)_localctx).b2 = struct_body();
			setState(275);
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
		enterRule(_localctx, 26, RULE_builtin_type);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((Builtin_typeContext)_localctx).s = match(T__32);
				((Builtin_typeContext)_localctx).ast =  new IntType(((Builtin_typeContext)_localctx).s.getLine(), ((Builtin_typeContext)_localctx).s.getCharPositionInLine()+1);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((Builtin_typeContext)_localctx).s = match(T__33);
				((Builtin_typeContext)_localctx).ast =  new DoubleType(((Builtin_typeContext)_localctx).s.getLine(), ((Builtin_typeContext)_localctx).s.getCharPositionInLine()+1);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
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
		enterRule(_localctx, 28, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(286);
				((Struct_bodyContext)_localctx).r1 = record_field_line();
				for (RecordField r : ((Struct_bodyContext)_localctx).r1.ast) _localctx.ast.add(r);
				}
				}
				setState(293);
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
		enterRule(_localctx, 30, RULE_record_field_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			((Record_field_lineContext)_localctx).t1 = type(0);
			{
			setState(295);
			((Record_field_lineContext)_localctx).i1 = match(ID);
			_localctx.ast.add(new RecordField((((Record_field_lineContext)_localctx).i1!=null?((Record_field_lineContext)_localctx).i1.getText():null), ((Record_field_lineContext)_localctx).t1.ast));
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(297);
				match(T__27);
				setState(298);
				((Record_field_lineContext)_localctx).i2 = match(ID);
				_localctx.ast.add(new RecordField((((Record_field_lineContext)_localctx).i2!=null?((Record_field_lineContext)_localctx).i2.getText():null), ((Record_field_lineContext)_localctx).t1.ast));
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(305);
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
		enterRule(_localctx, 32, RULE_definition);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				((DefinitionContext)_localctx).v1 = variable_definition();
				for (Definition d : ((DefinitionContext)_localctx).v1.ast) _localctx.ast.add(d);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
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
		enterRule(_localctx, 34, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			((Variable_definitionContext)_localctx).t1 = type(0);
			{
			setState(316);
			((Variable_definitionContext)_localctx).i1 = match(ID);
			_localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).t1.ast.getLine(), ((Variable_definitionContext)_localctx).t1.ast.getColumn(), (((Variable_definitionContext)_localctx).i1!=null?((Variable_definitionContext)_localctx).i1.getText():null), ((Variable_definitionContext)_localctx).t1.ast));
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(318);
				match(T__27);
				setState(319);
				((Variable_definitionContext)_localctx).i2 = match(ID);
				_localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).t1.ast.getLine(), ((Variable_definitionContext)_localctx).t1.ast.getColumn(), (((Variable_definitionContext)_localctx).i2!=null?((Variable_definitionContext)_localctx).i2.getText():null), ((Variable_definitionContext)_localctx).t1.ast));
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(326);
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
		enterRule(_localctx, 36, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(328);
			((Function_definitionContext)_localctx).r1 = returnable_type();
			}
			setState(329);
			((Function_definitionContext)_localctx).i1 = match(ID);
			setState(330);
			match(T__0);
			setState(331);
			((Function_definitionContext)_localctx).f1 = function_definition_parameter_declaration();
			setState(332);
			match(T__1);
			setState(333);
			match(T__28);
			setState(334);
			((Function_definitionContext)_localctx).b1 = function_definition_body_variables();
			setState(335);
			((Function_definitionContext)_localctx).b2 = function_definition_body_statements();
			setState(336);
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
		enterRule(_localctx, 38, RULE_function_definition_parameter_declaration);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(339);
				((Function_definition_parameter_declarationContext)_localctx).t1 = type(0);
				setState(340);
				((Function_definition_parameter_declarationContext)_localctx).i1 = match(ID);
				_localctx.ast.add(new VariableDefinition(((Function_definition_parameter_declarationContext)_localctx).t1.ast.getLine(), ((Function_definition_parameter_declarationContext)_localctx).t1.ast.getColumn(), (((Function_definition_parameter_declarationContext)_localctx).i1!=null?((Function_definition_parameter_declarationContext)_localctx).i1.getText():null), ((Function_definition_parameter_declarationContext)_localctx).t1.ast));
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(342);
					match(T__27);
					setState(343);
					((Function_definition_parameter_declarationContext)_localctx).t2 = type(0);
					setState(344);
					((Function_definition_parameter_declarationContext)_localctx).i2 = match(ID);
					_localctx.ast.add(new VariableDefinition(((Function_definition_parameter_declarationContext)_localctx).t2.ast.getLine(), ((Function_definition_parameter_declarationContext)_localctx).t2.ast.getColumn(), (((Function_definition_parameter_declarationContext)_localctx).i2!=null?((Function_definition_parameter_declarationContext)_localctx).i2.getText():null), ((Function_definition_parameter_declarationContext)_localctx).t2.ast));
					}
					}
					setState(351);
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
		enterRule(_localctx, 40, RULE_function_definition_body_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(355);
				((Function_definition_body_variablesContext)_localctx).v1 = variable_definition();
				for (VariableDefinition d : ((Function_definition_body_variablesContext)_localctx).v1.ast) _localctx.ast.add(d);
				}
				}
				setState(362);
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
		enterRule(_localctx, 42, RULE_function_definition_body_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(363);
				((Function_definition_body_statementsContext)_localctx).s1 = statement();
				_localctx.ast.add(((Function_definition_body_statementsContext)_localctx).s1.ast);
				}
				}
				setState(370);
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
		enterRule(_localctx, 44, RULE_main_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			((Main_function_definitionContext)_localctx).v1 = match(T__30);
			setState(372);
			((Main_function_definitionContext)_localctx).m1 = match(T__35);
			setState(373);
			match(T__0);
			setState(374);
			match(T__1);
			setState(375);
			match(T__28);
			setState(376);
			((Main_function_definitionContext)_localctx).b1 = function_definition_body_variables();
			setState(377);
			((Main_function_definitionContext)_localctx).b2 = function_definition_body_statements();
			setState(378);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0180\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00bf\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c7\n\b"+
		"\f\b\16\b\u00ca\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d3\n\t\f\t\16"+
		"\t\u00d6\13\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00e7\n\13\f\13\16\13\u00ea\13\13\3\13\5\13\u00ed"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f6\n\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u0102\n\f\f\f\16\f\u0105\13\f\7\f\u0107\n\f\f\f"+
		"\16\f\u010a\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u0111\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u011f\n\17\3\20\3\20\3\20"+
		"\7\20\u0124\n\20\f\20\16\20\u0127\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u012f\n\21\f\21\16\21\u0132\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u013c\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0144\n"+
		"\23\f\23\16\23\u0147\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u015e"+
		"\n\25\f\25\16\25\u0161\13\25\3\25\5\25\u0164\n\25\3\26\3\26\3\26\7\26"+
		"\u0169\n\26\f\26\16\26\u016c\13\26\3\27\3\27\3\27\7\27\u0171\n\27\f\27"+
		"\16\27\u0174\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\2\4\6\26\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\6\3"+
		"\2\n\f\4\2\b\b\r\r\3\2\16\23\3\2\24\25\2\u0192\2\60\3\2\2\2\4=\3\2\2\2"+
		"\6`\3\2\2\2\b\u0085\3\2\2\2\n\u0088\3\2\2\2\f\u00be\3\2\2\2\16\u00c0\3"+
		"\2\2\2\20\u00d8\3\2\2\2\22\u00da\3\2\2\2\24\u00ec\3\2\2\2\26\u00f5\3\2"+
		"\2\2\30\u0110\3\2\2\2\32\u0112\3\2\2\2\34\u011e\3\2\2\2\36\u0125\3\2\2"+
		"\2 \u0128\3\2\2\2\"\u013b\3\2\2\2$\u013d\3\2\2\2&\u014a\3\2\2\2(\u0163"+
		"\3\2\2\2*\u016a\3\2\2\2,\u0172\3\2\2\2.\u0175\3\2\2\2\60\61\5\4\3\2\61"+
		"\62\5.\30\2\62\63\b\2\1\2\63\64\7\2\2\3\64\3\3\2\2\2\65\66\5$\23\2\66"+
		"\67\b\3\1\2\67<\3\2\2\289\5&\24\29:\b\3\1\2:<\3\2\2\2;\65\3\2\2\2;8\3"+
		"\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?=\3\2\2\2@A\b\4\1\2AB"+
		"\7\3\2\2BC\5\6\4\2CD\b\4\1\2DE\7\4\2\2Ea\3\2\2\2FG\7\3\2\2GH\5\34\17\2"+
		"HI\7\4\2\2IJ\5\6\4\16JK\b\4\1\2Ka\3\2\2\2LM\7\b\2\2MN\5\6\4\rNO\b\4\1"+
		"\2Oa\3\2\2\2PQ\7\t\2\2QR\5\6\4\fRS\b\4\1\2Sa\3\2\2\2TU\5\n\6\2UV\b\4\1"+
		"\2Va\3\2\2\2WX\5\b\5\2XY\b\4\1\2Ya\3\2\2\2Z[\7)\2\2[a\b\4\1\2\\]\7+\2"+
		"\2]a\b\4\1\2^_\7*\2\2_a\b\4\1\2`@\3\2\2\2`F\3\2\2\2`L\3\2\2\2`P\3\2\2"+
		"\2`T\3\2\2\2`W\3\2\2\2`Z\3\2\2\2`\\\3\2\2\2`^\3\2\2\2a\u0082\3\2\2\2b"+
		"c\f\13\2\2cd\t\2\2\2de\5\6\4\fef\b\4\1\2f\u0081\3\2\2\2gh\f\n\2\2hi\t"+
		"\3\2\2ij\5\6\4\13jk\b\4\1\2k\u0081\3\2\2\2lm\f\t\2\2mn\t\4\2\2no\5\6\4"+
		"\nop\b\4\1\2p\u0081\3\2\2\2qr\f\b\2\2rs\t\5\2\2st\5\6\4\ttu\b\4\1\2u\u0081"+
		"\3\2\2\2vw\f\20\2\2wx\7\5\2\2xy\5\6\4\2yz\7\6\2\2z{\b\4\1\2{\u0081\3\2"+
		"\2\2|}\f\17\2\2}~\7\7\2\2~\177\7(\2\2\177\u0081\b\4\1\2\u0080b\3\2\2\2"+
		"\u0080g\3\2\2\2\u0080l\3\2\2\2\u0080q\3\2\2\2\u0080v\3\2\2\2\u0080|\3"+
		"\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\7\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7(\2\2\u0086\u0087\b\5\1\2"+
		"\u0087\t\3\2\2\2\u0088\u0089\5\b\5\2\u0089\u008a\7\3\2\2\u008a\u008b\5"+
		"\24\13\2\u008b\u008c\b\6\1\2\u008c\u008d\7\4\2\2\u008d\13\3\2\2\2\u008e"+
		"\u008f\5\6\4\2\u008f\u0090\7\26\2\2\u0090\u0091\5\6\4\2\u0091\u0092\7"+
		"\27\2\2\u0092\u0093\b\7\1\2\u0093\u00bf\3\2\2\2\u0094\u0095\7\30\2\2\u0095"+
		"\u0096\7\3\2\2\u0096\u0097\5\6\4\2\u0097\u0098\7\4\2\2\u0098\u0099\5\20"+
		"\t\2\u0099\u009a\b\7\1\2\u009a\u00bf\3\2\2\2\u009b\u009c\7\31\2\2\u009c"+
		"\u009d\7\3\2\2\u009d\u009e\5\6\4\2\u009e\u009f\7\4\2\2\u009f\u00a0\5\20"+
		"\t\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\5\20\t\2\u00a2\u00a3\b\7\1\2\u00a3"+
		"\u00bf\3\2\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5"+
		"\6\4\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\b\7\1\2\u00aa"+
		"\u00bf\3\2\2\2\u00ab\u00ac\7\33\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae\b"+
		"\7\1\2\u00ae\u00af\7\27\2\2\u00af\u00bf\3\2\2\2\u00b0\u00b1\7\34\2\2\u00b1"+
		"\u00b2\5\16\b\2\u00b2\u00b3\b\7\1\2\u00b3\u00b4\7\27\2\2\u00b4\u00bf\3"+
		"\2\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b7\5\16\b\2\u00b7\u00b8\b\7\1\2\u00b8"+
		"\u00b9\7\27\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\5\22\n\2\u00bb\u00bc\b"+
		"\7\1\2\u00bc\u00bd\7\27\2\2\u00bd\u00bf\3\2\2\2\u00be\u008e\3\2\2\2\u00be"+
		"\u0094\3\2\2\2\u00be\u009b\3\2\2\2\u00be\u00a4\3\2\2\2\u00be\u00ab\3\2"+
		"\2\2\u00be\u00b0\3\2\2\2\u00be\u00b5\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf"+
		"\r\3\2\2\2\u00c0\u00c1\5\6\4\2\u00c1\u00c8\b\b\1\2\u00c2\u00c3\7\36\2"+
		"\2\u00c3\u00c4\5\6\4\2\u00c4\u00c5\b\b\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\17\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\f\7\2\u00cc\u00cd\b\t\1"+
		"\2\u00cd\u00d9\3\2\2\2\u00ce\u00d4\7\37\2\2\u00cf\u00d0\5\f\7\2\u00d0"+
		"\u00d1\b\t\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d9\7 \2\2\u00d8\u00cb\3\2\2\2\u00d8\u00ce\3\2"+
		"\2\2\u00d9\21\3\2\2\2\u00da\u00db\5\b\5\2\u00db\u00dc\7\3\2\2\u00dc\u00dd"+
		"\5\24\13\2\u00dd\u00de\b\n\1\2\u00de\u00df\7\4\2\2\u00df\23\3\2\2\2\u00e0"+
		"\u00e1\5\6\4\2\u00e1\u00e8\b\13\1\2\u00e2\u00e3\7\36\2\2\u00e3\u00e4\5"+
		"\6\4\2\u00e4\u00e5\b\13\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ed\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\25\3\2\2\2\u00ee\u00ef\b\f\1\2\u00ef\u00f0\5\34\17"+
		"\2\u00f0\u00f1\b\f\1\2\u00f1\u00f6\3\2\2\2\u00f2\u00f3\5\32\16\2\u00f3"+
		"\u00f4\b\f\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00f2\3\2"+
		"\2\2\u00f6\u0108\3\2\2\2\u00f7\u00f8\f\5\2\2\u00f8\u00f9\7\5\2\2\u00f9"+
		"\u00fa\5\6\4\2\u00fa\u00fb\7\6\2\2\u00fb\u0103\b\f\1\2\u00fc\u00fd\7\5"+
		"\2\2\u00fd\u00fe\5\6\4\2\u00fe\u00ff\7\6\2\2\u00ff\u0100\b\f\1\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00fc\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u00f7\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\27\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\5\34\17\2\u010c"+
		"\u010d\b\r\1\2\u010d\u0111\3\2\2\2\u010e\u010f\7!\2\2\u010f\u0111\b\r"+
		"\1\2\u0110\u010b\3\2\2\2\u0110\u010e\3\2\2\2\u0111\31\3\2\2\2\u0112\u0113"+
		"\7\"\2\2\u0113\u0114\7\37\2\2\u0114\u0115\5\36\20\2\u0115\u0116\7 \2\2"+
		"\u0116\u0117\b\16\1\2\u0117\33\3\2\2\2\u0118\u0119\7#\2\2\u0119\u011f"+
		"\b\17\1\2\u011a\u011b\7$\2\2\u011b\u011f\b\17\1\2\u011c\u011d\7%\2\2\u011d"+
		"\u011f\b\17\1\2\u011e\u0118\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011c\3"+
		"\2\2\2\u011f\35\3\2\2\2\u0120\u0121\5 \21\2\u0121\u0122\b\20\1\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\37\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129"+
		"\5\26\f\2\u0129\u012a\7(\2\2\u012a\u0130\b\21\1\2\u012b\u012c\7\36\2\2"+
		"\u012c\u012d\7(\2\2\u012d\u012f\b\21\1\2\u012e\u012b\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0134\7\27\2\2\u0134!\3\2\2\2\u0135\u0136\5$\23\2"+
		"\u0136\u0137\b\22\1\2\u0137\u013c\3\2\2\2\u0138\u0139\5&\24\2\u0139\u013a"+
		"\b\22\1\2\u013a\u013c\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0138\3\2\2\2"+
		"\u013c#\3\2\2\2\u013d\u013e\5\26\f\2\u013e\u013f\7(\2\2\u013f\u0145\b"+
		"\23\1\2\u0140\u0141\7\36\2\2\u0141\u0142\7(\2\2\u0142\u0144\b\23\1\2\u0143"+
		"\u0140\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\27\2\2\u0149"+
		"%\3\2\2\2\u014a\u014b\5\30\r\2\u014b\u014c\7(\2\2\u014c\u014d\7\3\2\2"+
		"\u014d\u014e\5(\25\2\u014e\u014f\7\4\2\2\u014f\u0150\7\37\2\2\u0150\u0151"+
		"\5*\26\2\u0151\u0152\5,\27\2\u0152\u0153\7 \2\2\u0153\u0154\b\24\1\2\u0154"+
		"\'\3\2\2\2\u0155\u0156\5\26\f\2\u0156\u0157\7(\2\2\u0157\u015f\b\25\1"+
		"\2\u0158\u0159\7\36\2\2\u0159\u015a\5\26\f\2\u015a\u015b\7(\2\2\u015b"+
		"\u015c\b\25\1\2\u015c\u015e\3\2\2\2\u015d\u0158\3\2\2\2\u015e\u0161\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0164\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0155\3\2\2\2\u0163\u0162\3\2"+
		"\2\2\u0164)\3\2\2\2\u0165\u0166\5$\23\2\u0166\u0167\b\26\1\2\u0167\u0169"+
		"\3\2\2\2\u0168\u0165\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b+\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\5\f\7\2"+
		"\u016e\u016f\b\27\1\2\u016f\u0171\3\2\2\2\u0170\u016d\3\2\2\2\u0171\u0174"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173-\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0176\7!\2\2\u0176\u0177\7&\2\2\u0177\u0178\7\3\2"+
		"\2\u0178\u0179\7\4\2\2\u0179\u017a\7\37\2\2\u017a\u017b\5*\26\2\u017b"+
		"\u017c\5,\27\2\u017c\u017d\7 \2\2\u017d\u017e\b\30\1\2\u017e/\3\2\2\2"+
		"\32;=`\u0080\u0082\u00be\u00c8\u00d4\u00d8\u00e8\u00ec\u00f5\u0103\u0108"+
		"\u0110\u011e\u0125\u0130\u013b\u0145\u015f\u0163\u016a\u0172";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}