// Generated from /home/rhean/clase/dlp/lab03/src/parser/Cmm.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ID=2, INT_CONSTANT=3, CHAR_CONSTANT=4, REAL_CONSTANT=5, MULTI_LINE_COMMENT=6, 
		SINGLE_LINE_COMMENT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "MULTI_LINE_COMMENT", 
			"SINGLE_LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "MULTI_LINE_COMMENT", 
			"SINGLE_LINE_COMMENT"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u00b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\23\n\2\r\2"+
		"\16\2\24\3\2\3\2\3\3\5\3\32\n\3\3\3\6\3\35\n\3\r\3\16\3\36\3\3\5\3\"\n"+
		"\3\3\3\7\3%\n\3\f\3\16\3(\13\3\3\3\5\3+\n\3\6\3-\n\3\r\3\16\3.\3\4\3\4"+
		"\3\4\7\4\64\n\4\f\4\16\4\67\13\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6"+
		"\6\6S\n\6\r\6\16\6T\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\7\6_\n\6\f\6"+
		"\16\6b\13\6\3\6\3\6\6\6f\n\6\r\6\16\6g\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6"+
		"\3\6\6\6r\n\6\r\6\16\6s\3\6\3\6\5\6x\n\6\3\6\3\6\3\6\6\6}\n\6\r\6\16\6"+
		"~\3\6\3\6\7\6\u0083\n\6\f\6\16\6\u0086\13\6\3\6\3\6\5\6\u008a\n\6\3\6"+
		"\3\6\3\6\6\6\u008f\n\6\r\6\16\6\u0090\3\6\3\6\5\6\u0095\n\6\3\6\3\6\5"+
		"\6\u0099\n\6\3\7\3\7\3\7\3\7\7\7\u009f\n\7\f\7\16\7\u00a2\13\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0\13\b\3\b\5\b"+
		"\u00b3\n\b\3\b\3\b\4\u00a0\u00ae\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2"+
		"\t\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\63;\3\2\62;\5\2ppttvv\4\2GGgg\3\3\f"+
		"\f\2\u00d4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\3\22\3\2\2\2\5,\3\2\2\2\78\3\2\2\2\tO\3\2"+
		"\2\2\13\u0098\3\2\2\2\r\u009a\3\2\2\2\17\u00a8\3\2\2\2\21\23\t\2\2\2\22"+
		"\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26"+
		"\27\b\2\2\2\27\4\3\2\2\2\30\32\7a\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\34"+
		"\3\2\2\2\33\35\t\3\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37"+
		"\3\2\2\2\37!\3\2\2\2 \"\7a\2\2! \3\2\2\2!\"\3\2\2\2\"&\3\2\2\2#%\5\7\4"+
		"\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2)+\7a"+
		"\2\2*)\3\2\2\2*+\3\2\2\2+-\3\2\2\2,\31\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3"+
		"\2\2\2/\6\3\2\2\2\609\7\62\2\2\61\65\t\4\2\2\62\64\t\5\2\2\63\62\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2"+
		"8\60\3\2\2\28\61\3\2\2\29\b\3\2\2\2:;\7)\2\2;<\13\2\2\2<P\7)\2\2=>\7)"+
		"\2\2>?\7^\2\2?P\7)\2\2@A\7)\2\2AB\7^\2\2BC\7)\2\2CP\7)\2\2DE\7)\2\2EF"+
		"\7^\2\2FG\3\2\2\2GH\5\7\4\2HI\7)\2\2IP\3\2\2\2JK\7)\2\2KL\7^\2\2LM\3\2"+
		"\2\2MN\t\6\2\2NP\7)\2\2O:\3\2\2\2O=\3\2\2\2O@\3\2\2\2OD\3\2\2\2OJ\3\2"+
		"\2\2P\n\3\2\2\2QS\5\7\4\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3"+
		"\2\2\2VZ\7\60\2\2WY\5\7\4\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2["+
		"\u0099\3\2\2\2\\Z\3\2\2\2]_\5\7\4\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3"+
		"\2\2\2ac\3\2\2\2b`\3\2\2\2ce\7\60\2\2df\5\7\4\2ed\3\2\2\2fg\3\2\2\2ge"+
		"\3\2\2\2gh\3\2\2\2h\u0099\3\2\2\2ik\5\7\4\2ji\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2oq\7\60\2\2pr\5\7\4\2qp\3\2\2\2rs\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\t\7\2\2vx\7/\2\2wv\3\2\2\2wx\3"+
		"\2\2\2xy\3\2\2\2yz\5\7\4\2z\u0099\3\2\2\2{}\5\7\4\2|{\3\2\2\2}~\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0084\7\60\2\2\u0081"+
		"\u0083\5\7\4\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0089\t\7\2\2\u0088\u008a\7/\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\5\7\4\2\u008c\u0099\3\2\2\2\u008d"+
		"\u008f\5\7\4\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\t\7\2\2\u0093"+
		"\u0095\7/\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\5\7\4\2\u0097\u0099\3\2\2\2\u0098R\3\2\2\2\u0098`\3\2"+
		"\2\2\u0098l\3\2\2\2\u0098|\3\2\2\2\u0098\u008e\3\2\2\2\u0099\f\3\2\2\2"+
		"\u009a\u009b\7\61\2\2\u009b\u009c\7,\2\2\u009c\u00a0\3\2\2\2\u009d\u009f"+
		"\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\7\2\2\u00a7"+
		"\16\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ae\3\2"+
		"\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b3\t\b\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\b\b\2\2\u00b5\20\3\2\2\2\36\2\24\31\34\36!&*.\658OTZ`glsw~\u0084"+
		"\u0089\u0090\u0094\u0098\u00a0\u00ae\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}