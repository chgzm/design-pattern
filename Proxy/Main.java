public class Main {
    public static void main(String[] args) {
        final FileDumper dumper = new FileDumperProxy("test.txt");
        dumper.dump();
    }
}
