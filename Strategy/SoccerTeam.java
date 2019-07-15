public class SoccerTeam {
    private final Strategy strategy;

    public SoccerTeam(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.execute();
    }
}
