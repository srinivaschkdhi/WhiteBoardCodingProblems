import java.util.HashMap;
import java.util.Map;

public class ShortestSubArrayWithDegree {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> nums_counts = new HashMap<>();
        int degree = 0;

        HashMap<Integer, Integer> first_seen = new HashMap<>();
        int min_length = 0;

        for (int i = 0; i < nums.length; i++) {
            first_seen.putIfAbsent(nums[i], i);
            nums_counts.put(nums[i], nums_counts.getOrDefault(nums[i], 0) + 1);

            if (nums_counts.get(nums[i]) > degree) {
                degree = nums_counts.get(nums[i]);
                min_length = i - first_seen.get(nums[i]) + 1;
            } else if (nums_counts.get(nums[i]) == degree) {
                min_length = Math.min(min_length, i - first_seen.get(nums[i]) + 1);
            }
        }

        return min_length;
    }
    
    public int shortestSubArray2(int[] nums) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        Map<Integer, Integer> firstSeen = new HashMap<>();
        int degree = 0;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            firstSeen.putIfAbsent(num, i);
            numsCount.put(num, numsCount.getOrDefault(num, 0) + 1);

            if (numsCount.get(num) > degree) {
                degree = numsCount.get(num);
                minLen = i - firstSeen.get(num) + 1;
            } else if (numsCount.get(num) == degree)
                minLen = Math.min(minLen, i - firstSeen.get(num) + 1);
        }
        return minLen;
    }
    
}
