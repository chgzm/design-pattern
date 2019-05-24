public class Main {
    public static void main(String[] args) {
        final SurroundedStringFactory surroundedStringFactory = new SurroundedStringFactory();

        final SurroundedString hello  = surroundedStringFactory.create("Hello");
        final SurroundedString world  = surroundedStringFactory.create("world");
        final SurroundedString hello2 = surroundedStringFactory.create("Hello");

        System.out.println(hello);
        System.out.println(world);
        System.out.println(hello2);
    }
}
