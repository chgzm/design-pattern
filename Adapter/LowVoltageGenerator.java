public class LowVoltageGenerator extends Generator implements Charger {
    @Override
    public Power get100VPower() {
        return this.getPower();
    }
}
