public class MarkdownHeading extends Heading {
    public MarkdownHeading(String text) {
        super(text);
    }

    @Override
    public String toString() {
        return String.format("# %s", this.text);
    }
}
