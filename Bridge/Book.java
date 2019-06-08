public abstract class Book {
    private final BookImpl impl;

    public Book(BookImpl impl) {
        this.impl = impl;
    }

    public abstract void showType();

    public void showContent() {
        this.impl.showContent();
    }
}
