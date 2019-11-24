public class MissingNumber {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
    
        for(int i: nums){
            set.add(i);
        }
        
        for(int i = 0; i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        
        return -1;
    }
    
    public int missingNumber2(int[] nums) {
        int sum = 0;
        for(int i:nums)
            sum += i;
        
        int n = nums.length + 1;
        
        return n*(n-1)/2 - sum; // sum of n num is n(n+1)/2. zero should be excluded n-1(n+1-1)/2 = n(n-1)/2
    }
}
