public class JunkListIterator<E> implements Iterator<E> {

    private final JunkList<E> junkList;
    private int index;

    public JunkListIterator(JunkList<E> junkList) {
        this.junkList = junkList;
    }

    @Override
    public boolean hasNext() {
        return (this.index < this.junkList.getIndex());
    }

    @Override
    public E next() {
        E element = this.junkList.getElement(this.index);
        ++(this.index);
        return element; 
    }
}
    
