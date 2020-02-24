import java.util.HashSet;
import java.util.Set;

/**
 * @author Srinivas_Chintakindhi
 */

public class LargestSubsetWithConsNumbers {
    public int lscn(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLen = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (!set.contains(num - 1)) {//is it start of sequence
                int temp = num;
                while (set.contains(temp))
                    temp++;

                if (maxLen < (temp - num))// is this largest subset
                    maxLen = temp - num;
            }
        }

        return maxLen;
    }


}
