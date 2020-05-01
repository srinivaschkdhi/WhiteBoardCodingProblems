/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations
 that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.
 Note that 1 does not map to any letters.
 */
/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations
 that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.
 Note that 1 does not map to any letters.
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class LetterCombinationsofPhoneNumber {
    public List<String> letterCombinations2(String digits) {
        Queue<String> queue = new ArrayDeque<>();

        if (digits.length() == 0) {
            return new ArrayList<>(queue);
        }
        queue.add("");

        String[] keyPad = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int indexInKeyPad = digits.charAt(i) - '0';

            while (queue.peek().length() == i) { // loop queue to pull all i size elements

                String iLenStr = queue.remove();

                for (char c : keyPad[indexInKeyPad].toCharArray()) {
                    queue.add(iLenStr + c);
                }
            }
        }

        return new ArrayList<>(queue);
    }

    public static void main(String[] args) {
        List<String> strings = new LetterCombinationsofPhoneNumber().letterCombinations2("234");
        System.out.println("strings = " + strings);
    }
}
//

//"234"
//indexes = 0,1,2
// at i = 0, for 0th index input we add all 0 length elements of queue
// at i = 1, for 1th index input we add all 1 length elements of queue
// at i = 2, for 2th index input we add all 2 length elements of queue
// for ith index input add all i size elements of queue