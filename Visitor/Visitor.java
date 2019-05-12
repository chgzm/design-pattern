public interface Visitor {
    void visit(LeafNode leafNode);
    void visit(InternalNode internalNode);
}
