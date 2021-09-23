import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countsStack = new Stack<>();
        Stack<String> stack = new Stack<>();

        int index = 0;
        String chars = "";

        while (index < s.length()) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + s.charAt(index) - '0';
                    index++;
                }
                countsStack.push(count);
            } else if (c == '[') {
                stack.push(chars);
                chars = "";
                index++;
            } else if (c == ']') {
                String prevChars = stack.pop();;

                String tmp = "";
                int count = countsStack.pop();
                for (int i = 0; i < count; i++) {
                    tmp += chars;
                }

                chars = prevChars + tmp;
                index++;
            } else {
                chars += s.charAt(index);
                index++;
            }
        }
        return chars;
    }
}
