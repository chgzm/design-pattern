public class HTMLFactory implements Factory {
    @Override
    public Heading createHeading(String text) {
        return new HTMLHeading(text);
    }

    @Override
    public Paragraph createParagraph(String text) {
        return new HTMLParagraph(text);
    }
}
