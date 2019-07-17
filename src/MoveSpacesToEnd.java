/*
Given a String that has set of words and spaces. Write a program to move the spaces to end of string.
input = "moves the spaces to the end"
output = "movethespacestotheend     "
Method 2
 */

import java.util.Arrays;
import java.util.Scanner;

public class MoveSpacesToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        moveSpacesToEnd(str);
    }

    private static void moveSpacesToEnd(String str) {
        char[] A = str.toCharArray();
        for (int i = 0, j = 0; i < A.length; i++) {
            if (A[i] != ' ') {
                swap(A, j, i);              // swap(A,j++,i);
                j++;                        //
            }
        }
        System.out.println(Arrays.toString(A));

    }

    private static void swap(char[] a, int j, int i) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}