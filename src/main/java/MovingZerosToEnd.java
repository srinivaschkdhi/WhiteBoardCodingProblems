/*
Given an array of n integers.move all the zeros of given array to the end of the array
For example if the given array is {1,9,8,4,0,0,2,7,0,6,0}.it should be changed to {1,9,8,4,2,7,6,0,0,0,0}.
The order of all other elements should be same.
 */

import java.util.Arrays;

public class MovingZerosToEnd {
    public static void main(String[] args) {
        int[] A = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        moveZerosToEng(A);
    }

    private static void moveZerosToEng(int[] A) {
        int count = 0;
        int n = A.length - 1;
        for (int i = 0; i <= n; i++) {
            if (A[i] != 0) {
                A[count++] = A[i];
            }
        }
        while (count <= n) {
            A[count++] = 0;
        }

        System.out.println(Arrays.toString(A));
    }
}
