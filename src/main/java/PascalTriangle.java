import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalTriangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = pascalTriangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);

            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currRow.add(1);

            pascalTriangle.add(currRow);
        }

        return pascalTriangle;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> pascalTriangle = generate(5);
        pascalTriangle.forEach(System.out::println);
    }
}
