public class President extends Worker {
    public President(String name, Worker boss) {
        super(name, boss);
    }

    @Override
    public boolean decide(int price) {
        return true;
    }
}
