public class Main {
    public static void main(String[] args) {
        final Cake simpleCake = new SimpleCake();
        System.out.println(simpleCake);

        final Cake withCream = new CakeWithCream(simpleCake);
        System.out.println(withCream);

        final Cake withStrawberry = new CakeWithStrawberry(withCream);
        System.out.println(withStrawberry);
    }
}
