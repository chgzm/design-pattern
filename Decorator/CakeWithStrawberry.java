public class CakeWithStrawberry extends DecoratedCake {
    public CakeWithStrawberry(Cake cake) {
        super(cake);
    }

    @Override
    public String toString() {
        return this.cake.toString() + ", with strawberry";
    }
}
    
 
