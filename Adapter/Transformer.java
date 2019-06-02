public class Transformer implements Charger {
    private final Generator generator;

    public Transformer(Generator generator) {
        this.generator = generator;
    }
    
    @Override
    public Power100V getPower100V() {
        final Power200V power200V = this.generator.getPower200V();
        return new Power100V(power200V.getWatt());
    }
}
