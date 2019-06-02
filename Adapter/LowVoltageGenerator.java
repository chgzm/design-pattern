public class LowVoltageGenerator extends Generator implements Charger {
    @Override
    public Power100V getPower100V() {
        final Power200V power200V = this.getPower200V();
        return new Power100V(power200V.getWatt());
    }
}
