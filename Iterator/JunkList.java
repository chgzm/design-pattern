public class JunkList<E> implements BaseCollection<E> {
    private Object[] elements = new Object[1024];
    private int index = 0;

    public void add(E e) {
        this.elements[index] = e;
        ++index;
    } 

    @SuppressWarnings("unchecked")
    public E getElement(int index) {
        return (E)(this.elements[index]);
    }

    public int getIndex() {
        return this.index;
    }

    @Override
    public Iterator<E> iterator() {
        return new JunkListIterator<E>(this);
    }
}
