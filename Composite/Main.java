public class Main {
    public static void main(String[] args) {
        final Node internal1 = new InternalNode("Root", 0); 
        final Node internal2 = new InternalNode("Internal", 1); 

        final Node leaf1 = new LeafNode("Leaf1", 1); 
        final Node leaf2 = new LeafNode("Leaf2", 2); 
        final Node leaf3 = new LeafNode("Leaf3", 2); 

        internal1.add(internal2);
        internal1.add(leaf1);
        internal2.add(leaf2);
        internal2.add(leaf3);

        internal1.print();
    }
} 
