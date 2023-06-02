import java.util.ArrayList;
import java.util.List;

public class Leaders {
    public static List<Integer> findLeaders(List<Integer> nums) {
        List<Integer> leaders = new ArrayList<>();

        int n = nums.size();
        int currentMax = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            int num = nums.get(i);
            if (num > currentMax) {
                leaders.add(num);
                currentMax = num;
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(8, 3, 10, 4, 6, 7, 5, 2, 9);
        List<Integer> leaders = findLeaders(nums);

        System.out.println("Leaders: " + leaders);
    }
}
