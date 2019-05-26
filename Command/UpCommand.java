public class UpCommand implements Command {
    private final AirConditioner airConditioner;

    public UpCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.up();
    }
}
