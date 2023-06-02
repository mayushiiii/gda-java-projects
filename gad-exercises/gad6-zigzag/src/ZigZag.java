import java.util.Arrays;
import java.util.List;

public class ZigZag {
    public static void zigZagSort(List<Integer> nums) {
        int n = nums.size();
        boolean flag = true;

        for (int i = 0; i < n - 1; i++) {
            if (flag) {
                if (nums.get(i) > nums.get(i + 1)) {
                    swap(nums, i, i + 1);
                }
            } else {
                if (nums.get(i) < nums.get(i + 1)) {
                    swap(nums, i, i + 1);
                }
            }

            flag = !flag;
        }
    }

    private static void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(4, 3, 7, 8, 6, 2, 1);
        zigZagSort(nums1);
        System.out.println("Output: " + nums1);

        List<Integer> nums2 = Arrays.asList(1, 4, 3, 2);
        zigZagSort(nums2);
        System.out.println("Output: " + nums2);
    }
}
