public abstract class Node {
    protected final String name;
    protected final int    depth;

    public Node(String name, int depth) {
        this.name  = name;
        this.depth = depth;
    }

    public void print() {
        for (int i = 0; i < this.depth; ++i) {
            System.out.print("    ");
        }
        System.out.println(this.name);
    }

    public abstract void add(Node node);
} 
