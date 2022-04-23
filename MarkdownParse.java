//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {

            // If there is an empty space, it will not iterate 
            // any of the previous code.
            int nextLine = 0;
            nextLine = markdown.indexOf("[", currentIndex);
            System.out.println("nextLine: " + nextLine);
            System.out.println("currentIndex: " + currentIndex);
            
            if (nextLine < 0) {

                // currentIndex updates even if the link does not get
                // processed.
                currentIndex += 1;
                continue;
            }

            int openBracket = markdown.indexOf("[", currentIndex);

            //--
            // System.out.println("currentIndex: " + currentIndex);
            // System.out.println("openBracket [: " + openBracket);
            //--

            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);

            //--
            // System.out.println("closeBracket ]: " + closeBracket);
            // System.out.println("openParen (: " + openParen);
            //--

            // if there is an empty char, make that the end bound
            if (markdown.contains(".com")) {

                int comLength = ".com".length();
                int emptySpace = markdown.indexOf(".com", currentIndex);
                toReturn.add(markdown.substring(openParen + 1,
                                                emptySpace + comLength));
                currentIndex = emptySpace + 1;
                continue;
            }

            int closeParen = markdown.indexOf(")", openParen);

            //--
            System.out.println("closeParen ): " + closeParen);
            //--

            int closeParenToEnd = closeParen;
            while (closeParenToEnd < markdown.length()) {

                // if there is a new ')' update closeParen
                if (markdown.charAt(closeParenToEnd) == ')') {
                    closeParen += 1;
                }

                closeParenToEnd += 1;
            }

            //--
            System.out.println("closeParen ): " + closeParen);
            //--

            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;

            //--
            // System.out.println("currentIndex: " + currentIndex);
            //--
            
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
        System.out.println();
    }
}
