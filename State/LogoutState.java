public class LogoutState implements State {
    @Override
    public void createAccount(Context context) {
        System.err.println("Account is already created."); 
    }

    @Override
    public void login(Context context) {
        System.out.println("Logged in.");
        context.setState(new LoginState());
    }

    @Override
    public void logout(Context context) {
        System.err.println("Already logged out.");
    }
}
