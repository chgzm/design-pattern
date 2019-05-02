public class CakeWithCream extends DecoratedCake {
    public CakeWithCream(Cake cake) {
        super(cake);
    }

    @Override
    public String toString() {
        return this.cake.toString() + ", with cream";
    }
}
    
 
