
public class MinInRotatedSortedArray {
    public int findMin(int[] A) {
        if (A.length == 0) {
            return -1;
        }
        if (A.length == 1) {
            return A[0];
        }

        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid > 0 && A[mid] < A[mid - 1]) {
                return A[mid];
            } else if (A[low] <= A[mid] && A[high] < A[mid]) {//left is sorted eliminate left part
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return A[low];
    }

}
