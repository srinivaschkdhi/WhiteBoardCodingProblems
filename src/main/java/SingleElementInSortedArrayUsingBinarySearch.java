class SingleElementInSortedArrayUsingBinarySearch {
    public int singleNonDuplicate(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        int mid;

        // boundary case
        if (high == 0)
            return nums[0];
        else if (nums[0] != nums[1])
            return nums[0];
        else if (nums[high] != nums[high - 1])
            return nums[high];


        while (low <= high) {
            mid = low + (high - low) / 2;

            // Unique element condition
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            else if (((mid % 2 == 0) && (nums[mid] == nums[mid + 1])) || ((mid % 2 == 1) && (nums[mid] == nums[mid - 1])))
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
