public class Main {
    public static void main(String[] args) {
        final Context context = new Context();

        context.login();         
        context.logout();
        context.createAccount();

        context.createAccount();
        context.logout();
        context.login();

        context.createAccount();
        context.login();
        context.logout();

        context.createAccount();
        context.logout();
        context.login();
    }
}
