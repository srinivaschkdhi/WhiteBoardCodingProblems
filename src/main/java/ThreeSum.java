/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> threeSum = threeSum(nums);
        System.out.println("threeSum = " + threeSum);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int k = 0; k < n;) {
            for (int i = k + 1, j = n - 1; i < j; ) {
                if (nums[k] + nums[i] + nums[j] == 0) {
                    threeSumList.add(new ArrayList<>(Arrays.asList(nums[k], nums[i], nums[j])));
                    i = movToNxtDstEle(nums, n, i);
                    j = ṁovToPreDstEle(nums, j);
                } else if (nums[k] + nums[i] + nums[j] < 0){
                    i = movToNxtDstEle(nums, n, i);
                }

                else{
                    j = ṁovToPreDstEle(nums, j);
                }

            }
            k = movToNxtDstEle(nums, n, k);
        }
        return threeSumList;
    }

    private static int ṁovToPreDstEle(int[] nums, int j) {
        while (j > 0 && nums[j] == nums[j - 1])
            j--;
        j--;
        return j;
    }

    private static int movToNxtDstEle(int[] nums, int n, int i) {
        while (i < n - 1 && nums[i] == nums[i + 1])
            i++;
        i++;
        return i;
    }
}
