public class DownCommand implements Command {
    private final AirConditioner airConditioner;

    public DownCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.down();
    }
}
