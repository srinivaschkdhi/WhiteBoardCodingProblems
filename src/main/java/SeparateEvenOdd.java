
import java.util.Arrays;


public class SeparateEvenOdd {

    public static int[] separateEvenOdd(int[] A) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {

            while (A[left] % 2 == 0 && left < right) {
                left++;
            }

            while (A[right] % 2 == 1 && left < right) {
                right--;
            }

            if (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }

        return A;

    }


    public static int[] sepEvenOdd(int[] A) {
        int i = 0;
        int j = 0;

        for (i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenOdd = sepEvenOdd(A);
        System.out.println(Arrays.toString(evenOdd));
    }
}
