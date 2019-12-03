public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1])
                isIncreasing = false;

            if (A[i] < A[i + 1])
                isDecreasing = false;
        }

        return isDecreasing || isIncreasing;
    }
}
