grammar dokuwiki;

@members {
protected StringBuilder builderHTML = new StringBuilder();
}

//Parser rules

paragraph: (CHARACTER | SPACE)+ ;
bold: BOLD paragraph BOLD {builderHTML.append("<b>" + $paragraph.text +"</b>");} ;
italic:	ITALIC paragraph ITALIC {builderHTML.append("<i>" + $paragraph.text +"</i>");} ;
underline: UNDERLINE paragraph UNDERLINE {builderHTML.append("<u>" +$paragraph.text + "</u>");} ;
subscript: SUBSCRIPT_OPEN paragraph SUBSCRIPT_CLOSE {builderHTML.append("<sub>" + $paragraph.text + "</sub>");} ;
superscript: SUPERSCRIPT_OPEN paragraph SUPERSCRIPT_CLOSE {builderHTML.append("<sup>" + $paragraph.text + "</sup>");} ;
deleted: DELETED_OPEN paragraph DELETED_CLOSE {builderHTML.append("<strike>" + $paragraph.text + "</strike>");} ;
newline: LINEBREAK {builderHTML.append("</br>");} ;
link: LINK_OPEN URL COMBINE paragraph LINK_CLOSE {builderHTML.append("<a href='" + $URL.text + "'>" + $paragraph.text + "</a>");} ;
media: MEDIA_OPEN URL MEDIA_CLOSE {builderHTML.append("<img src='" + $URL.text + "'>");} ;
footnote: FOOTNOTE_OPEN paragraph FOOTNOTE_CLOSE {builderHTML.append("<sup>" + $paragraph.text + "</sup>");} ;
header:	HEADLINE_1 paragraph HEADLINE_1 {builderHTML.append("<h1>" + $paragraph.text + "</h1>");} | HEADLINE_2 paragraph HEADLINE_2 {builderHTML.append("<h2>" + $paragraph.text +"</h2>");} | HEADLINE_3 paragraph HEADLINE_3 {builderHTML.append("<h3>" + $paragraph.text + "</h3>");} | HEADLINE_4 paragraph HEADLINE_4 {builderHTML.append("<h4>" + $paragraph.text + "</h4>");} | HEADLINE_5 paragraph HEADLINE_5 {builderHTML.append("<h5>" + $paragraph.text + "</h5>");} ;		
quote: QUOTE paragraph {builderHTML.append("<blockquote>" + $paragraph.text + "</blockquote>");} ;
code: CODE_OPEN paragraph CODE_CLOSE {builderHTML.append("<code>" + $paragraph.text + "</code>");} ;
body_part: bold body_part | italic body_part | newline body_part | paragraph body_part | underline body_part | subscript body_part | superscript body_part | deleted body_part | link body_part | media body_part | quote body_part | code body_part | header body_part | newline body_part ;
body: body_part+? ;

//Lexer rules

SPACE: ' ' | '\t' ;
CHARACTER: '!' | '$' | '#' | '"' | '%' | '&' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '?' | '@' | '^' | '_' | '`' |    '0'..'9' | 'A'..'Z'  | 'a'..'z' | '(' | ')' | '~' | '\'' | '<' | '[' | ']' | '|' ;
BOLD: '**' ;
ITALIC: '//' ;
UNDERLINE: '__' ;
SUBSCRIPT_OPEN:	'<sub>' ;
SUBSCRIPT_CLOSE: '</sub>' ;
SUPERSCRIPT_OPEN: '<sup>' ;
SUPERSCRIPT_CLOSE: '</sup>' ;
DELETED_OPEN: '<del>' ;
DELETED_CLOSE:	'</del>' ;
LINEBREAK:  '\\' | '\r'?'\n' | '\r' ;
BOLD_SINGL: '%' ;
LINK_OPEN: '[[' ;
LINK_CLOSE: ']]' ;
MEDIA_OPEN:	'{{' ;
MEDIA_CLOSE: '}}' ;
FOOTNOTE_OPEN: '((' ;
FOOTNOTE_CLOSE:	'))' ;
HEADLINE_1:	'=' ;
HEADLINE_2:	'==' ;
HEADLINE_3:	'===' ;
HEADLINE_4:	'====' ;
HEADLINE_5:	'=====' ;
LIST: '* ' ;
ORDERED_LIST: '- ' ;
QUOTE: '>' ;
CODE_OPEN: '<code>' | '<file>' ;
CODE_CLOSE:	'</code>' | '</file>' ;
COMBINE: '|' ;
URL_OPEN: 'http://' | 'https://';
WHITESPACE:	[\t\r\n]+ -> skip ;	

