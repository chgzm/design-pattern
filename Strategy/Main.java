public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Invalid args length.");
            return;
        }

        final String strategyName = args[0];
        SoccerTeam team = null;
        switch (strategyName) {
        case "Possession": { team = new SoccerTeam(new Possession()); break; }
        case "Counter":    { team = new SoccerTeam(new Counter());    break; }
        default:           { System.err.println("Invalid strategy name."); return; }
        }

        team.execute();
    }
}
