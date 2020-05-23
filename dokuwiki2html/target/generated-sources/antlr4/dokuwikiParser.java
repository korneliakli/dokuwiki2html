// Generated from dokuwiki.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dokuwikiParser extends Parser {
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
		QUOTE=27, CODE_OPEN=28, CODE_CLOSE=29, COMBINE=30, URL_OPEN=31, WHITESPACE=32, 
		URL=33;
	public static final int
		RULE_paragraph = 0, RULE_bold = 1, RULE_italic = 2, RULE_underline = 3, 
		RULE_subscript = 4, RULE_superscript = 5, RULE_deleted = 6, RULE_newline = 7, 
		RULE_link = 8, RULE_media = 9, RULE_footnote = 10, RULE_header = 11, RULE_quote = 12, 
		RULE_code = 13, RULE_body_part = 14, RULE_body = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"paragraph", "bold", "italic", "underline", "subscript", "superscript", 
			"deleted", "newline", "link", "media", "footnote", "header", "quote", 
			"code", "body_part", "body"
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
			"QUOTE", "CODE_OPEN", "CODE_CLOSE", "COMBINE", "URL_OPEN", "WHITESPACE", 
			"URL"
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
	public String getGrammarFileName() { return "dokuwiki.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	protected StringBuilder builderHTML = new StringBuilder();

	public dokuwikiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParagraphContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(dokuwikiParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(dokuwikiParser.CHARACTER, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(dokuwikiParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(dokuwikiParser.SPACE, i);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitParagraph(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_paragraph);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(32);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==CHARACTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BoldContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public List<TerminalNode> BOLD() { return getTokens(dokuwikiParser.BOLD); }
		public TerminalNode BOLD(int i) {
			return getToken(dokuwikiParser.BOLD, i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitBold(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(BOLD);
			setState(38);
			((BoldContext)_localctx).paragraph = paragraph();
			setState(39);
			match(BOLD);
			builderHTML.append("<b>" + (((BoldContext)_localctx).paragraph!=null?_input.getText(((BoldContext)_localctx).paragraph.start,((BoldContext)_localctx).paragraph.stop):null) +"</b>");
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

	public static class ItalicContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public List<TerminalNode> ITALIC() { return getTokens(dokuwikiParser.ITALIC); }
		public TerminalNode ITALIC(int i) {
			return getToken(dokuwikiParser.ITALIC, i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public ItalicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterItalic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitItalic(this);
		}
	}

	public final ItalicContext italic() throws RecognitionException {
		ItalicContext _localctx = new ItalicContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_italic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ITALIC);
			setState(43);
			((ItalicContext)_localctx).paragraph = paragraph();
			setState(44);
			match(ITALIC);
			builderHTML.append("<i>" + (((ItalicContext)_localctx).paragraph!=null?_input.getText(((ItalicContext)_localctx).paragraph.start,((ItalicContext)_localctx).paragraph.stop):null) +"</i>");
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

	public static class UnderlineContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public List<TerminalNode> UNDERLINE() { return getTokens(dokuwikiParser.UNDERLINE); }
		public TerminalNode UNDERLINE(int i) {
			return getToken(dokuwikiParser.UNDERLINE, i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public UnderlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterUnderline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitUnderline(this);
		}
	}

	public final UnderlineContext underline() throws RecognitionException {
		UnderlineContext _localctx = new UnderlineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_underline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(UNDERLINE);
			setState(48);
			((UnderlineContext)_localctx).paragraph = paragraph();
			setState(49);
			match(UNDERLINE);
			builderHTML.append("<u>" +(((UnderlineContext)_localctx).paragraph!=null?_input.getText(((UnderlineContext)_localctx).paragraph.start,((UnderlineContext)_localctx).paragraph.stop):null) + "</u>");
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

	public static class SubscriptContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode SUBSCRIPT_OPEN() { return getToken(dokuwikiParser.SUBSCRIPT_OPEN, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode SUBSCRIPT_CLOSE() { return getToken(dokuwikiParser.SUBSCRIPT_CLOSE, 0); }
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitSubscript(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(SUBSCRIPT_OPEN);
			setState(53);
			((SubscriptContext)_localctx).paragraph = paragraph();
			setState(54);
			match(SUBSCRIPT_CLOSE);
			builderHTML.append("<sub>" + (((SubscriptContext)_localctx).paragraph!=null?_input.getText(((SubscriptContext)_localctx).paragraph.start,((SubscriptContext)_localctx).paragraph.stop):null) + "</sub>");
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

	public static class SuperscriptContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode SUPERSCRIPT_OPEN() { return getToken(dokuwikiParser.SUPERSCRIPT_OPEN, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode SUPERSCRIPT_CLOSE() { return getToken(dokuwikiParser.SUPERSCRIPT_CLOSE, 0); }
		public SuperscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterSuperscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitSuperscript(this);
		}
	}

	public final SuperscriptContext superscript() throws RecognitionException {
		SuperscriptContext _localctx = new SuperscriptContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_superscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(SUPERSCRIPT_OPEN);
			setState(58);
			((SuperscriptContext)_localctx).paragraph = paragraph();
			setState(59);
			match(SUPERSCRIPT_CLOSE);
			builderHTML.append("<sup>" + (((SuperscriptContext)_localctx).paragraph!=null?_input.getText(((SuperscriptContext)_localctx).paragraph.start,((SuperscriptContext)_localctx).paragraph.stop):null) + "</sup>");
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

	public static class DeletedContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode DELETED_OPEN() { return getToken(dokuwikiParser.DELETED_OPEN, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode DELETED_CLOSE() { return getToken(dokuwikiParser.DELETED_CLOSE, 0); }
		public DeletedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterDeleted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitDeleted(this);
		}
	}

	public final DeletedContext deleted() throws RecognitionException {
		DeletedContext _localctx = new DeletedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deleted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DELETED_OPEN);
			setState(63);
			((DeletedContext)_localctx).paragraph = paragraph();
			setState(64);
			match(DELETED_CLOSE);
			builderHTML.append("<strike>" + (((DeletedContext)_localctx).paragraph!=null?_input.getText(((DeletedContext)_localctx).paragraph.start,((DeletedContext)_localctx).paragraph.stop):null) + "</strike>");
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode LINEBREAK() { return getToken(dokuwikiParser.LINEBREAK, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LINEBREAK);
			builderHTML.append("</br>");
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

	public static class LinkContext extends ParserRuleContext {
		public Token URL;
		public ParagraphContext paragraph;
		public TerminalNode LINK_OPEN() { return getToken(dokuwikiParser.LINK_OPEN, 0); }
		public TerminalNode URL() { return getToken(dokuwikiParser.URL, 0); }
		public TerminalNode COMBINE() { return getToken(dokuwikiParser.COMBINE, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode LINK_CLOSE() { return getToken(dokuwikiParser.LINK_CLOSE, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LINK_OPEN);
			setState(71);
			((LinkContext)_localctx).URL = match(URL);
			setState(72);
			match(COMBINE);
			setState(73);
			((LinkContext)_localctx).paragraph = paragraph();
			setState(74);
			match(LINK_CLOSE);
			builderHTML.append("<a href='" + (((LinkContext)_localctx).URL!=null?((LinkContext)_localctx).URL.getText():null) + "'>" + (((LinkContext)_localctx).paragraph!=null?_input.getText(((LinkContext)_localctx).paragraph.start,((LinkContext)_localctx).paragraph.stop):null) + "</a>");
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

	public static class MediaContext extends ParserRuleContext {
		public Token URL;
		public TerminalNode MEDIA_OPEN() { return getToken(dokuwikiParser.MEDIA_OPEN, 0); }
		public TerminalNode URL() { return getToken(dokuwikiParser.URL, 0); }
		public TerminalNode MEDIA_CLOSE() { return getToken(dokuwikiParser.MEDIA_CLOSE, 0); }
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitMedia(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(MEDIA_OPEN);
			setState(78);
			((MediaContext)_localctx).URL = match(URL);
			setState(79);
			match(MEDIA_CLOSE);
			builderHTML.append("<img src='" + (((MediaContext)_localctx).URL!=null?((MediaContext)_localctx).URL.getText():null) + "'>");
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

	public static class FootnoteContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode FOOTNOTE_OPEN() { return getToken(dokuwikiParser.FOOTNOTE_OPEN, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode FOOTNOTE_CLOSE() { return getToken(dokuwikiParser.FOOTNOTE_CLOSE, 0); }
		public FootnoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footnote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterFootnote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitFootnote(this);
		}
	}

	public final FootnoteContext footnote() throws RecognitionException {
		FootnoteContext _localctx = new FootnoteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_footnote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(FOOTNOTE_OPEN);
			setState(83);
			((FootnoteContext)_localctx).paragraph = paragraph();
			setState(84);
			match(FOOTNOTE_CLOSE);
			builderHTML.append("<sup>" + (((FootnoteContext)_localctx).paragraph!=null?_input.getText(((FootnoteContext)_localctx).paragraph.start,((FootnoteContext)_localctx).paragraph.stop):null) + "</sup>");
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

	public static class HeaderContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public List<TerminalNode> HEADLINE_1() { return getTokens(dokuwikiParser.HEADLINE_1); }
		public TerminalNode HEADLINE_1(int i) {
			return getToken(dokuwikiParser.HEADLINE_1, i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public List<TerminalNode> HEADLINE_2() { return getTokens(dokuwikiParser.HEADLINE_2); }
		public TerminalNode HEADLINE_2(int i) {
			return getToken(dokuwikiParser.HEADLINE_2, i);
		}
		public List<TerminalNode> HEADLINE_3() { return getTokens(dokuwikiParser.HEADLINE_3); }
		public TerminalNode HEADLINE_3(int i) {
			return getToken(dokuwikiParser.HEADLINE_3, i);
		}
		public List<TerminalNode> HEADLINE_4() { return getTokens(dokuwikiParser.HEADLINE_4); }
		public TerminalNode HEADLINE_4(int i) {
			return getToken(dokuwikiParser.HEADLINE_4, i);
		}
		public List<TerminalNode> HEADLINE_5() { return getTokens(dokuwikiParser.HEADLINE_5); }
		public TerminalNode HEADLINE_5(int i) {
			return getToken(dokuwikiParser.HEADLINE_5, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_header);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEADLINE_1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(HEADLINE_1);
				setState(88);
				((HeaderContext)_localctx).paragraph = paragraph();
				setState(89);
				match(HEADLINE_1);
				builderHTML.append("<h1>" + (((HeaderContext)_localctx).paragraph!=null?_input.getText(((HeaderContext)_localctx).paragraph.start,((HeaderContext)_localctx).paragraph.stop):null) + "</h1>");
				}
				break;
			case HEADLINE_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(HEADLINE_2);
				setState(93);
				((HeaderContext)_localctx).paragraph = paragraph();
				setState(94);
				match(HEADLINE_2);
				builderHTML.append("<h2>" + (((HeaderContext)_localctx).paragraph!=null?_input.getText(((HeaderContext)_localctx).paragraph.start,((HeaderContext)_localctx).paragraph.stop):null) +"</h2>");
				}
				break;
			case HEADLINE_3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(HEADLINE_3);
				setState(98);
				((HeaderContext)_localctx).paragraph = paragraph();
				setState(99);
				match(HEADLINE_3);
				builderHTML.append("<h3>" + (((HeaderContext)_localctx).paragraph!=null?_input.getText(((HeaderContext)_localctx).paragraph.start,((HeaderContext)_localctx).paragraph.stop):null) + "</h3>");
				}
				break;
			case HEADLINE_4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(HEADLINE_4);
				setState(103);
				((HeaderContext)_localctx).paragraph = paragraph();
				setState(104);
				match(HEADLINE_4);
				builderHTML.append("<h4>" + (((HeaderContext)_localctx).paragraph!=null?_input.getText(((HeaderContext)_localctx).paragraph.start,((HeaderContext)_localctx).paragraph.stop):null) + "</h4>");
				}
				break;
			case HEADLINE_5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				match(HEADLINE_5);
				setState(108);
				((HeaderContext)_localctx).paragraph = paragraph();
				setState(109);
				match(HEADLINE_5);
				builderHTML.append("<h5>" + (((HeaderContext)_localctx).paragraph!=null?_input.getText(((HeaderContext)_localctx).paragraph.start,((HeaderContext)_localctx).paragraph.stop):null) + "</h5>");
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

	public static class QuoteContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode QUOTE() { return getToken(dokuwikiParser.QUOTE, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitQuote(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(QUOTE);
			setState(115);
			((QuoteContext)_localctx).paragraph = paragraph();
			builderHTML.append("<blockquote>" + (((QuoteContext)_localctx).paragraph!=null?_input.getText(((QuoteContext)_localctx).paragraph.start,((QuoteContext)_localctx).paragraph.stop):null) + "</blockquote>");
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

	public static class CodeContext extends ParserRuleContext {
		public ParagraphContext paragraph;
		public TerminalNode CODE_OPEN() { return getToken(dokuwikiParser.CODE_OPEN, 0); }
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public TerminalNode CODE_CLOSE() { return getToken(dokuwikiParser.CODE_CLOSE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CODE_OPEN);
			setState(119);
			((CodeContext)_localctx).paragraph = paragraph();
			setState(120);
			match(CODE_CLOSE);
			builderHTML.append("<code>" + (((CodeContext)_localctx).paragraph!=null?_input.getText(((CodeContext)_localctx).paragraph.start,((CodeContext)_localctx).paragraph.stop):null) + "</code>");
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

	public static class Body_partContext extends ParserRuleContext {
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public Body_partContext body_part() {
			return getRuleContext(Body_partContext.class,0);
		}
		public ItalicContext italic() {
			return getRuleContext(ItalicContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public UnderlineContext underline() {
			return getRuleContext(UnderlineContext.class,0);
		}
		public SubscriptContext subscript() {
			return getRuleContext(SubscriptContext.class,0);
		}
		public SuperscriptContext superscript() {
			return getRuleContext(SuperscriptContext.class,0);
		}
		public DeletedContext deleted() {
			return getRuleContext(DeletedContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public Body_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterBody_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitBody_part(this);
		}
	}

	public final Body_partContext body_part() throws RecognitionException {
		Body_partContext _localctx = new Body_partContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_body_part);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				bold();
				setState(124);
				body_part();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				italic();
				setState(127);
				body_part();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				newline();
				setState(130);
				body_part();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				paragraph();
				setState(133);
				body_part();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				underline();
				setState(136);
				body_part();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				subscript();
				setState(139);
				body_part();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				superscript();
				setState(142);
				body_part();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				deleted();
				setState(145);
				body_part();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				link();
				setState(148);
				body_part();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(150);
				media();
				setState(151);
				body_part();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				quote();
				setState(154);
				body_part();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(156);
				code();
				setState(157);
				body_part();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(159);
				header();
				setState(160);
				body_part();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(162);
				newline();
				setState(163);
				body_part();
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

	public static class BodyContext extends ParserRuleContext {
		public List<Body_partContext> body_part() {
			return getRuleContexts(Body_partContext.class);
		}
		public Body_partContext body_part(int i) {
			return getRuleContext(Body_partContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dokuwikiListener ) ((dokuwikiListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(167);
					body_part();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rs\n\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00a8\n\20\3\21\6\21\u00ab\n\21\r\21\16\21"+
		"\u00ac\3\21\3\u00ac\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3"+
		"\2\3\4\2\u00b1\2#\3\2\2\2\4\'\3\2\2\2\6,\3\2\2\2\b\61\3\2\2\2\n\66\3\2"+
		"\2\2\f;\3\2\2\2\16@\3\2\2\2\20E\3\2\2\2\22H\3\2\2\2\24O\3\2\2\2\26T\3"+
		"\2\2\2\30r\3\2\2\2\32t\3\2\2\2\34x\3\2\2\2\36\u00a7\3\2\2\2 \u00aa\3\2"+
		"\2\2\"$\t\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'"+
		"(\7\5\2\2()\5\2\2\2)*\7\5\2\2*+\b\3\1\2+\5\3\2\2\2,-\7\6\2\2-.\5\2\2\2"+
		"./\7\6\2\2/\60\b\4\1\2\60\7\3\2\2\2\61\62\7\7\2\2\62\63\5\2\2\2\63\64"+
		"\7\7\2\2\64\65\b\5\1\2\65\t\3\2\2\2\66\67\7\b\2\2\678\5\2\2\289\7\t\2"+
		"\29:\b\6\1\2:\13\3\2\2\2;<\7\n\2\2<=\5\2\2\2=>\7\13\2\2>?\b\7\1\2?\r\3"+
		"\2\2\2@A\7\f\2\2AB\5\2\2\2BC\7\r\2\2CD\b\b\1\2D\17\3\2\2\2EF\7\16\2\2"+
		"FG\b\t\1\2G\21\3\2\2\2HI\7\20\2\2IJ\7#\2\2JK\7 \2\2KL\5\2\2\2LM\7\21\2"+
		"\2MN\b\n\1\2N\23\3\2\2\2OP\7\22\2\2PQ\7#\2\2QR\7\23\2\2RS\b\13\1\2S\25"+
		"\3\2\2\2TU\7\24\2\2UV\5\2\2\2VW\7\25\2\2WX\b\f\1\2X\27\3\2\2\2YZ\7\26"+
		"\2\2Z[\5\2\2\2[\\\7\26\2\2\\]\b\r\1\2]s\3\2\2\2^_\7\27\2\2_`\5\2\2\2`"+
		"a\7\27\2\2ab\b\r\1\2bs\3\2\2\2cd\7\30\2\2de\5\2\2\2ef\7\30\2\2fg\b\r\1"+
		"\2gs\3\2\2\2hi\7\31\2\2ij\5\2\2\2jk\7\31\2\2kl\b\r\1\2ls\3\2\2\2mn\7\32"+
		"\2\2no\5\2\2\2op\7\32\2\2pq\b\r\1\2qs\3\2\2\2rY\3\2\2\2r^\3\2\2\2rc\3"+
		"\2\2\2rh\3\2\2\2rm\3\2\2\2s\31\3\2\2\2tu\7\35\2\2uv\5\2\2\2vw\b\16\1\2"+
		"w\33\3\2\2\2xy\7\36\2\2yz\5\2\2\2z{\7\37\2\2{|\b\17\1\2|\35\3\2\2\2}~"+
		"\5\4\3\2~\177\5\36\20\2\177\u00a8\3\2\2\2\u0080\u0081\5\6\4\2\u0081\u0082"+
		"\5\36\20\2\u0082\u00a8\3\2\2\2\u0083\u0084\5\20\t\2\u0084\u0085\5\36\20"+
		"\2\u0085\u00a8\3\2\2\2\u0086\u0087\5\2\2\2\u0087\u0088\5\36\20\2\u0088"+
		"\u00a8\3\2\2\2\u0089\u008a\5\b\5\2\u008a\u008b\5\36\20\2\u008b\u00a8\3"+
		"\2\2\2\u008c\u008d\5\n\6\2\u008d\u008e\5\36\20\2\u008e\u00a8\3\2\2\2\u008f"+
		"\u0090\5\f\7\2\u0090\u0091\5\36\20\2\u0091\u00a8\3\2\2\2\u0092\u0093\5"+
		"\16\b\2\u0093\u0094\5\36\20\2\u0094\u00a8\3\2\2\2\u0095\u0096\5\22\n\2"+
		"\u0096\u0097\5\36\20\2\u0097\u00a8\3\2\2\2\u0098\u0099\5\24\13\2\u0099"+
		"\u009a\5\36\20\2\u009a\u00a8\3\2\2\2\u009b\u009c\5\32\16\2\u009c\u009d"+
		"\5\36\20\2\u009d\u00a8\3\2\2\2\u009e\u009f\5\34\17\2\u009f\u00a0\5\36"+
		"\20\2\u00a0\u00a8\3\2\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\5\36\20\2\u00a3"+
		"\u00a8\3\2\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\5\36\20\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7}\3\2\2\2\u00a7\u0080\3\2\2\2\u00a7\u0083\3\2\2\2\u00a7"+
		"\u0086\3\2\2\2\u00a7\u0089\3\2\2\2\u00a7\u008c\3\2\2\2\u00a7\u008f\3\2"+
		"\2\2\u00a7\u0092\3\2\2\2\u00a7\u0095\3\2\2\2\u00a7\u0098\3\2\2\2\u00a7"+
		"\u009b\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2"+
		"\2\2\u00a8\37\3\2\2\2\u00a9\u00ab\5\36\20\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad!\3\2\2\2"+
		"\6%r\u00a7\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}