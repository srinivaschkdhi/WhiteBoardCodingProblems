class SingleNumberII {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if ((nums[j] & (1 << i)) != 0)
                    count++;
            }

            result = result | (count % 3) << i;

            System.out.println(result);

        }

        return result;
    }

    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        
        
        if(n < 3)
            return nums[0];
        
        
        if(nums[0] != nums[1])
            return nums[0];
        
        if(nums[n - 1] != nums[n - 2])
            return nums[n - 1];
     
        
        for(int i = 1; i <n; i=i+3){
                
            if(nums[i] != nums[i - 1])
                return nums[i - 1];
            
        }
        
        return -1;
        
    }
    public static void main(String[] args) {
        new SingleNumberII().singleNumber(new int[]{2,3,2,2});
    }
}
