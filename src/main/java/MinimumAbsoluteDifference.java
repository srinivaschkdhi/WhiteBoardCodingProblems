import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minAbsoluteDiff(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }

        return result;
    }
}
