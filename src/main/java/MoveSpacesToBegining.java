/*
Given a string that has set of words and spaces,
Write a program to move the spaces to front of string you need to to traverse th array only once and need to adjust
the string in place.
input = "move these spaces to the begining"
output = "     movethesespacestothebegining"
 */
import java.util.Arrays;
import java.util.Scanner;
public class MoveSpacesToBegining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();
        moveSpacesToBegining(input);
    }

    private static void moveSpacesToBegining(String input) {
        char[] A = input.toCharArray();
        int j = A.length - 1;
        for(int i=j;i>=0;i--){
            if(A[i] != ' '){
                swap(A,j,i);
                j--;
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
