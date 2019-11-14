
public class MinSizeSubArraySum {
    public int minSubArrayLen(int s, int[] nums) {

        int left = 0;
        int right;
        int minSize = Integer.MAX_VALUE;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            right = i;
            while (sum >= s) {
                minSize = Math.min(minSize, (right - left) + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minSize == Integer.MAX_VALUE) ? 0 : minSize;
    }
}
