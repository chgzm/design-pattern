public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        this.builder.makeHeader("Header");
        this.builder.makeParagraph("This is Paragraph.");
    }
}
