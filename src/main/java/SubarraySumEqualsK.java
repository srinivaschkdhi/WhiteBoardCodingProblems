import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int K) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();//sums and their ;
        hashMap.put(0, 1);
        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (hashMap.containsKey(sum - K)) {
                count += hashMap.get(sum - K);
            }

            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
