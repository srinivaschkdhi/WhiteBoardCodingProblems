import java.util.HashSet;
import java.util.Set;

/**
 * @author Srinivas_Chintakindhi
 */

public class SumofTwo {
    public boolean sumOfTwo(int[] nums1, int[] nums2, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            int diff = sum - num;
            set.add(diff);
        }

        for (int num : nums2) {
            if (set.contains(num))
                return true;
        }

        return false;
    }
}
