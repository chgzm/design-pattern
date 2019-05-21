import java.util.List;
import java.util.ArrayList;

public class PriceManager {
    private final List<Observer> observerList = new ArrayList<>();
    private int currentPrice = 0;

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void receivePrice(int price) {
        if (this.currentPrice != price) {
            this.currentPrice = price;
            this.notifyObservers();
        }
    }

    private void notifyObservers() {
        for (final Observer observer : this.observerList) {
            observer.update(this.currentPrice);
        }
    }
}
