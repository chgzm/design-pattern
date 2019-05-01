public class Book {
    protected final BookImpl impl;

    public Book(BookImpl impl) {
        this.impl = impl;
    }

    public void read() {
        this.impl.read();
    }
}
