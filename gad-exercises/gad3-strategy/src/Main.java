import java.util.Arrays;

interface SortingStrategy {
    void sort(Integer[] list);
}

class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    // Swap elements
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}

class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        if (list.length <= 1) {
            return;
        }

        int mid = list.length / 2;
        Integer[] left = Arrays.copyOfRange(list, 0, mid);
        Integer[] right = Arrays.copyOfRange(list, mid, list.length);

        sort(left);
        sort(right);

        merge(list, left, right);
    }

    private void merge(Integer[] list, Integer[] left, Integer[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                list[k++] = left[i++];
            } else {
                list[k++] = right[j++];
            }
        }

        while (i < left.length) {
            list[k++] = left[i++];
        }

        while (j < right.length) {
            list[k++] = right[j++];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copyOfArr1 = Arrays.copyOf(arr, arr.length);
        Integer[] copyOfArr2 = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copyOfArr1);
        displaySorted(new MergeSort(), copyOfArr2);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
