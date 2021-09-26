import java.util.Arrays;

/**
 * @author Srinivas_Chintakindhi
 */

public class MultiplyTwoNum {

       public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';

                int mul = n1 * n2;

                result[i + j + 1] += mul % 10;
                result[i + j] += mul / 10;
            }
        }

        for (int i = result.length - 1; i >= 1; i--) {
            int val = result[i];
            result[i] = val % 10;
            result[i - 1] += val / 10;
        }

        String res = "";
        for (int i : result) {
            res += i;
        }

        return removePrecedingZeros(res);
    }

    private String removePrecedingZeros(String res) {
        int index = 1;

        while(res.startsWith("0")){
            res = res.substring(index,res.length());
            index += 1;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = new MultiplyTwoNum().twoMul("0", "0");
        System.out.println("s = " + s);
    }
}
