public class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxIndexReached = 0;
        
        for(int i = 0; i < nums.length;i++){
            if(maxIndexReached < i)
                return false;
            
            maxIndexReached = Math.max(maxIndexReached,i + nums[i]);
        }
        
        return true;
    }
}
