
import org.antlr.v4.runtime.*;

import java.util.*;

public class main { 
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Wpisz tekst w DokuWiki:");
            
            String dwText = scanner.nextLine();

            dokuwikiLexer dwLexer = new dokuwikiLexer( CharStreams.fromString(dwText));
            CommonTokenStream commonTokenStream = new CommonTokenStream(dwLexer);
            dokuwikiParser dwParser = new dokuwikiParser(commonTokenStream);

            dwParser.body();

            String htmlText = dwParser.builderHTML.toString();

            System.out.println("");
            System.out.println("Tekst w DokuWiki: " + dwText);
            System.out.println("Tekst w HTML: " + htmlText);
            System.out.println("");
        }


    }

}
