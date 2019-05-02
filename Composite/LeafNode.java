import java.util.List;
import java.util.ArrayList;

public class LeafNode extends Node {
    public LeafNode(String name, int depth) {
        super(name, depth);
    }

    @Override
    public void add(Node node) {
        throw new UnsupportedOperationException("Cannot add node.");
    }
}

