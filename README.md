# Translator języka DokuWiki do HTML

## Specyfikacja gramatyki języka
Plik ze specyfikacją znajduje się w repozytorium (dokuwiki2html\src\main\antlr4\dokuwiki.g4). Zdefiniowane są w nim reguły dla parsera (małymi literami) oraz dla lexera (wielkimi literami)

## Opis systemu typizacji dla języka DokuWiki

## Uzasadnienie wyboru generatora parserów ANTLR
Całość projektu stworzona została w języku Java, gdyż jest to język z którym najlepiej zaznajomieniu są autorzy projektu. W związku z tym wybraliśmy narzędzie ANTLR, które generuje parsery i lexery dla języka Java. Dodatkowo, dzięki dużej dostępności tutoriali i przykładów dla tego narzędzia mogliśmy samodzielnie nauczyć się jego obsługi.

## Napotkane problemy i sposób ich rozwiązania
1. Brak znajomości narzędzia ANTLR i początkowe problemy z konfiguracją przy użyciu narzędzia Maven (nie wskazano prawidłowej wersji pluginu). Problem został rozwiązany poprzez znalezienie innego tutoriala konfiguracji narzędzia.
2. 

## Bibliografia i linkografia
1. B. W. Kernighan, D. M. Ritchie, "Język ANSI C. Programowanie.", Wydanie II, 2010r, ISBN: 978-83-246-2578-9
2. [Instrukcja użytkownika DokuWiki](https://www.dokuwiki.org/manual)
3. [Składnia DokuWiki](https://www.dokuwiki.org/wiki:syntax)
4. [Strona internetowa ANTLR](https://www.antlr.org/)
5. [Tutorial konfiguracji ANTLR przy pomocy narzędzia Maven](https://alexecollins.com/antlr4-and-maven-tutorial/)
6. [Tutorial dla narzędzia ANTLR](https://tomassetti.me/antlr-mega-tutorial)
