
public class CanPermutatePalindrome {
    public boolean canPermuatatePalindrome(String s) {
        int[] char_counts = new int[128];

        for (char c : s.toCharArray()) {
            char_counts[c]++;
        }

        int numOfCharFrqOdd = 0;

        for (int i = 0; i < 128; i++) {
            if (char_counts[i] % 2 == 1) {
                numOfCharFrqOdd++;
            }
        }

        return numOfCharFrqOdd <= 1;
    }
}
