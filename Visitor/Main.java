public class Main {
    public static void main(String[] args) {
        final Node root     = new InternalNode("Root", 0); 
        final Node internal = new InternalNode("Internal", 1); 

        final Node leaf1 = new LeafNode("Leaf1", 1); 
        final Node leaf2 = new LeafNode("Leaf2", 2); 
        final Node leaf3 = new LeafNode("Leaf3", 2); 

        root.add(internal);
        root.add(leaf1);
        internal.add(leaf2);
        internal.add(leaf3);

        root.accept(new NodeVisitor());
    }
} 
