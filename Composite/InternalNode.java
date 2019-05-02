import java.util.List;
import java.util.ArrayList;

public class InternalNode extends Node {
    private final List<Node> nodeList = new ArrayList<>();

    public InternalNode(String name, int depth) {
        super(name, depth);
    }

    @Override
    public void add(Node node) {
        this.nodeList.add(node);
    }

    @Override
    public void print() {
        super.print();
        for (final Node node : this.nodeList) {
            node.print();
        }
    }
}

