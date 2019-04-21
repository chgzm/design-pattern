public class HTMLParagraph extends Paragraph {
    public HTMLParagraph(String text) {
        super(text);
    }

    @Override
    public String toString() {
        return String.format("<p>%s</p>", this.text);
    }
}
