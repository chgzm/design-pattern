public class Staff extends Worker {
    private static final int limitPrice = 100000;

    public Staff(String name, Worker boss) {
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
