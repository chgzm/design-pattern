public class NoAccountState implements State {
    @Override
    public void createAccount(Context context) {
        System.out.println("Created Account.");
        context.setState(new LogoutState());
    }

    @Override
    public void login(Context context) {
        System.out.println("No Account.");
    }

    @Override
    public void logout(Context context) {
        System.out.println("No Account.");
    }
}
