public class PriceObserver implements Observer {
    @Override
    public void update(int price) {
        System.out.printf("New Price=%d\n", price);   
    }
}
