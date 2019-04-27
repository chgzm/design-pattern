public class Slime implements Monster {
    private final String name;

    public Slime(String name) {
        this.name = name;
    }

    public Monster createClone() throws CloneNotSupportedException {
        return (Monster)(this.clone()); 
    }

    @Override
    public String toString() {
        return (this.name + "Slime");
    }
}

