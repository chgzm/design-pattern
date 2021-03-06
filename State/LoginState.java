public class LoginState implements State {
    @Override
    public void createAccount(Context context) {
        System.err.println("Account is already created."); 
    }

    @Override
    public void login(Context context) {
        System.err.println("Already logged in.");
    }

    @Override
    public void logout(Context context) {
        System.out.println("Logged out.");
        context.setState(new LogoutState());
    }
}
