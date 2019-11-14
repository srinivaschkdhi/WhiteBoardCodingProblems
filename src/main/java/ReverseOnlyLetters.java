
import java.util.Stack;


public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {

        Stack<Character> stack = new Stack<>();
        StringBuilder revStr = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }

        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                revStr.append(stack.pop());
            } else {
                revStr.append(c);
            }
        }

        return revStr.toString();
    }

    public String reverseOnlyLetters2(String S) {
        StringBuilder revStr = new StringBuilder();
        int j = S.length() - 1;
        for (char c : S.toCharArray()) {

            if (Character.isLetter(c)) {
                while (!Character.isLetter(S.charAt(j))) {
                    j--;
                }
                revStr.append(S.charAt(j));
                j--;
            } else {
                revStr.append(c);
            }
        }

        return revStr.toString();
    }
}
