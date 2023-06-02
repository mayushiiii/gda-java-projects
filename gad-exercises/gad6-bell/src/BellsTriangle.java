import java.util.ArrayList;
import java.util.List;

public class BellsTriangle {
    public static List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(triangle.get(i - 1).get(i - 1));

            for (int j = 1; j <= i; j++) {
                int num = row.get(j - 1) + triangle.get(i - 1).get(j - 1);
                row.add(num);
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generateTriangle(numRows);

        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
