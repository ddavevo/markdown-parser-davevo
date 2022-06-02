import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class TryCommonMark {
    
    Parser parser = Parser.builder().build();
    Node document = parser.parse("This is *Sparta*");
    HtmlRenderer renderer = HtmlRenderer.builder().build();
    String result = renderer.render(document);
}
