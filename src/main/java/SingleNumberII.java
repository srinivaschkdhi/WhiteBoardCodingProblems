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

    public static void main(String[] args) {
        new SingleNumberII().singleNumber(new int[]{2,3,2,2});
    }
}