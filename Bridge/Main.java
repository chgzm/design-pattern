public class Main {
    public static void main(String[] args) {
        // EBook
        {
            final EBook novel      = new EBook(new Novel());
            final EBook nonfiction = new EBook(new Nonfiction());
            novel.read();
            nonfiction.read();
        }

        // PaperBook
        {
            final PaperBook novel      = new PaperBook(new Novel());
            final PaperBook nonfiction = new PaperBook(new Nonfiction());
            novel.read();
            nonfiction.read();
        }

    } 
}
