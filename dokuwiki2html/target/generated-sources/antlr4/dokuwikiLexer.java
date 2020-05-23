// Generated from dokuwiki.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dokuwikiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, CHARACTER=2, BOLD=3, ITALIC=4, UNDERLINE=5, SUBSCRIPT_OPEN=6, 
		SUBSCRIPT_CLOSE=7, SUPERSCRIPT_OPEN=8, SUPERSCRIPT_CLOSE=9, DELETED_OPEN=10, 
		DELETED_CLOSE=11, LINEBREAK=12, BOLD_SINGL=13, LINK_OPEN=14, LINK_CLOSE=15, 
		MEDIA_OPEN=16, MEDIA_CLOSE=17, FOOTNOTE_OPEN=18, FOOTNOTE_CLOSE=19, HEADLINE_1=20, 
		HEADLINE_2=21, HEADLINE_3=22, HEADLINE_4=23, HEADLINE_5=24, LIST=25, ORDERED_LIST=26, 
		QUOTE=27, CODE_OPEN=28, CODE_CLOSE=29, COMBINE=30, URL_OPEN=31, WHITESPACE=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "CHARACTER", "BOLD", "ITALIC", "UNDERLINE", "SUBSCRIPT_OPEN", 
			"SUBSCRIPT_CLOSE", "SUPERSCRIPT_OPEN", "SUPERSCRIPT_CLOSE", "DELETED_OPEN", 
			"DELETED_CLOSE", "LINEBREAK", "BOLD_SINGL", "LINK_OPEN", "LINK_CLOSE", 
			"MEDIA_OPEN", "MEDIA_CLOSE", "FOOTNOTE_OPEN", "FOOTNOTE_CLOSE", "HEADLINE_1", 
			"HEADLINE_2", "HEADLINE_3", "HEADLINE_4", "HEADLINE_5", "LIST", "ORDERED_LIST", 
			"QUOTE", "CODE_OPEN", "CODE_CLOSE", "COMBINE", "URL_OPEN", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'**'", "'//'", "'__'", "'<sub>'", "'</sub>'", "'<sup>'", 
			"'</sup>'", "'<del>'", "'</del>'", null, "'%'", "'[['", "']]'", "'{{'", 
			"'}}'", "'(('", "'))'", "'='", "'=='", "'==='", "'===='", "'====='", 
			"'* '", "'- '", "'>'", null, null, "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "CHARACTER", "BOLD", "ITALIC", "UNDERLINE", "SUBSCRIPT_OPEN", 
			"SUBSCRIPT_CLOSE", "SUPERSCRIPT_OPEN", "SUPERSCRIPT_CLOSE", "DELETED_OPEN", 
			"DELETED_CLOSE", "LINEBREAK", "BOLD_SINGL", "LINK_OPEN", "LINK_CLOSE", 
			"MEDIA_OPEN", "MEDIA_CLOSE", "FOOTNOTE_OPEN", "FOOTNOTE_CLOSE", "HEADLINE_1", 
			"HEADLINE_2", "HEADLINE_3", "HEADLINE_4", "HEADLINE_5", "LIST", "ORDERED_LIST", 
			"QUOTE", "CODE_OPEN", "CODE_CLOSE", "COMBINE", "URL_OPEN", "WHITESPACE"
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


	protected StringBuilder builderHTML = new StringBuilder();


	public dokuwikiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dokuwiki.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\5\rz\n\r\3\r\3\r\5\r~\n\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00bc"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u00cc\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \5 \u00df\n \3!\6!\u00e2\n!\r!\16!\u00e3\3!\3!\2\2\"\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3"+
		"\2\5\4\2\13\13\"\"\7\2#>A]_|~~\u0080\u0080\4\2\13\f\17\17\2\u00ed\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\t"+
		"J\3\2\2\2\13M\3\2\2\2\rP\3\2\2\2\17V\3\2\2\2\21]\3\2\2\2\23c\3\2\2\2\25"+
		"j\3\2\2\2\27p\3\2\2\2\31}\3\2\2\2\33\177\3\2\2\2\35\u0081\3\2\2\2\37\u0084"+
		"\3\2\2\2!\u0087\3\2\2\2#\u008a\3\2\2\2%\u008d\3\2\2\2\'\u0090\3\2\2\2"+
		")\u0093\3\2\2\2+\u0095\3\2\2\2-\u0098\3\2\2\2/\u009c\3\2\2\2\61\u00a1"+
		"\3\2\2\2\63\u00a7\3\2\2\2\65\u00aa\3\2\2\2\67\u00ad\3\2\2\29\u00bb\3\2"+
		"\2\2;\u00cb\3\2\2\2=\u00cd\3\2\2\2?\u00de\3\2\2\2A\u00e1\3\2\2\2CD\t\2"+
		"\2\2D\4\3\2\2\2EF\t\3\2\2F\6\3\2\2\2GH\7,\2\2HI\7,\2\2I\b\3\2\2\2JK\7"+
		"\61\2\2KL\7\61\2\2L\n\3\2\2\2MN\7a\2\2NO\7a\2\2O\f\3\2\2\2PQ\7>\2\2QR"+
		"\7u\2\2RS\7w\2\2ST\7d\2\2TU\7@\2\2U\16\3\2\2\2VW\7>\2\2WX\7\61\2\2XY\7"+
		"u\2\2YZ\7w\2\2Z[\7d\2\2[\\\7@\2\2\\\20\3\2\2\2]^\7>\2\2^_\7u\2\2_`\7w"+
		"\2\2`a\7r\2\2ab\7@\2\2b\22\3\2\2\2cd\7>\2\2de\7\61\2\2ef\7u\2\2fg\7w\2"+
		"\2gh\7r\2\2hi\7@\2\2i\24\3\2\2\2jk\7>\2\2kl\7f\2\2lm\7g\2\2mn\7n\2\2n"+
		"o\7@\2\2o\26\3\2\2\2pq\7>\2\2qr\7\61\2\2rs\7f\2\2st\7g\2\2tu\7n\2\2uv"+
		"\7@\2\2v\30\3\2\2\2w~\7^\2\2xz\7\17\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{~\7\f\2\2|~\7\17\2\2}w\3\2\2\2}y\3\2\2\2}|\3\2\2\2~\32\3\2\2\2\177\u0080"+
		"\7\'\2\2\u0080\34\3\2\2\2\u0081\u0082\7]\2\2\u0082\u0083\7]\2\2\u0083"+
		"\36\3\2\2\2\u0084\u0085\7_\2\2\u0085\u0086\7_\2\2\u0086 \3\2\2\2\u0087"+
		"\u0088\7}\2\2\u0088\u0089\7}\2\2\u0089\"\3\2\2\2\u008a\u008b\7\177\2\2"+
		"\u008b\u008c\7\177\2\2\u008c$\3\2\2\2\u008d\u008e\7*\2\2\u008e\u008f\7"+
		"*\2\2\u008f&\3\2\2\2\u0090\u0091\7+\2\2\u0091\u0092\7+\2\2\u0092(\3\2"+
		"\2\2\u0093\u0094\7?\2\2\u0094*\3\2\2\2\u0095\u0096\7?\2\2\u0096\u0097"+
		"\7?\2\2\u0097,\3\2\2\2\u0098\u0099\7?\2\2\u0099\u009a\7?\2\2\u009a\u009b"+
		"\7?\2\2\u009b.\3\2\2\2\u009c\u009d\7?\2\2\u009d\u009e\7?\2\2\u009e\u009f"+
		"\7?\2\2\u009f\u00a0\7?\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\u00a3"+
		"\7?\2\2\u00a3\u00a4\7?\2\2\u00a4\u00a5\7?\2\2\u00a5\u00a6\7?\2\2\u00a6"+
		"\62\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\7\"\2\2\u00a9\64\3\2\2\2\u00aa"+
		"\u00ab\7/\2\2\u00ab\u00ac\7\"\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7@\2\2"+
		"\u00ae8\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7q\2"+
		"\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7g\2\2\u00b4\u00bc\7@\2\2\u00b5\u00b6"+
		"\7>\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7n\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\u00bc\7@\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b5\3\2\2"+
		"\2\u00bc:\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0"+
		"\7e\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00cc\7@\2\2\u00c4\u00c5\7>\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\7h\2"+
		"\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cc"+
		"\7@\2\2\u00cb\u00bd\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cc<\3\2\2\2\u00cd\u00ce"+
		"\7~\2\2\u00ce>\3\2\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7<\2\2\u00d4\u00d5\7\61\2\2\u00d5"+
		"\u00df\7\61\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7v\2"+
		"\2\u00d9\u00da\7r\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7<\2\2\u00dc\u00dd"+
		"\7\61\2\2\u00dd\u00df\7\61\2\2\u00de\u00cf\3\2\2\2\u00de\u00d6\3\2\2\2"+
		"\u00df@\3\2\2\2\u00e0\u00e2\t\4\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\b!\2\2\u00e6B\3\2\2\2\t\2y}\u00bb\u00cb\u00de\u00e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}