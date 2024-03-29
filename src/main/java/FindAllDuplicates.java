/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n]
and each integer appears once or twice, return an array of all the integers that appears twice.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Srinivas_Chintakindhi
 */

public class FindAllDuplicates {
    public List<Integer> findAllDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int x : nums){
            int index = Math.abs(x) - 1;

            if(nums[index] < 0){
                set.add(Math.abs(x));
            }else{
                nums[index] = -nums[index];
            }

        }
        return new ArrayList<>(set);
    }

   public List<Integer> findDuplicates2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for(int x: nums){
          
            boolean is = set.add(x);
        
            if(is == false)
                list.add(x);
            
        }
        
        return list;
    }
    
    public List<Integer> findDuplicates3(int[] nums) {
     List<Integer> list = new ArrayList<>();

        for(int x : nums){
            int index = Math.abs(x) - 1;

            if(nums[index] < 0){
                list.add(Math.abs(x));
            }else{
                nums[index] = -nums[index];
            }

        }
        return list;
    }
    
    public static void main(String[] args) {
        List<Integer> allDuplicates = new FindAllDuplicates().findAllDuplicates(new int[]{4, 2, 2, 1, 2, 4, 1});
        allDuplicates.forEach(System.out::println);
    }
}
