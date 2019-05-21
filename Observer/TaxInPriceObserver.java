public class TaxInPriceObserver implements Observer {
    @Override
    public void update(int price) {
        System.out.printf("New Price=%d including tax\n",  (int)(price * 1.08));
    }
}
