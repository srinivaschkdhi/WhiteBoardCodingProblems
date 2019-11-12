/*
Separating positive and negative numbers
input = {1, 2, 3, -7, -5, 6, 7, -1, -8};
output = {-7, -5, -1, -8, 2, 6, 7, 3, 1};
 */
import java.util.Arrays;

public class SeparatePositiveAndNegativeNumber {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, -7, -5, 6, 7, -1, -8};
        separatePositiveAndNegative(A);
    }

    private static void separatePositiveAndNegative(int[] A) {
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                swap(A, j, i);
                j++;
            }
        }
        System.out.println(Arrays.toString(A));
    }

    private static void swap(int[] a, int j, int i) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}