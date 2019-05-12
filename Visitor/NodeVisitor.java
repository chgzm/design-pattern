import java.util.Iterator;

public class NodeVisitor implements Visitor {
    @Override
    public void visit(LeafNode leafNode) {
        leafNode.print();        
    }

    @Override
    public void visit(InternalNode internalNode) {
        internalNode.print();
        final Iterator<Node> itr = internalNode.iterator();
        while (itr.hasNext()) {
            final Node node = itr.next();
            node.accept(this);
        }         
    }
}
