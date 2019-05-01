public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Invalid args length.");
            return;
        }

        final String strategyName = args[0];
        Context context = null;
        switch (strategyName) {
        case "Possession": { context = new Context(new Possession()); break; }
        case "Counter":    { context = new Context(new Counter());    break; }
        default:           { System.err.println("Invalid strategy name."); return; }
        }

        context.execute();
    }
}
