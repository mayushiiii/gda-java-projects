import java.lang.reflect.Array;
import java.util.Iterator;

class GenericList<T> implements Iterable<T> {
    private ListElement<T> head;

    public void add(T data) {
        ListElement<T> newElement = new ListElement<>(data);
        if (head == null) {
            head = newElement;
        } else {
            ListElement<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newElement);
        }
    }

    public T[] toArray() {
        int size = getSize();
        T[] array = (T[]) Array.newInstance(head.getData().getClass(), size);

        ListElement<T> current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.getData();
            current = current.getNext();
        }

        return array;
    }

    public int getSize() {
        int count = 0;
        ListElement<T> current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(head);
    }
}

class ListElement<T> {
    private T data;
    private ListElement<T> next;

    public ListElement(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public ListElement<T> getNext() {
        return next;
    }

    public void setNext(ListElement<T> next) {
        this.next = next;
    }
}

class ListIterator<T> implements Iterator<T> {
    private ListElement<T> current;

    public ListIterator(ListElement<T> head) {
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}
