import java.util.PriorityQueue;

/**
 * @author Srinivas_Chintakindhi
 */

public class KthLargestNumber {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.add(num);
        }

        while(minHeap.size() > k)
            minHeap.remove();

        return minHeap.remove();
    }

     public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int i  = 0;
        
        for(i = 0; i < k ; i ++){
            minHeap.add(nums[i]);
        }
        
        
        for(;i < nums.length;i++){
            if(nums[i] > minHeap.peek()){
                minHeap.remove();
                minHeap.add(nums[i]);
            }
        }
        
        return minHeap.peek();
    }
}
