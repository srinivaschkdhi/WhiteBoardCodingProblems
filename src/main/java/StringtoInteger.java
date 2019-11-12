public class StringtoInteger {
    public static boolean ifConversionPossible(String s) {
        char firstNonWhiteSpaceChar = findNonWhiteSpaceChar(s);
        char secondNonWhiteSpaceChar =  s.charAt(s.indexOf(firstNonWhiteSpaceChar)+1);
        if (firstNonWhiteSpaceChar != '-' && firstNonWhiteSpaceChar != '+' && !(firstNonWhiteSpaceChar >= '0' && firstNonWhiteSpaceChar <= '9'))
            return false;
        if(secondNonWhiteSpaceChar <'0' || secondNonWhiteSpaceChar>'9')
            return false;
        return true;
    }

    public static char findNonWhiteSpaceChar(String s) {
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != ' ') {
                return s.charAt(i);
            }
            i++;
        }
        return 'f';
    }

    public static long convertToInt(String s, int index) {
        char flag = '+';
        if(findNonWhiteSpaceChar(s)=='-')
            flag = '-';
        int i = index;
        long result = 0;
        while(i < s.length() && s.charAt(i)>='0'&&s.charAt(i)<='9'){
            result = result * 10 + s.charAt(i)-'0';
            i++;
        }
        return flag=='+'?result:-result;
    }

    public static long stringToInteger(String s) {
        long answer = 0;
        if (ifConversionPossible(s)) {
            answer = convertToInt(s, findDigitIndex(s));
        }
        return isInIntRange(answer) ? answer : Integer.MIN_VALUE;
    }

    public static boolean isInIntRange(long answer) {
        return answer <= Integer.MAX_VALUE && answer >= Integer.MIN_VALUE;
    }

    public static int findDigitIndex(String s) {
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                return i;
            i++;
        }
        return s.length();
    }

    public static void main(String[] args) {
        long result = stringToInteger("+-2");
        System.out.println("result = " + result);
    }
}
