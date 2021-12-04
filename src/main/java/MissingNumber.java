public class MissingNumber {
    public int missingNumber1(int[] nums) {
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
        boolean[] seen = new boolean[nums.length + 1];
        
    
        for(int i: nums){
            seen[i] = true;
        }
        
        for(int i = 0; i< seen.length;i++){
           if(seen[i] == false)
               return i;
        }
        
        return -1;
    }
    
    public int missingNumber3(int[] nums) {
        int sum = 0;
        for(int i:nums)
            sum += i;
        
        int n = nums.length + 1; // as one number is missing . we add 1 and find sum of n numbers.
        
        return n*(n-1)/2 - sum; // sum of n num is n(n+1)/2. last num should be excluded n-1(n+1-1)/2 = n(n-1)/2
    }

     public int missingNumber4(int[] nums) {
          int sum = 0;
        for(int i:nums)
            sum += i;
        
        int n = nums.length; // even though 1 num is missing. as 0 does not add value to sum .
                                 // we can go n = nums.length; 0 == extra num.
        
        return n*(n + 1)/2 - sum;
    }
}
