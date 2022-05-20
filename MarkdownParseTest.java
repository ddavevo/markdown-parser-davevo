import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


public class MarkdownParseTest {

    @Test
    public void addition(){
        assertEquals(2, 1+1);
    }

    @Test
    public void MarkdownParseTest1() throws IOException{
        ArrayList<String> expected = 
        new ArrayList<>(List.of("https://something.com",
                            "some-thing.html"));
        ArrayList<String> resultArray = 
        MarkdownParse.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/test1.md")));
        assertEquals(expected, resultArray);
    }

    @Test
    public void MarkdownParseTest2() throws IOException{
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> resultArray =
        MarkdownParse.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/break-file.md")));
        assertEquals(expected, resultArray);
    }

    @Test
    public void MarkdownParseTest3() throws IOException{
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> resultArray =
        MarkdownParse.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/break-file2.md")));
        assertEquals(expected, resultArray);
    }

    @Test
    public void MarkdownParseTest4() throws IOException{
        ArrayList<String> expected = new ArrayList<>(List.of("someLink.com"));
        ArrayList<String> resultArray =
        MarkdownParse.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/break-file3.md")));
        assertEquals(expected, resultArray);
    }

    // @Test
    // public void MarkdownParseTest5() throws IOException{
    //     ArrayList<String> expected = new ArrayList<>(List.of("https://something.com", "some-page.html"));
    //     MarkdownParse mp = new MarkdownParse();
    //     ArrayList<String> resultArray = mp.getLinks(Files.readString(Path.of("test-file2.md")));
    //     assertEquals(expected, resultArray);
    // }

    @Test
    public void MarkdownParseTest6() throws IOException{
        ArrayList<String> expected = 
        new ArrayList<>(List.of("https://something.com",
                            "some-page.html", "https://something.com"));
        ArrayList<String> resultArray =
        MarkdownParse.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/test-file2.md")));
        assertEquals(expected, resultArray);
    }

    @Test
    public void MarkdownParseTest7() throws IOException{
        ArrayList<String> expected = new ArrayList<>(List.of());
        ArrayList<String> resultArray =
        MarkdownParse.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/test-file3.md")));
        assertEquals(expected, resultArray);
    }

    public void testGetLinks1() throws IOException{
        Graph graph = new Graph();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, graph.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/test-file.md"))));
    }
    
    @Test
    public void testGetLinks2() throws IOException{
        Graph graph = new Graph();
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, graph.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/test-file-break1.md"))));
    }

    @Test
    public void testGetLinks3() throws IOException{
        Graph graph = new Graph();
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, graph.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/test-file-break2.md"))));
    }

    @Test
    public void testGetLinks4() throws IOException{
        Graph graph = new Graph();
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, graph.getLinks(Files.readString(Path.of("/Users" + 
        "/ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/test-file-break3.md"))));

    }

    // @Test
    // public void testGetLinks5() throws IOException{
    //     Graph graph = new Graph();
    //     ArrayList<String> expected = new ArrayList<>();
    //     expected.add("hello.com");
    //     assertEquals(expected, graph.getLinks(Files.readString(Path.of("test-file-break4.md"))));
    // }

    @Test
    public void testSnippet1() throws IOException{
        ArrayList<String> expected = 
        new ArrayList<>(List.of("url.com", "google.com",
                            "google.com", "ucsd.edu"));
        ArrayList<String> resultArray = 
        MarkdownParse.getLinks(Files.readString(Path.of("/Users/" +
        "ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/snippet1.md")));
        assertEquals(expected, resultArray);
    }

    @Test
    public void testSnippet2() throws IOException{
        ArrayList<String> expected = 
        new ArrayList<>(List.of("b.com","a.com((", "example.com"));
        ArrayList<String> resultArray = 
        MarkdownParse.getLinks(Files.readString(Path.of("/Users/" +
        "ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/snippet2.md")));
        assertEquals(expected, resultArray);
    }

    @Test
    public void testSnippet3() throws IOException{
        ArrayList<String> expected = 
        new ArrayList<>(List.of("https://www.twitter.com",
        "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
        "github.com", "https://cse.ucsd.edu/"));
        ArrayList<String> resultArray = 
        MarkdownParse.getLinks(Files.readString(Path.of("/Users/" +
        "ddavepersona/Documents/GitHub/markdown-parser-latest/" +
        "markdown-parser/snippet3.md")));
        assertEquals(expected, resultArray);
    }
}

// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java MarkdownParse.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
//changes
