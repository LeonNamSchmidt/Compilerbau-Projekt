// Generated from Project.g4 by ANTLR 4.13.0
package org.example;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProjectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, PRINT=3, IF=4, ELSE=5, WHILE=6, AND=7, OR=8, VAR=9, SEMICOLON=10, 
		LBRACE=11, RBRACE=12, LPARA=13, RPARA=14, PLUS=15, MINUS=16, STAR=17, 
		BACKSLASH=18, ASSIGN=19, EQUAL=20, NOTEQUAL=21, GREATER=22, LESS=23, GREATEREQUAL=24, 
		LESSEQUAL=25, EXCLAMATION=26, STRING=27, NUMBER=28, IDENTIFIER=29, COMMENT=30, 
		WHITESPACE=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRUE", "FALSE", "PRINT", "IF", "ELSE", "WHILE", "AND", "OR", "VAR", 
			"SEMICOLON", "LBRACE", "RBRACE", "LPARA", "RPARA", "PLUS", "MINUS", "STAR", 
			"BACKSLASH", "ASSIGN", "EQUAL", "NOTEQUAL", "GREATER", "LESS", "GREATEREQUAL", 
			"LESSEQUAL", "EXCLAMATION", "STRING", "NUMBER", "IDENTIFIER", "COMMENT", 
			"WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'print'", "'if'", "'else'", "'while'", "'and'", 
			"'or'", "'var'", "';'", "'{'", "'}'", "'('", "')'", "'+'", "'-'", "'*'", 
			"'/'", "'='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "PRINT", "IF", "ELSE", "WHILE", "AND", "OR", "VAR", 
			"SEMICOLON", "LBRACE", "RBRACE", "LPARA", "RPARA", "PLUS", "MINUS", "STAR", 
			"BACKSLASH", "ASSIGN", "EQUAL", "NOTEQUAL", "GREATER", "LESS", "GREATEREQUAL", 
			"LESSEQUAL", "EXCLAMATION", "STRING", "NUMBER", "IDENTIFIER", "COMMENT", 
			"WHITESPACE"
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


	public ProjectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Project.g4"; }

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
		"\u0004\u0000\u001f\u00c0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0092\b\u001a\n\u001a\f\u001a\u0095"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u009a\b\u001b"+
		"\u000b\u001b\f\u001b\u009b\u0001\u001b\u0001\u001b\u0004\u001b\u00a0\b"+
		"\u001b\u000b\u001b\f\u001b\u00a1\u0003\u001b\u00a4\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u00a8\b\u001c\n\u001c\f\u001c\u00ab\t\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u00b1\b\u001d\n"+
		"\u001d\f\u001d\u00b4\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0004\u001e\u00bb\b\u001e\u000b\u001e\f\u001e\u00bc"+
		"\u0001\u001e\u0001\u001e\u0000\u0000\u001f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f\u0001\u0000\u0006\u0001\u0000\"\"\u0001\u0000"+
		"09\u0002\u0000AZaz\u0003\u000009AZaz\u0002\u0000\n\n\r\r\u0003\u0000\t"+
		"\n\r\r  \u00c6\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003"+
		"D\u0001\u0000\u0000\u0000\u0005J\u0001\u0000\u0000\u0000\u0007P\u0001"+
		"\u0000\u0000\u0000\tS\u0001\u0000\u0000\u0000\u000bX\u0001\u0000\u0000"+
		"\u0000\r^\u0001\u0000\u0000\u0000\u000fb\u0001\u0000\u0000\u0000\u0011"+
		"e\u0001\u0000\u0000\u0000\u0013i\u0001\u0000\u0000\u0000\u0015k\u0001"+
		"\u0000\u0000\u0000\u0017m\u0001\u0000\u0000\u0000\u0019o\u0001\u0000\u0000"+
		"\u0000\u001bq\u0001\u0000\u0000\u0000\u001ds\u0001\u0000\u0000\u0000\u001f"+
		"u\u0001\u0000\u0000\u0000!w\u0001\u0000\u0000\u0000#y\u0001\u0000\u0000"+
		"\u0000%{\u0001\u0000\u0000\u0000\'}\u0001\u0000\u0000\u0000)\u0080\u0001"+
		"\u0000\u0000\u0000+\u0083\u0001\u0000\u0000\u0000-\u0085\u0001\u0000\u0000"+
		"\u0000/\u0087\u0001\u0000\u0000\u00001\u008a\u0001\u0000\u0000\u00003"+
		"\u008d\u0001\u0000\u0000\u00005\u008f\u0001\u0000\u0000\u00007\u0099\u0001"+
		"\u0000\u0000\u00009\u00a5\u0001\u0000\u0000\u0000;\u00ac\u0001\u0000\u0000"+
		"\u0000=\u00ba\u0001\u0000\u0000\u0000?@\u0005t\u0000\u0000@A\u0005r\u0000"+
		"\u0000AB\u0005u\u0000\u0000BC\u0005e\u0000\u0000C\u0002\u0001\u0000\u0000"+
		"\u0000DE\u0005f\u0000\u0000EF\u0005a\u0000\u0000FG\u0005l\u0000\u0000"+
		"GH\u0005s\u0000\u0000HI\u0005e\u0000\u0000I\u0004\u0001\u0000\u0000\u0000"+
		"JK\u0005p\u0000\u0000KL\u0005r\u0000\u0000LM\u0005i\u0000\u0000MN\u0005"+
		"n\u0000\u0000NO\u0005t\u0000\u0000O\u0006\u0001\u0000\u0000\u0000PQ\u0005"+
		"i\u0000\u0000QR\u0005f\u0000\u0000R\b\u0001\u0000\u0000\u0000ST\u0005"+
		"e\u0000\u0000TU\u0005l\u0000\u0000UV\u0005s\u0000\u0000VW\u0005e\u0000"+
		"\u0000W\n\u0001\u0000\u0000\u0000XY\u0005w\u0000\u0000YZ\u0005h\u0000"+
		"\u0000Z[\u0005i\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005e\u0000\u0000"+
		"]\f\u0001\u0000\u0000\u0000^_\u0005a\u0000\u0000_`\u0005n\u0000\u0000"+
		"`a\u0005d\u0000\u0000a\u000e\u0001\u0000\u0000\u0000bc\u0005o\u0000\u0000"+
		"cd\u0005r\u0000\u0000d\u0010\u0001\u0000\u0000\u0000ef\u0005v\u0000\u0000"+
		"fg\u0005a\u0000\u0000gh\u0005r\u0000\u0000h\u0012\u0001\u0000\u0000\u0000"+
		"ij\u0005;\u0000\u0000j\u0014\u0001\u0000\u0000\u0000kl\u0005{\u0000\u0000"+
		"l\u0016\u0001\u0000\u0000\u0000mn\u0005}\u0000\u0000n\u0018\u0001\u0000"+
		"\u0000\u0000op\u0005(\u0000\u0000p\u001a\u0001\u0000\u0000\u0000qr\u0005"+
		")\u0000\u0000r\u001c\u0001\u0000\u0000\u0000st\u0005+\u0000\u0000t\u001e"+
		"\u0001\u0000\u0000\u0000uv\u0005-\u0000\u0000v \u0001\u0000\u0000\u0000"+
		"wx\u0005*\u0000\u0000x\"\u0001\u0000\u0000\u0000yz\u0005/\u0000\u0000"+
		"z$\u0001\u0000\u0000\u0000{|\u0005=\u0000\u0000|&\u0001\u0000\u0000\u0000"+
		"}~\u0005=\u0000\u0000~\u007f\u0005=\u0000\u0000\u007f(\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005!\u0000\u0000\u0081\u0082\u0005=\u0000\u0000\u0082"+
		"*\u0001\u0000\u0000\u0000\u0083\u0084\u0005>\u0000\u0000\u0084,\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005<\u0000\u0000\u0086.\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005>\u0000\u0000\u0088\u0089\u0005=\u0000\u0000\u0089"+
		"0\u0001\u0000\u0000\u0000\u008a\u008b\u0005<\u0000\u0000\u008b\u008c\u0005"+
		"=\u0000\u0000\u008c2\u0001\u0000\u0000\u0000\u008d\u008e\u0005!\u0000"+
		"\u0000\u008e4\u0001\u0000\u0000\u0000\u008f\u0093\u0005\"\u0000\u0000"+
		"\u0090\u0092\b\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0005\"\u0000\u0000\u00976"+
		"\u0001\u0000\u0000\u0000\u0098\u009a\u0007\u0001\u0000\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a3"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\t\u0000\u0000\u0000\u009e\u00a0\u0007"+
		"\u0001\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u009d\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a48\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a9\u0007\u0002\u0000\u0000\u00a6\u00a8\u0007\u0003"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa:\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005/\u0000\u0000\u00ad\u00ae\u0005/\u0000\u0000\u00ae"+
		"\u00b2\u0001\u0000\u0000\u0000\u00af\u00b1\b\u0004\u0000\u0000\u00b0\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\n\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006"+
		"\u001d\u0000\u0000\u00b8<\u0001\u0000\u0000\u0000\u00b9\u00bb\u0007\u0005"+
		"\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0006\u001e"+
		"\u0000\u0000\u00bf>\u0001\u0000\u0000\u0000\b\u0000\u0093\u009b\u00a1"+
		"\u00a3\u00a9\u00b2\u00bc\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}