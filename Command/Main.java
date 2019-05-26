public class Main {
    public static void main(String[] args) {
        final AirConditioner airConditioner = new AirConditioner(20);

        final Command upCmd   = new UpCommand(airConditioner);
        final Command downCmd = new DownCommand(airConditioner);

        upCmd.execute();
        downCmd.execute();
    }
}
