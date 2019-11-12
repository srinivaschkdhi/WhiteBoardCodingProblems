
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String fixedStr = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                fixedStr += c;
            }
        }

        fixedStr = fixedStr.toLowerCase();

        int aPointer = 0;
        int bPointer = fixedStr.length() - 1;

        while (aPointer <= bPointer) {
            if (fixedStr.charAt(aPointer) != fixedStr.charAt(bPointer)) {
                return false;
            }

            aPointer += 1;
            bPointer += 1;
        }

        return true;
    }
}
