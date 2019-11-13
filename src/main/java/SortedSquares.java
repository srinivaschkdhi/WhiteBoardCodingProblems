
public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int posPtr = 0;

        while (posPtr < n && A[posPtr] < 0) {
            posPtr += 1;
        }

        int negPtr = posPtr - 1;

        int[] sortedSqrs = new int[n];
        int counter = 0;

        while (negPtr >= 0 && posPtr < n) {
            if (A[negPtr] * A[negPtr] < A[posPtr] * A[posPtr]) {
                sortedSqrs[counter] = A[negPtr] * A[negPtr];
                negPtr -= 1;
            } else {
                sortedSqrs[counter] = A[posPtr] * A[posPtr];
                posPtr += 1;
            }
            counter += 1;
        }

        while (negPtr >= 0) {
            sortedSqrs[counter] = A[negPtr] * A[negPtr];
            negPtr -= 1;
            counter += 1;
        }

        while (posPtr < n) {
            sortedSqrs[counter] = A[posPtr] * A[posPtr];
            posPtr += 1;
            counter += 1;
        }

        return sortedSqrs;
    }
}
