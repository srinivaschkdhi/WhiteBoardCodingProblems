public class MaxandMininArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, -10, 9, 8, 7, 6, 5};
        findWithPairsComparison(A);
    }

    private static void findWithPairsComparison(int[] A) {
        int large = -1;
        int small = Integer.MAX_VALUE;
        int n = A.length;


        for (int i = 0; i < n - 1; i++) {
            if (A[i] < A[i + 1]) {
                if (A[i] < small)
                    small = A[i];
                if (A[i + 1] > large)
                    large = A[i + 1];
            } else {
                if (A[i + 1] < small)
                    small = A[i + 1];
                if (A[i] > large)
                    large = A[i];
            }
        }
        System.out.println("Small is :" + small);
        System.out.println("Large is:" + large);
    }
}
