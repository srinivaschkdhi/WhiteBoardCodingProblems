public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsOnes = 0;
        int numOfOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                numOfOnes += 1;
                maxConsOnes = Math.max(maxConsOnes, numOfOnes);
            } else {
                numOfOnes = 0;
            }
        }

        return maxConsOnes;
    }
}
