
public class PlusOneSolution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] <= 8) {
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }

        int[] newNumber = new int[n + 1];//by default all other values are 0.only need to set first digit
        newNumber[0] = 1;
        return newNumber;
    }
}
