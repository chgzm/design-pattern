public class EBook extends Book {
    public EBook(BookImpl impl) {
        super(impl);
    }

    @Override
    public void read() {
        System.out.println("### Read by e-book");
        this.impl.read();
    }
}
