public class Main {
    public static void main(String[] args) {
        final PriceManager manager = new PriceManager();
        manager.receivePrice(100);

        manager.addObserver(new PriceObserver());
        manager.addObserver(new TaxInPriceObserver());

        manager.receivePrice(200);
        manager.receivePrice(200);
        manager.receivePrice(50);
    }
}
