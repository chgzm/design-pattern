public class PaperBook extends Book {
    public PaperBook(BookImpl impl) {
        super(impl);
    }

    @Override
    public void read() {
        System.out.println("### Read by paper-book");
        this.impl.read();
    }
}
