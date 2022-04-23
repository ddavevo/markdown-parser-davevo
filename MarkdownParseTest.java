import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {

        Path fileName = Path.of("/Users/ddavepersona/Documents/GitHub/markdown-parser-davevo/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> getLinksExpected = new ArrayList<>();
        getLinksExpected.add("https://something.com");
        getLinksExpected.add("some-thing.html");

        assertEquals(actualLinks, getLinksExpected);

    }

    @Test
    public void testParse1() throws IOException {

        Path fileName = Path.of("/Users/ddavepersona/Documents/GitHub/markdown-parser-davevo/breaking-files.md");
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> expectedLinks1 = new ArrayList<>();
        expectedLinks1.add("(https://parents.caprisun.com");

        assertEquals(actualLinks, expectedLinks1);

    }

    @Test
    public void testParse2() throws IOException {

        Path fileName = Path.of("/Users/ddavepersona/Documents/GitHub/markdown-parser-davevo/breaking2.md");
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("[https://shop.blackpinkmusic.com");
        expectedLinks.add("www.google.com");

        assertEquals(actualLinks, expectedLinks);

    }
    @Test
    public void testParse3() throws IOException {

        Path fileName = Path.of("/Users/ddavepersona/Documents/GitHub/markdown-parser-davevo/breaking3.md");
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("");

        assertEquals(actualLinks, expectedLinks);

    }
}
