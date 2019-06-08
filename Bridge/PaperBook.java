public class PaperBook extends Book {
    public PaperBook(BookImpl impl) {
        super(impl);
    }

    @Override
    public void showType() {
        System.out.println("# Paper Book");
    }
}
