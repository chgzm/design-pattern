public abstract class DecoratedCake implements Cake {
    protected final Cake cake;

    protected DecoratedCake(Cake cake) {
        this.cake = cake;
    }
}
    
 
