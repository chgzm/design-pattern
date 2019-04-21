public class HTMLHeading extends Heading {
    public HTMLHeading(String text) {
        super(text);
    }

    @Override
    public String toString() {
        return String.format("<h1>%s</h1>", this.text);
    }
}
