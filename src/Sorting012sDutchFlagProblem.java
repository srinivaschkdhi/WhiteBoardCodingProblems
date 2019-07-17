import java.util.Arrays;

/*
Sort an array of 0's , 1's and 2's [or R's ,G's and B's].
Given an array A[] consisting 0's 1's and 2's.
Give an Algorithm for sorting A[].
The algorithm should put all 0's first then all 1's and finally all the 2's at the end.
input = {0,1,1,0,1,2,1,2,0,0,0,1}
output = {0,0,0,0,0,1,1,1,1,1,2,2}
 */
public class Sorting012sDutchFlagProblem {
    public static void main(String[] args) {
        int[] input = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sorting012sDutch(input);
    }

    public static void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void sorting012sDutch(int[] A) {
        int low = 0;
        int mid = 0;
        int high = A.length - 1;

        while (mid <= high) {
            switch (A[mid]) {
                case 0:
                    //int temp = A[low];
                    //  A[low] = A[mid];
                    // A[mid] = temp;
                    swap(low, mid, A);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // int temp2 = A[mid];
                    //A[mid] = A[high];
                    // A[high] = temp2;
                    swap(mid, high, A);
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(A));
    }


}
