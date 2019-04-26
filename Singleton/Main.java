public class Main {
    public static void main(String[] args) {
        final Singleton s1 = Singleton.getInstance();
        System.out.println(s1);

        final Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
