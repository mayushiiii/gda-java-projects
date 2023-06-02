public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3};
        IArrayIterator<Integer> arrayIterator = new ArrayIterator<>(arr);
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        IArrayIterator<Integer> listIterator = new ArrayIterator<>(list.toArray());
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}