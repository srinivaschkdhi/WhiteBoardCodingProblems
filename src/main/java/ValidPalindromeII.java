
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int aPointer = 0;
        int bPointer = s.length() - 1;

        while (aPointer <= bPointer) {
            if (s.charAt(aPointer) != s.charAt(bPointer)) {
                return helperMethod(s, aPointer + 1, bPointer) || helperMethod(s, aPointer, bPointer - 1);
            }
            aPointer += 1;
            bPointer -= 1;
        }
        return true;
    }

    public boolean helperMethod(String s, int aPointer, int bPointer) {

        while (aPointer <= bPointer) {
            if (s.charAt(aPointer) != s.charAt(bPointer)) {
                return false;
            }

            aPointer += 1;
            bPointer -= 1;
        }

        return true;
    }
}
