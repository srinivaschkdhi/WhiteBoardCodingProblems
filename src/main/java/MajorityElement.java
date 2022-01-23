import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) 
            return nums[0];
        
        Map<Integer,Integer> map = new HashMap<>();
            
            for(int i : nums){

                if(map.containsKey(i) && map.get(i) + 1 > nums.length / 2)
                    return i;

                map.put(i,map.getOrDefault(i,0) + 1);
        }
        
        return -1;
    }
}
