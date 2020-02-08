import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int stone : stones){
            maxHeap.add(stone);
        }


        while(maxHeap.size() > 1){
            int stoneOne = maxHeap.poll();
            int stoneTwo = maxHeap.poll();

            if(stoneOne - stoneTwo != 0){
                maxHeap.add(Math.abs(stoneOne - stoneTwo));
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
