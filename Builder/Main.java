public class Main {
    public static void main(String[] args) {
        // HTML
        {
            final HTMLBuilder builder  = new HTMLBuilder();
            final Director director = new Director(builder);
            director.construct();
            System.out.println(builder.getResult());
        }

        // Markdown
        {
            final MarkdownBuilder builder  = new MarkdownBuilder();
            final Director director = new Director(builder);
            director.construct();
            System.out.println(builder.getResult());
        }
    }
}
