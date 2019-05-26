public class AirConditioner {
    private int temperature;

    public AirConditioner(int presetTemperature) {
        this.temperature = presetTemperature;
    }
    
    public void up() {
        ++(this.temperature);
        System.out.printf("Raised temperature to %d.\n", this.temperature);
    }
    
    public void down() {
        --(this.temperature);
        System.out.printf("Lowered temperature to %d.\n", this.temperature);
    }
}
