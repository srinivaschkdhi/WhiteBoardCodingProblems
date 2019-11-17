import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> result = new ArrayList<>();

        int[] currInterval = intervals[0];
        result.add(currInterval);

        for (int[] interval : intervals) {
            int currBegin = currInterval[0];
            int currEnd = currInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if (currEnd >= nextBegin) {
                currInterval[1] = Math.max(nextEnd, currEnd);
            } else {
                currInterval = interval;
                result.add(currInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
