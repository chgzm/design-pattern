package manager;

public class Manager {
    private static Manager instance;

    protected Manager() {
    }

    public synchronized static Manager getInstance() {
        if (instance == null) {
            final String env = System.getenv("MANAGER");
            if (env == null) {
                instance = new Manager();  
            } else {
                switch (env) {
                case "Project": { instance = new ProjectManager(); break; }
                case "Sales":   { instance = new SalesManager();   break; }
                case "Account": { instance = new AccountManager(); break; }
                default:        { instance = new Manager();        break; }
                }
            }
        } 

        return instance;
    }
    
    @Override
    public String toString() {
        return "Default Manager";
    }
}
