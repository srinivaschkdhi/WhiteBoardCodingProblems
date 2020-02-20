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
}
