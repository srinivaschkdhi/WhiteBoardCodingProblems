import java.util.HashMap;

/*Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.8*/
public class ContiguousArray {
    public int findMaxLen(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        counts.put(0, -1);

        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count -= 1;
            } else {
                count += 1;
            }

            if (counts.containsKey(count)) {
                maxLen = Math.max(maxLen, i - counts.get(count));
            } else {
                counts.put(count, i);
            }
        }

        return maxLen;
    }
}
