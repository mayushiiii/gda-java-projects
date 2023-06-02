public class ArrayCustomIterator {
    private int[] array;
    private int index;

    public ArrayCustomIterator(int[] arr) {
        this.array = arr;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < array.length;
    }

    public int next() {
        int element = array[index];
        index++;
        return element;
    }
}
