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
    
    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());

        LinkedList<Interval> merged = new LinkedList<Interval>();
        for (Interval interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast().end < interval.start) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast().end = Math.max(merged.getLast().end, interval.end);
            }
        }

        return merged;
    }
}

