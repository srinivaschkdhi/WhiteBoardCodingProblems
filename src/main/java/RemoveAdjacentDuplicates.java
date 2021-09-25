import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String S) {
        char[] stack = new char[S.length()];
        int i = 0;

        for (int j = 0; j < S.length(); j++) {
            char currChar = S.charAt(j);

            if (i > 0 && stack[i - 1] == currChar) {
                i -= 1;
            } else {
                stack[i] = currChar;
                i += 1;
            }
        }

        return new String(stack, 0, i);
    }

   public static String removeDuplicates3(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c)
                stack.pop();
            else
                stack.push(c);
        }

        String result = "";
        while (!stack.isEmpty())
            result = stack.pop() + result;

        return result;
    }
    
    public static String removeDuplicates2(String S) {
        Stack<Character> stack = new Stack<>();

        for (char c : S.toCharArray()) {

            if (stack.isEmpty() || c != stack.peek()) {
                stack.push(c);
            } else {
                stack.pop();
            }

        }
        String str = "";

        while (!stack.isEmpty()) {
            str = stack.pop() + str;
        }
        return str;
    }


    public static void main(String[] args) {
        String st = removeDuplicates2("aabceec");
        System.out.println("st = " + st);
        String st2 = removeDuplicates2("aabceec");
        System.out.println("st2 = " + st2);
    }
}
