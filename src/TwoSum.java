import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{1,2,3}, 5);
    }

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, i);
        }
       map.entrySet().forEach(System.out::println);
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(map.containsKey(compliment) && map.get(compliment)!=i){
                return new int[]{i,map.get(compliment)};
            }
            
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static int[] twoSum2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i );
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

}
