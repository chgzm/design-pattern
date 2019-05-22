public class Context {
    private State state = new NoAccountState();

    public void setState(State state) {
        this.state = state;
    }

    public void createAccount() {
        this.state.createAccount(this);
    }

    public void login() {
        this.state.login(this);
    }

    public void logout() {
        this.state.logout(this);
    }
}
