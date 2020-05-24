# Translator języka DokuWiki do HTML

## Specyfikacja gramatyki języka
Plik ze specyfikacją znajduje się w repozytorium (dokuwiki2html\src\main\antlr4\dokuwiki.g4). Zdefiniowane są w nim reguły dla parsera (małymi literami) oraz dla lexera (wielkimi literami)

```
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
```

## Opis projektu
Całość projektu została stworzona w języku Java przy użyciu edytora kodu Visual Studio Code. Do tworzenia translatora użyto narzędzia ANLTR w wersji 4.8. Projekt zostal zbudowany przy użyciu narzędzia Maven. Zrealizowaliśmy tłumaczenia następujących funkcjonalności języka DokuWiki:
1. Pogrubienie tekstu
2. Tekst pisany kursywą
3. Podkreślenie tekstu
4. Indeks dolny i górny
5. Przekreślenie tekstu
6. Link zewnętrzny
7. Media
8. Przypis
9. Nagłowki 1-5
10. Cytat
11. Blok kodu

## Uzasadnienie wyboru generatora parserów ANTLR
Całość projektu stworzona została w języku Java, gdyż jest to język z którym najlepiej zaznajomieniu są autorzy projektu. W związku z tym wybraliśmy narzędzie ANTLR, które generuje parsery i lexery dla języka Java. Dodatkowo, dzięki dużej dostępności tutoriali i przykładów oraz obszernej dokumentacji dla tego narzędzia mogliśmy samodzielnie nauczyć się jego obsługi.

## Napotkane problemy i sposób ich rozwiązania
Pierwszym z problemów napotkanych podczas relizacji projektu był wybór technologii w której zostanie zrealizowany. Ponieważ, jak wyżej wspomniano, najlepiej zaznajomieni jesteśmy z językiem Java, zdecydowaliśmy się na użycie narzędzia ANTLR. 
Kolejnym z napotkanych problemów była nieznajomość obsługi tego narzędzia - pierwsze problemy napotkaliśmy już przy próbie uruchomienia go przy użyciu narzędzia Maven. Przez wskazanie nieprawidłowej wersji w pliku konfiguracyjnym nie udało nam się wygenerować potrzebnych klas. Także specyfikacja gramatyki stworzona za pierwszym razem okazała się być błędna i przy pierwszych próbach tłumaczenia języka DokuWiki otrzymywaliśmy w rezultacie pusty string. Dopiero po przeanalizowaniu kilku tutoriali byliśmy w stanie poprawić początkowe błędy i uzyskać działający translator. 
Ostatnim z problemów, niezwiązanym bezpośrednio z narzędziem ANTLR, był problem z połączeniem używanego przez nas edytora kodu (Visual Studio Code) z narzędziem kontroli wersji Git. Jako że żadne z nas nie używało wcześniej tego edytora kodu, a chclieśmy się nauczyć jego obsługi zdeydowalismy się realizować projekt przy jego pomocy. Niestety, pomimo instalacji odpowiedniego plugina nie byliśmy w stanie zsynchronizować tworzonego projektu z repozytorium na github. Dlatego zdecydowaliśmy się stworzyć projekt lokalnie i dodać go w całości do repozytorium.

## Bibliografia i linkografia
1. B. W. Kernighan, D. M. Ritchie, "Język ANSI C. Programowanie.", Wydanie II, 2010r, ISBN: 978-83-246-2578-9
2. [Instrukcja użytkownika DokuWiki](https://www.dokuwiki.org/manual)
3. [Składnia DokuWiki](https://www.dokuwiki.org/wiki:syntax)
4. [Strona internetowa ANTLR](https://www.antlr.org/)
5. [Tutorial konfiguracji ANTLR przy pomocy narzędzia Maven](https://alexecollins.com/antlr4-and-maven-tutorial/)
6. [Tutorial dla narzędzia ANTLR](https://tomassetti.me/antlr-mega-tutorial)
