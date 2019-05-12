public class Manager extends Worker {
    private static final int limitPrice = 500000;

    public Manager(String name, Worker boss) {
        super(name, boss);
    }

    @Override
    public boolean decide(int price) {
        if (price <= limitPrice) {
            return true;
        } else {
            return false;
        }
    }
}
