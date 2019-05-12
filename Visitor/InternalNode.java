import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class InternalNode extends Node {
    private final List<Node> nodeList = new ArrayList<>();

    public InternalNode(String name, int depth) {
        super(name, depth);
    }

    @Override
    public void add(Node node) {
        this.nodeList.add(node);
    }

    public Iterator<Node> iterator() {
        return this.nodeList.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

