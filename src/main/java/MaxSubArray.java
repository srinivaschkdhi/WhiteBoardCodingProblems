public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSumEndingHere = 0;
        int maxSumSoFar = Integer.MIN_VALUE;

        for (int num : nums) {
            maxSumEndingHere += num;

            if (num > maxSumEndingHere)
                maxSumEndingHere = num;

            if (maxSumEndingHere > maxSumSoFar)
                maxSumSoFar = maxSumEndingHere;
        }
        return maxSumSoFar;
    }
    
    public static void main(String[] args) {
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        int maxSubArray = new MaxSubArray().maxSubArray(nums);
        System.out.println("maxSubArray = " + maxSubArray);
    }
}
