import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MarkdownParseTest {
<<<<<<< HEAD
=======

>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
<<<<<<< HEAD
    public void testGetLinks() throws IOException {

        Path fileName = Path.of("/Users/stellaji/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> getLinksExpected = new ArrayList<>();
        getLinksExpected.add("https://something.com");
        getLinksExpected.add("some-thing.html");

        assertEquals(getLinksExpected, actualLinks);

    }

    @Test
    public void testParse1() throws IOException {

        Path fileName = Path.of("/Users/stellaji/Documents/GitHub/markdown-parser/breaking1.md");
=======
    public void testParse1() throws IOException {

        Path fileName = Path.of("breaking-files.md");
>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> expectedLinks1 = new ArrayList<>();
<<<<<<< HEAD
        expectedLinks1.add("https://fn258$!lmao.com");
        expectedLinks1.add("thiswillb[r]eak.org");
=======
        expectedLinks1.add("(https://parents.caprisun.com");
>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da

        assertEquals(expectedLinks1, actualLinks);

    }

    @Test
    public void testParse2() throws IOException {

<<<<<<< HEAD
        Path fileName = Path.of("/Users/stellaji/Documents/GitHub/markdown-parser/breaking2.md");
=======
        Path fileName = Path.of("breaking2-dave.md");
>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> expectedLinks = new ArrayList<>();
<<<<<<< HEAD
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-thing.html");
=======
        expectedLinks.add("https://shop.blackpinkmusic.com");
        expectedLinks.add("www.google.com");
>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da

        assertEquals(expectedLinks, actualLinks);

    }
<<<<<<< HEAD
    @Test
    public void testParse3() throws IOException {

        Path fileName = Path.of("/Users/stellaji/Documents/GitHub/markdown-parser/breaking3.md");
=======

    @Test
    public void testParse3() throws IOException {

        Path fileName = Path.of("breaking3-stella.md");
>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> expectedLinks = new ArrayList<>();
<<<<<<< HEAD
        expectedLinks.add("https://twice.jype.com/");
        expectedLinks.add("https://twice.jype.com/");
=======
        expectedLinks.add("https://twice.jype.com");
        expectedLinks.add("https://twice.jype.com");
>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da

        assertEquals(expectedLinks, actualLinks);

    }
<<<<<<< HEAD
    @Test
    public void testParse4() throws IOException {

        Path fileName = Path.of("/Users/stellaji/Documents/GitHub/markdown-parser/breaking3.md");
=======

    @Test
    public void testParse4() throws IOException {

        Path fileName = Path.of("failing-file.md");
>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> expectedLinks = new ArrayList<>();
<<<<<<< HEAD
        expectedLinks.add("https://twice.jype.com/");
        expectedLinks.add("https://twice.jype.com/");

        assertEquals(expectedLinks, actualLinks);

    }

    @Test
    public void testParse5() throws IOException {

        Path fileName = Path.of("/Users/stellaji/Documents/GitHub/markdown-parser/breaking2.md");
        String content = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(content);

        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-thing.html");
=======
>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da

        assertEquals(expectedLinks, actualLinks);

    }
}
<<<<<<< HEAD

=======
>>>>>>> 67ec86d2a22a57f6f4a084e138be669662b142da
