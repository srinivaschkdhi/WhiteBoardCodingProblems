import java.util.PriorityQueue;
//(x2 ^ 2 + y2 ^ 2) _ (x1 ^2 + y1 ^ 2)
public class KClosetPointstoOrigin {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        
        for(int[] point : points){
            maxHeap.add(point);
            if(maxHeap.size() > K){
             maxHeap.remove();   
            }
        }
        
        int[][] result = new int[K][2];
        while(K-- >0){
            result[K] = maxHeap.remove();
        }
        
        return result;
    }

    public int[][] kClosest2(int[][] points, int K) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->((a[0]*a[0]+a[1]*a[1]) - (b[0]*b[0]+b[1]*b[1])));
        
        for(int[] point : points){
            minHeap.add(point);
        }
        
        int[][] result = new int[K][2];
        
        for(int i = 0; i < K; i++){
            result[i] = minHeap.remove();
        }

        return result;
    }
}

(a, b)->(-