//Given an array of integers nums, find the maximum length of a subarray where the product of all its elements is positive.
public class MaxLenSubarrayPostiveProduct {
    public int getMaxLen(int[] nums) {
        int max = Integer.MIN_VALUE;

        int firstNegative = -1;
        int zeroPosition = -1;
        int negCount = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                negCount = 0;
                firstNegative = -1;
                zeroPosition = i;
            }else{
                if(nums[i] < 0){
                    negCount++;

                    if(firstNegative == -1)
                        firstNegative = i;
                }

                if(negCount % 2 == 0)
                    max = Math.max(max,i - zeroPosition);
                else
                    max = Math.max(max,i - firstNegative);
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
