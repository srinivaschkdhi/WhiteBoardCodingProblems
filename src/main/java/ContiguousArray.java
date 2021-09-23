import java.util.HashMap;

/*Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1*/
/*find count sum and put countsum and index in hashmap*/
public class ContiguousArray {
    public int findMaxLen(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        counts.put(0, -1);

        int maxLen = 0;
        int count = 0;
        // count = 0 =>at this point it has equal no of zeros and ones
        // count = 2 => at this point it has no of ones greater than 0 by 2
        // count = -2 => at this pint it has no of zeros greater than 1 by 2

        for (int i = 0; i < nums.length; i++) {
            

           count += nums[i] == 1 ? 1 : -1;
           // count = 0 =>at this point it has equal no of zeros and ones
        // count = 2 => at this point it has no of ones greater than 0 by 2
        // count = -2 => at this pint it has no of zeros greater than 1 by 2

            if (counts.containsKey(count)) {// if this count already presnt. means array b/w cur index and found index
                                                // have same no of zeros and ones ( since equal 0's and 1's sum is zero.)
                maxLen = Math.max(maxLen, i - counts.get(count));
            } else {
                counts.put(count, i);
            }
        }

        return maxLen;
    }
}
