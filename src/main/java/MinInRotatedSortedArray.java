
public class MinInRotatedSortedArray {
    public int findMin(int[] A) {
         if (A == null || A.length == 0)
                return 0;

        // Case when A is not rotated. Then first index is the pivot
        if (A.length == 1 || A[0] < A[A.length - 1]) {
            return 0;
        }

        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid < A.length - 1 && A[mid] > A[mid + 1])
                return A[mid + 1];
            else if (A[low] <= A[mid]) {
                // If A[start] <= A[mid],
                // it means from start to mid, all elements are in sorted order,
                // so pivot will be in second half
                low = mid + 1;
            } else
                // else pivot lies in first half, so we find the pivot in first half
                high = mid - 1;
        }

        return 0;
    }

}
