public class Main {
    public static void main(String[] args) {
        // 1. Delegation
        {
            final Charger charger = new Transformer(new Generator());
            final Power100V power = charger.getPower100V();

            System.out.println("Delegation:" + power);
        }

        // 2. Inheritance
        {
            final Charger charger = new LowVoltageGenerator();
            final Power100V power = charger.getPower100V();

            System.out.println("Inheritance:" + power);
        }
    }
}
