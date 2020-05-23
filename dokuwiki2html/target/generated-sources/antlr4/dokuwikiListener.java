// Generated from dokuwiki.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dokuwikiParser}.
 */
public interface dokuwikiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(dokuwikiParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(dokuwikiParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(dokuwikiParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(dokuwikiParser.BoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalic(dokuwikiParser.ItalicContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalic(dokuwikiParser.ItalicContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#underline}.
	 * @param ctx the parse tree
	 */
	void enterUnderline(dokuwikiParser.UnderlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#underline}.
	 * @param ctx the parse tree
	 */
	void exitUnderline(dokuwikiParser.UnderlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(dokuwikiParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(dokuwikiParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#superscript}.
	 * @param ctx the parse tree
	 */
	void enterSuperscript(dokuwikiParser.SuperscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#superscript}.
	 * @param ctx the parse tree
	 */
	void exitSuperscript(dokuwikiParser.SuperscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#deleted}.
	 * @param ctx the parse tree
	 */
	void enterDeleted(dokuwikiParser.DeletedContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#deleted}.
	 * @param ctx the parse tree
	 */
	void exitDeleted(dokuwikiParser.DeletedContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(dokuwikiParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(dokuwikiParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(dokuwikiParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(dokuwikiParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#media}.
	 * @param ctx the parse tree
	 */
	void enterMedia(dokuwikiParser.MediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#media}.
	 * @param ctx the parse tree
	 */
	void exitMedia(dokuwikiParser.MediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#footnote}.
	 * @param ctx the parse tree
	 */
	void enterFootnote(dokuwikiParser.FootnoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#footnote}.
	 * @param ctx the parse tree
	 */
	void exitFootnote(dokuwikiParser.FootnoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(dokuwikiParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(dokuwikiParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(dokuwikiParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(dokuwikiParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(dokuwikiParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(dokuwikiParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#body_part}.
	 * @param ctx the parse tree
	 */
	void enterBody_part(dokuwikiParser.Body_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#body_part}.
	 * @param ctx the parse tree
	 */
	void exitBody_part(dokuwikiParser.Body_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link dokuwikiParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(dokuwikiParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dokuwikiParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(dokuwikiParser.BodyContext ctx);
}