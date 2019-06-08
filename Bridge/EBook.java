public class EBook extends Book {
    public EBook(BookImpl impl) {
        super(impl);
    }

    @Override
    public void showType() {
        System.out.println("# Electronic Book");
    }
}
