public class Transformer implements Charger {

    private final Generator generator;

    public Transformer(Generator generator) {
        this.generator = generator;
    }
    
    @Override
    public Power get100VPower() {
        return this.generator.getPower();
    }
}
