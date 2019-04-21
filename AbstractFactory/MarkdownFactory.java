public class MarkdownFactory implements Factory {
    @Override
    public Heading createHeading(String text) {
        return new MarkdownHeading(text);
    }

    @Override
    public Paragraph createParagraph(String text) {
        return new MarkdownParagraph(text);
    }
}
