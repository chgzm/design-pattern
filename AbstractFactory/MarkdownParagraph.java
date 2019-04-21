public class MarkdownParagraph extends Paragraph {
    public MarkdownParagraph(String text) {
        super(text);
    }

    @Override
    public String toString() {
        return this.text;
    }
}
