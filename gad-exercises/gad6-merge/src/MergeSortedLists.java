import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            int num1 = list1.get(i);
            int num2 = list2.get(j);

            if (num1 <= num2) {
                mergedList.add(num1);
                i++;
            } else {
                mergedList.add(num2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 5, 6);
        List<Integer> list2 = List.of(2, 3, 4);
        List<Integer> mergedList1 = merge(list1, list2);
        System.out.println("Ex1: merge([1,5,6], [2,3,4]) => " + mergedList1);

        List<Integer> list3 = List.of(1, 5, 6, 7, 8, 9);
        List<Integer> list4 = List.of(2, 3, 4);
        List<Integer> mergedList2 = merge(list3, list4);
        System.out.println("Ex2: merge([1,5,6,7,8,9], [2,3,4]) => " + mergedList2);
    }
}
