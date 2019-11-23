/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array 
such that nums[i] = nums[j] and the absolute difference between i and j is at most k. */

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int currNum = nums[i];
            
            if(map.containsKey(currNum) && i - map.get(currNum) <=k)
                    return true;
            else
                map.put(currNum,i);
        }
        
        return false;
    }
}
