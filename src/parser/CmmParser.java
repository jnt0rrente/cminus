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
		RULE_function_invocation = 4, RULE_statement = 5, RULE_readBlock = 6, 
		RULE_writeBlock = 7, RULE_block = 8, RULE_procedure_invocation = 9, RULE_arguments = 10, 
		RULE_type = 11, RULE_returnable_type = 12, RULE_struct_type = 13, RULE_builtin_type = 14, 
		RULE_struct_body = 15, RULE_record_field_line = 16, RULE_definition = 17, 
		RULE_variable_definition = 18, RULE_function_definition = 19, RULE_function_definition_parameter_declaration = 20, 
		RULE_function_definition_body_variables = 21, RULE_function_definition_body_statements = 22, 
		RULE_main_function_definition = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programDefinitions", "expression", "variable", "function_invocation", 
			"statement", "readBlock", "writeBlock", "block", "procedure_invocation", 
			"arguments", "type", "returnable_type", "struct_type", "builtin_type", 
			"struct_body", "record_field_line", "definition", "variable_definition", 
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
			setState(48);
			((ProgramContext)_localctx).d1 = programDefinitions();
			setState(49);
			((ProgramContext)_localctx).m1 = main_function_definition();
			((ProgramContext)_localctx).ast =  new Program(0,0, ((ProgramContext)_localctx).d1.ast, ((ProgramContext)_localctx).m1.ast);
			setState(51);
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
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						{
						setState(53);
						((ProgramDefinitionsContext)_localctx).v1 = variable_definition();

								for (Definition d : ((ProgramDefinitionsContext)_localctx).v1.ast) _localctx.ast.add(d);
							
						}
						}
						break;
					case 2:
						{
						{
						setState(56);
						((ProgramDefinitionsContext)_localctx).f1 = function_definition();

								_localctx.ast.add(((ProgramDefinitionsContext)_localctx).f1.ast);
							
						}
						}
						break;
					}
					} 
				}
				setState(63);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(65);
				match(T__0);
				setState(66);
				((ExpressionContext)_localctx).e1 = expression(0);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast;
				setState(68);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(70);
				match(T__0);
				setState(71);
				((ExpressionContext)_localctx).b1 = builtin_type();
				setState(72);
				match(T__1);
				setState(73);
				((ExpressionContext)_localctx).e1 = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).b1.ast.getLine(), ((ExpressionContext)_localctx).b1.ast.getColumn(),
							((ExpressionContext)_localctx).b1.ast, ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 3:
				{
				setState(76);
				match(T__5);
				setState(77);
				((ExpressionContext)_localctx).e1 = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
				            ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 4:
				{
				setState(80);
				match(T__6);
				setState(81);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
							((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 5:
				{
				setState(84);
				((ExpressionContext)_localctx).f1 = function_invocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).f1.ast;
				}
				break;
			case 6:
				{
				setState(87);
				((ExpressionContext)_localctx).id = variable();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).id.ast;
				}
				break;
			case 7:
				{
				setState(90);
				((ExpressionContext)_localctx).i1 = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).i1.getLine(), ((ExpressionContext)_localctx).i1.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i1!=null?((ExpressionContext)_localctx).i1.getText():null))); 
				}
				break;
			case 8:
				{
				setState(92);
				((ExpressionContext)_localctx).r1 = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).r1.getLine(), ((ExpressionContext)_localctx).r1.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).r1!=null?((ExpressionContext)_localctx).r1.getText():null))); 
				}
				break;
			case 9:
				{
				setState(94);
				((ExpressionContext)_localctx).c1 = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).c1.getLine(), ((ExpressionContext)_localctx).c1.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c1!=null?((ExpressionContext)_localctx).c1.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(99);
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
						setState(100);
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
						setState(103);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(104);
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
						setState(105);
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
						setState(108);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(109);
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
						setState(110);
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
						setState(113);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(114);
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
						setState(115);
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
						setState(118);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(119);
						match(T__2);
						setState(120);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(121);
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
						setState(124);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(125);
						match(T__4);
						setState(126);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(),
						          			(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast);
						}
						break;
					}
					} 
				}
				setState(132);
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
			setState(133);
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
			setState(136);
			((Function_invocationContext)_localctx).e1 = variable();
			setState(137);
			match(T__0);
			setState(138);
			((Function_invocationContext)_localctx).a1 = arguments();
			((Function_invocationContext)_localctx).ast =  new FunctionInvocation(((Function_invocationContext)_localctx).e1.ast.getLine(), ((Function_invocationContext)_localctx).e1.ast.getColumn(), ((Function_invocationContext)_localctx).e1.ast, ((Function_invocationContext)_localctx).a1.ast);
			setState(140);
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
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((StatementContext)_localctx).e1 = expression(0);
				setState(143);
				match(T__19);
				setState(144);
				((StatementContext)_localctx).e2 = expression(0);
				setState(145);
				match(T__20);
				_localctx.ast.add(new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__21);
				setState(149);
				match(T__0);
				setState(150);
				((StatementContext)_localctx).e1 = expression(0);
				setState(151);
				match(T__1);
				setState(152);
				((StatementContext)_localctx).b1 = block();
				_localctx.ast.add(new WhileLoop(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(T__22);
				setState(156);
				match(T__0);
				setState(157);
				((StatementContext)_localctx).e1 = expression(0);
				setState(158);
				match(T__1);
				setState(159);
				((StatementContext)_localctx).b1 = block();
				setState(160);
				match(T__23);
				setState(161);
				((StatementContext)_localctx).b2 = block();
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).b2.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(T__22);
				setState(165);
				match(T__0);
				setState(166);
				((StatementContext)_localctx).e1 = expression(0);
				setState(167);
				match(T__1);
				setState(168);
				((StatementContext)_localctx).b1 = block();
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				match(T__24);
				setState(172);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new Return(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(),
						((StatementContext)_localctx).e1.ast));
				setState(174);
				match(T__20);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				((StatementContext)_localctx).s = match(T__25);
				setState(177);
				((StatementContext)_localctx).rb = readBlock();
				for (Read r : ((StatementContext)_localctx).rb.ast) { _localctx.ast.add(r); }
				setState(179);
				match(T__20);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(181);
				((StatementContext)_localctx).s = match(T__26);
				setState(182);
				((StatementContext)_localctx).wb = writeBlock();
				for (Write w : ((StatementContext)_localctx).wb.ast) { _localctx.ast.add(w); }
				setState(184);
				match(T__20);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				((StatementContext)_localctx).p1 = procedure_invocation();
				_localctx.ast.add(((StatementContext)_localctx).p1.ast);
				setState(188);
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
		enterRule(_localctx, 12, RULE_readBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(192);
			((ReadBlockContext)_localctx).e1 = expression(0);
			_localctx.ast.add(new Read(((ReadBlockContext)_localctx).e1.ast.getLine(), ((ReadBlockContext)_localctx).e1.ast.getColumn(), ((ReadBlockContext)_localctx).e1.ast));
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(194);
				match(T__27);
				setState(195);
				((ReadBlockContext)_localctx).e2 = expression(0);
				_localctx.ast.add(new Read(((ReadBlockContext)_localctx).e2.ast.getLine(), ((ReadBlockContext)_localctx).e2.ast.getColumn(), ((ReadBlockContext)_localctx).e2.ast));
				}
				}
				setState(202);
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
		enterRule(_localctx, 14, RULE_writeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(203);
			((WriteBlockContext)_localctx).e1 = expression(0);
			_localctx.ast.add(new Write(((WriteBlockContext)_localctx).e1.ast.getLine(), ((WriteBlockContext)_localctx).e1.ast.getColumn(), ((WriteBlockContext)_localctx).e1.ast));
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(205);
				match(T__27);
				setState(206);
				((WriteBlockContext)_localctx).e2 = expression(0);
				_localctx.ast.add(new Write(((WriteBlockContext)_localctx).e2.ast.getLine(), ((WriteBlockContext)_localctx).e2.ast.getColumn(), ((WriteBlockContext)_localctx).e2.ast));
				}
				}
				setState(213);
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
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			setState(227);
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
				setState(214);
				((BlockContext)_localctx).s1 = statement();
				_localctx.ast.addAll(((BlockContext)_localctx).s1.ast);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__28);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					{
					setState(218);
					((BlockContext)_localctx).s1 = statement();
					_localctx.ast.addAll(((BlockContext)_localctx).s1.ast);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
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
		enterRule(_localctx, 18, RULE_procedure_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			((Procedure_invocationContext)_localctx).v1 = variable();
			setState(230);
			match(T__0);
			setState(231);
			((Procedure_invocationContext)_localctx).a1 = arguments();
			((Procedure_invocationContext)_localctx).ast =  new FunctionInvocation(((Procedure_invocationContext)_localctx).v1.ast.getLine(), ((Procedure_invocationContext)_localctx).v1.ast.getColumn(), ((Procedure_invocationContext)_localctx).v1.ast,
			    			((Procedure_invocationContext)_localctx).a1.ast);
			setState(233);
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
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			setState(247);
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
				setState(235);
				((ArgumentsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ArgumentsContext)_localctx).e1.ast);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(237);
					match(T__27);
					setState(238);
					((ArgumentsContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ArgumentsContext)_localctx).e2.ast);
					}
					}
					setState(245);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				{
				setState(250);
				((TypeContext)_localctx).b1 = builtin_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b1.ast;
				}
				break;
			case T__31:
				{
				setState(253);
				((TypeContext)_localctx).s1 = struct_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).s1.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
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
					setState(258);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(259);
					match(T__2);
					setState(260);
					((TypeContext)_localctx).e1 = expression(0);
					setState(261);
					match(T__3);
					((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).t1.ast.getLine(), ((TypeContext)_localctx).t1.ast.getColumn(), ((TypeContext)_localctx).e1.ast, ((TypeContext)_localctx).t1.ast);
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(263);
							match(T__2);
							setState(264);
							((TypeContext)_localctx).e2 = expression(0);
							setState(265);
							match(T__3);
							((ArrayType)_localctx.ast).setType(new ArrayType(((TypeContext)_localctx).t1.ast.getLine(), ((TypeContext)_localctx).t1.ast.getColumn(), ((TypeContext)_localctx).e2.ast, ((TypeContext)_localctx).t1.ast));
							}
							} 
						}
						setState(272);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					}
					} 
				}
				setState(277);
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
		enterRule(_localctx, 24, RULE_returnable_type);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((Returnable_typeContext)_localctx).b1 = builtin_type();
				((Returnable_typeContext)_localctx).ast =  ((Returnable_typeContext)_localctx).b1.ast;
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
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
		enterRule(_localctx, 26, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			((Struct_typeContext)_localctx).s1 = match(T__31);
			setState(286);
			match(T__28);
			setState(287);
			((Struct_typeContext)_localctx).b2 = struct_body();
			setState(288);
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
		enterRule(_localctx, 28, RULE_builtin_type);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((Builtin_typeContext)_localctx).s = match(T__32);
				((Builtin_typeContext)_localctx).ast =  new IntType(((Builtin_typeContext)_localctx).s.getLine(), ((Builtin_typeContext)_localctx).s.getCharPositionInLine()+1);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				((Builtin_typeContext)_localctx).s = match(T__33);
				((Builtin_typeContext)_localctx).ast =  new DoubleType(((Builtin_typeContext)_localctx).s.getLine(), ((Builtin_typeContext)_localctx).s.getCharPositionInLine()+1);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
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
		enterRule(_localctx, 30, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(299);
				((Struct_bodyContext)_localctx).r1 = record_field_line();
				for (RecordField r : ((Struct_bodyContext)_localctx).r1.ast) _localctx.ast.add(r);
				}
				}
				setState(306);
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
		enterRule(_localctx, 32, RULE_record_field_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((Record_field_lineContext)_localctx).t1 = type(0);
			{
			setState(308);
			((Record_field_lineContext)_localctx).i1 = match(ID);
			_localctx.ast.add(new RecordField(((Record_field_lineContext)_localctx).t1.ast.getLine(), ((Record_field_lineContext)_localctx).t1.ast.getColumn(), (((Record_field_lineContext)_localctx).i1!=null?((Record_field_lineContext)_localctx).i1.getText():null), ((Record_field_lineContext)_localctx).t1.ast));
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(310);
				match(T__27);
				setState(311);
				((Record_field_lineContext)_localctx).i2 = match(ID);
				_localctx.ast.add(new RecordField(((Record_field_lineContext)_localctx).i2.getLine(), ((Record_field_lineContext)_localctx).i2.getCharPositionInLine()+1, (((Record_field_lineContext)_localctx).i2!=null?((Record_field_lineContext)_localctx).i2.getText():null), ((Record_field_lineContext)_localctx).t1.ast));
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(318);
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
		enterRule(_localctx, 34, RULE_definition);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((DefinitionContext)_localctx).v1 = variable_definition();
				for (Definition d : ((DefinitionContext)_localctx).v1.ast) _localctx.ast.add(d);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
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
		enterRule(_localctx, 36, RULE_variable_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((Variable_definitionContext)_localctx).t1 = type(0);
			{
			setState(329);
			((Variable_definitionContext)_localctx).i1 = match(ID);
			_localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).t1.ast.getLine(), ((Variable_definitionContext)_localctx).t1.ast.getColumn(), (((Variable_definitionContext)_localctx).i1!=null?((Variable_definitionContext)_localctx).i1.getText():null), ((Variable_definitionContext)_localctx).t1.ast));
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(331);
				match(T__27);
				setState(332);
				((Variable_definitionContext)_localctx).i2 = match(ID);
				_localctx.ast.add(new VariableDefinition(((Variable_definitionContext)_localctx).t1.ast.getLine(), ((Variable_definitionContext)_localctx).t1.ast.getColumn(), (((Variable_definitionContext)_localctx).i2!=null?((Variable_definitionContext)_localctx).i2.getText():null), ((Variable_definitionContext)_localctx).t1.ast));
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(339);
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
		enterRule(_localctx, 38, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(341);
			((Function_definitionContext)_localctx).r1 = returnable_type();
			}
			setState(342);
			((Function_definitionContext)_localctx).i1 = match(ID);
			setState(343);
			match(T__0);
			setState(344);
			((Function_definitionContext)_localctx).f1 = function_definition_parameter_declaration();
			setState(345);
			match(T__1);
			setState(346);
			match(T__28);
			setState(347);
			((Function_definitionContext)_localctx).b1 = function_definition_body_variables();
			setState(348);
			((Function_definitionContext)_localctx).b2 = function_definition_body_statements();
			setState(349);
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
		enterRule(_localctx, 40, RULE_function_definition_parameter_declaration);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(352);
				((Function_definition_parameter_declarationContext)_localctx).t1 = type(0);
				setState(353);
				((Function_definition_parameter_declarationContext)_localctx).i1 = match(ID);
				_localctx.ast.add(new VariableDefinition(((Function_definition_parameter_declarationContext)_localctx).t1.ast.getLine(), ((Function_definition_parameter_declarationContext)_localctx).t1.ast.getColumn(), (((Function_definition_parameter_declarationContext)_localctx).i1!=null?((Function_definition_parameter_declarationContext)_localctx).i1.getText():null), ((Function_definition_parameter_declarationContext)_localctx).t1.ast));
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(355);
					match(T__27);
					setState(356);
					((Function_definition_parameter_declarationContext)_localctx).t2 = type(0);
					setState(357);
					((Function_definition_parameter_declarationContext)_localctx).i2 = match(ID);
					_localctx.ast.add(new VariableDefinition(((Function_definition_parameter_declarationContext)_localctx).t2.ast.getLine(), ((Function_definition_parameter_declarationContext)_localctx).t2.ast.getColumn(), (((Function_definition_parameter_declarationContext)_localctx).i2!=null?((Function_definition_parameter_declarationContext)_localctx).i2.getText():null), ((Function_definition_parameter_declarationContext)_localctx).t2.ast));
					}
					}
					setState(364);
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
		enterRule(_localctx, 42, RULE_function_definition_body_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(368);
				((Function_definition_body_variablesContext)_localctx).v1 = variable_definition();
				for (VariableDefinition d : ((Function_definition_body_variablesContext)_localctx).v1.ast) _localctx.ast.add(d);
				}
				}
				setState(375);
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
		enterRule(_localctx, 44, RULE_function_definition_body_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(376);
				((Function_definition_body_statementsContext)_localctx).s1 = statement();
				_localctx.ast.addAll(((Function_definition_body_statementsContext)_localctx).s1.ast);
				}
				}
				setState(383);
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
		enterRule(_localctx, 46, RULE_main_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			((Main_function_definitionContext)_localctx).v1 = match(T__30);
			setState(385);
			((Main_function_definitionContext)_localctx).m1 = match(T__35);
			setState(386);
			match(T__0);
			setState(387);
			match(T__1);
			setState(388);
			match(T__28);
			setState(389);
			((Main_function_definitionContext)_localctx).b1 = function_definition_body_variables();
			setState(390);
			((Main_function_definitionContext)_localctx).b2 = function_definition_body_statements();
			setState(391);
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
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4c\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4"+
		"\u0086\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c1\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00c9\n\b\f\b\16\b\u00cc\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d4\n\t"+
		"\f\t\16\t\u00d7\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e0\n\n\f\n\16"+
		"\n\u00e3\13\n\3\n\5\n\u00e6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00f4\n\f\f\f\16\f\u00f7\13\f\3\f\5\f\u00fa\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0103\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u010f\n\r\f\r\16\r\u0112\13\r\7\r\u0114\n\r\f\r\16\r\u0117"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u011e\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012c\n\20\3\21\3\21\3\21\7\21"+
		"\u0131\n\21\f\21\16\21\u0134\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u013c\n\22\f\22\16\22\u013f\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0149\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0151\n\24\f"+
		"\24\16\24\u0154\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u016b\n\26"+
		"\f\26\16\26\u016e\13\26\3\26\5\26\u0171\n\26\3\27\3\27\3\27\7\27\u0176"+
		"\n\27\f\27\16\27\u0179\13\27\3\30\3\30\3\30\7\30\u017e\n\30\f\30\16\30"+
		"\u0181\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\2"+
		"\4\6\30\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2"+
		"\n\f\4\2\b\b\r\r\3\2\16\23\3\2\24\25\2\u019f\2\62\3\2\2\2\4?\3\2\2\2\6"+
		"b\3\2\2\2\b\u0087\3\2\2\2\n\u008a\3\2\2\2\f\u00c0\3\2\2\2\16\u00c2\3\2"+
		"\2\2\20\u00cd\3\2\2\2\22\u00e5\3\2\2\2\24\u00e7\3\2\2\2\26\u00f9\3\2\2"+
		"\2\30\u0102\3\2\2\2\32\u011d\3\2\2\2\34\u011f\3\2\2\2\36\u012b\3\2\2\2"+
		" \u0132\3\2\2\2\"\u0135\3\2\2\2$\u0148\3\2\2\2&\u014a\3\2\2\2(\u0157\3"+
		"\2\2\2*\u0170\3\2\2\2,\u0177\3\2\2\2.\u017f\3\2\2\2\60\u0182\3\2\2\2\62"+
		"\63\5\4\3\2\63\64\5\60\31\2\64\65\b\2\1\2\65\66\7\2\2\3\66\3\3\2\2\2\67"+
		"8\5&\24\289\b\3\1\29>\3\2\2\2:;\5(\25\2;<\b\3\1\2<>\3\2\2\2=\67\3\2\2"+
		"\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\b\4"+
		"\1\2CD\7\3\2\2DE\5\6\4\2EF\b\4\1\2FG\7\4\2\2Gc\3\2\2\2HI\7\3\2\2IJ\5\36"+
		"\20\2JK\7\4\2\2KL\5\6\4\16LM\b\4\1\2Mc\3\2\2\2NO\7\b\2\2OP\5\6\4\rPQ\b"+
		"\4\1\2Qc\3\2\2\2RS\7\t\2\2ST\5\6\4\fTU\b\4\1\2Uc\3\2\2\2VW\5\n\6\2WX\b"+
		"\4\1\2Xc\3\2\2\2YZ\5\b\5\2Z[\b\4\1\2[c\3\2\2\2\\]\7)\2\2]c\b\4\1\2^_\7"+
		"+\2\2_c\b\4\1\2`a\7*\2\2ac\b\4\1\2bB\3\2\2\2bH\3\2\2\2bN\3\2\2\2bR\3\2"+
		"\2\2bV\3\2\2\2bY\3\2\2\2b\\\3\2\2\2b^\3\2\2\2b`\3\2\2\2c\u0084\3\2\2\2"+
		"de\f\13\2\2ef\t\2\2\2fg\5\6\4\fgh\b\4\1\2h\u0083\3\2\2\2ij\f\n\2\2jk\t"+
		"\3\2\2kl\5\6\4\13lm\b\4\1\2m\u0083\3\2\2\2no\f\t\2\2op\t\4\2\2pq\5\6\4"+
		"\nqr\b\4\1\2r\u0083\3\2\2\2st\f\b\2\2tu\t\5\2\2uv\5\6\4\tvw\b\4\1\2w\u0083"+
		"\3\2\2\2xy\f\20\2\2yz\7\5\2\2z{\5\6\4\2{|\7\6\2\2|}\b\4\1\2}\u0083\3\2"+
		"\2\2~\177\f\17\2\2\177\u0080\7\7\2\2\u0080\u0081\7(\2\2\u0081\u0083\b"+
		"\4\1\2\u0082d\3\2\2\2\u0082i\3\2\2\2\u0082n\3\2\2\2\u0082s\3\2\2\2\u0082"+
		"x\3\2\2\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\7\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7(\2\2"+
		"\u0088\u0089\b\5\1\2\u0089\t\3\2\2\2\u008a\u008b\5\b\5\2\u008b\u008c\7"+
		"\3\2\2\u008c\u008d\5\26\f\2\u008d\u008e\b\6\1\2\u008e\u008f\7\4\2\2\u008f"+
		"\13\3\2\2\2\u0090\u0091\5\6\4\2\u0091\u0092\7\26\2\2\u0092\u0093\5\6\4"+
		"\2\u0093\u0094\7\27\2\2\u0094\u0095\b\7\1\2\u0095\u00c1\3\2\2\2\u0096"+
		"\u0097\7\30\2\2\u0097\u0098\7\3\2\2\u0098\u0099\5\6\4\2\u0099\u009a\7"+
		"\4\2\2\u009a\u009b\5\22\n\2\u009b\u009c\b\7\1\2\u009c\u00c1\3\2\2\2\u009d"+
		"\u009e\7\31\2\2\u009e\u009f\7\3\2\2\u009f\u00a0\5\6\4\2\u00a0\u00a1\7"+
		"\4\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\5\22\n\2"+
		"\u00a4\u00a5\b\7\1\2\u00a5\u00c1\3\2\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8"+
		"\7\3\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\5\22\n\2"+
		"\u00ab\u00ac\b\7\1\2\u00ac\u00c1\3\2\2\2\u00ad\u00ae\7\33\2\2\u00ae\u00af"+
		"\5\6\4\2\u00af\u00b0\b\7\1\2\u00b0\u00b1\7\27\2\2\u00b1\u00c1\3\2\2\2"+
		"\u00b2\u00b3\7\34\2\2\u00b3\u00b4\5\16\b\2\u00b4\u00b5\b\7\1\2\u00b5\u00b6"+
		"\7\27\2\2\u00b6\u00c1\3\2\2\2\u00b7\u00b8\7\35\2\2\u00b8\u00b9\5\20\t"+
		"\2\u00b9\u00ba\b\7\1\2\u00ba\u00bb\7\27\2\2\u00bb\u00c1\3\2\2\2\u00bc"+
		"\u00bd\5\24\13\2\u00bd\u00be\b\7\1\2\u00be\u00bf\7\27\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u0090\3\2\2\2\u00c0\u0096\3\2\2\2\u00c0\u009d\3\2\2\2\u00c0"+
		"\u00a6\3\2\2\2\u00c0\u00ad\3\2\2\2\u00c0\u00b2\3\2\2\2\u00c0\u00b7\3\2"+
		"\2\2\u00c0\u00bc\3\2\2\2\u00c1\r\3\2\2\2\u00c2\u00c3\5\6\4\2\u00c3\u00ca"+
		"\b\b\1\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6\5\6\4\2\u00c6\u00c7\b\b\1\2"+
		"\u00c7\u00c9\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\17\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\5\6\4\2\u00ce\u00d5\b\t\1\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\5"+
		"\6\4\2\u00d1\u00d2\b\t\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\21\3\2\2"+
		"\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\5\f\7\2\u00d9\u00da\b\n\1\2\u00da\u00e6"+
		"\3\2\2\2\u00db\u00e1\7\37\2\2\u00dc\u00dd\5\f\7\2\u00dd\u00de\b\n\1\2"+
		"\u00de\u00e0\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e6\7 \2\2\u00e5\u00d8\3\2\2\2\u00e5\u00db\3\2\2\2\u00e6\23\3\2\2\2"+
		"\u00e7\u00e8\5\b\5\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\5\26\f\2\u00ea\u00eb"+
		"\b\13\1\2\u00eb\u00ec\7\4\2\2\u00ec\25\3\2\2\2\u00ed\u00ee\5\6\4\2\u00ee"+
		"\u00f5\b\f\1\2\u00ef\u00f0\7\36\2\2\u00f0\u00f1\5\6\4\2\u00f1\u00f2\b"+
		"\f\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\27\3\2\2\2\u00fb\u00fc\b\r\1\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\b\r"+
		"\1\2\u00fe\u0103\3\2\2\2\u00ff\u0100\5\34\17\2\u0100\u0101\b\r\1\2\u0101"+
		"\u0103\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0115\3\2"+
		"\2\2\u0104\u0105\f\5\2\2\u0105\u0106\7\5\2\2\u0106\u0107\5\6\4\2\u0107"+
		"\u0108\7\6\2\2\u0108\u0110\b\r\1\2\u0109\u010a\7\5\2\2\u010a\u010b\5\6"+
		"\4\2\u010b\u010c\7\6\2\2\u010c\u010d\b\r\1\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0109\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0104\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\31\3\2\2"+
		"\2\u0117\u0115\3\2\2\2\u0118\u0119\5\36\20\2\u0119\u011a\b\16\1\2\u011a"+
		"\u011e\3\2\2\2\u011b\u011c\7!\2\2\u011c\u011e\b\16\1\2\u011d\u0118\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\33\3\2\2\2\u011f\u0120\7\"\2\2\u0120\u0121"+
		"\7\37\2\2\u0121\u0122\5 \21\2\u0122\u0123\7 \2\2\u0123\u0124\b\17\1\2"+
		"\u0124\35\3\2\2\2\u0125\u0126\7#\2\2\u0126\u012c\b\20\1\2\u0127\u0128"+
		"\7$\2\2\u0128\u012c\b\20\1\2\u0129\u012a\7%\2\2\u012a\u012c\b\20\1\2\u012b"+
		"\u0125\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012c\37\3\2\2"+
		"\2\u012d\u012e\5\"\22\2\u012e\u012f\b\21\1\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133!\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\5\30\r\2\u0136\u0137"+
		"\7(\2\2\u0137\u013d\b\22\1\2\u0138\u0139\7\36\2\2\u0139\u013a\7(\2\2\u013a"+
		"\u013c\b\22\1\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0141\7\27\2\2\u0141#\3\2\2\2\u0142\u0143\5&\24\2\u0143\u0144\b\23\1"+
		"\2\u0144\u0149\3\2\2\2\u0145\u0146\5(\25\2\u0146\u0147\b\23\1\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0145\3\2\2\2\u0149%\3\2\2\2"+
		"\u014a\u014b\5\30\r\2\u014b\u014c\7(\2\2\u014c\u0152\b\24\1\2\u014d\u014e"+
		"\7\36\2\2\u014e\u014f\7(\2\2\u014f\u0151\b\24\1\2\u0150\u014d\3\2\2\2"+
		"\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\27\2\2\u0156\'\3\2\2\2\u0157"+
		"\u0158\5\32\16\2\u0158\u0159\7(\2\2\u0159\u015a\7\3\2\2\u015a\u015b\5"+
		"*\26\2\u015b\u015c\7\4\2\2\u015c\u015d\7\37\2\2\u015d\u015e\5,\27\2\u015e"+
		"\u015f\5.\30\2\u015f\u0160\7 \2\2\u0160\u0161\b\25\1\2\u0161)\3\2\2\2"+
		"\u0162\u0163\5\30\r\2\u0163\u0164\7(\2\2\u0164\u016c\b\26\1\2\u0165\u0166"+
		"\7\36\2\2\u0166\u0167\5\30\r\2\u0167\u0168\7(\2\2\u0168\u0169\b\26\1\2"+
		"\u0169\u016b\3\2\2\2\u016a\u0165\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0171\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0171\3\2\2\2\u0170\u0162\3\2\2\2\u0170\u016f\3\2\2\2\u0171+\3\2\2\2"+
		"\u0172\u0173\5&\24\2\u0173\u0174\b\27\1\2\u0174\u0176\3\2\2\2\u0175\u0172"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"-\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\5\f\7\2\u017b\u017c\b\30\1\2"+
		"\u017c\u017e\3\2\2\2\u017d\u017a\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180/\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0183\7!\2\2\u0183\u0184\7&\2\2\u0184\u0185\7\3\2\2\u0185\u0186\7\4\2"+
		"\2\u0186\u0187\7\37\2\2\u0187\u0188\5,\27\2\u0188\u0189\5.\30\2\u0189"+
		"\u018a\7 \2\2\u018a\u018b\b\31\1\2\u018b\61\3\2\2\2\33=?b\u0082\u0084"+
		"\u00c0\u00ca\u00d5\u00e1\u00e5\u00f5\u00f9\u0102\u0110\u0115\u011d\u012b"+
		"\u0132\u013d\u0148\u0152\u016c\u0170\u0177\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}