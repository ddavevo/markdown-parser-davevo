//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Test;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {

            int openBracket = markdown.indexOf("[", currentIndex);

            //--
            System.out.println("currentIndex: " + currentIndex);
            System.out.println("openBracket [: " + openBracket);
            //--

            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);

            //--
            System.out.println("closeBracket ]: " + closeBracket);
            System.out.println("openParen (: " + openParen);
            //--

            int closeParen = markdown.indexOf(")", openParen);

            //--
            System.out.println("closeParen ): " + closeParen);
            //--

            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;

            //--
            System.out.println("currentIndex: " + currentIndex);

            // If there is an empty space, it will not iterate 
            // any of the previous code.
            int emptyLine = 0;
            emptyLine = markdown.indexOf("", currentIndex);
            
            if (emptyLine != 0) {

                // currentIndex updates even if the link does not get
                // processed.
                currentIndex += 1;
                continue;
            }
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
