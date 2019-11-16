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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class LetterCombinationsofPhoneNumber {
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> output = new ArrayList<String>();

    public void backtrack(String combination, String next_digits) {
        // if there is no more digits to check
        if (next_digits.length() == 0) {
            // the combination is done
            output.add(combination);
        }
        // if there are still digits to check
        else {
            // iterate over all letters which map
            // the next available digit
            String digit = next_digits.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                // append the current letter to the combination
                // and proceed to the next digits
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0) {
            backtrack("", digits);
        }
        return output;
    }

    public List<String> letterCombinations2(String digits) {
        Queue<String> queue = new ArrayDeque<>();

        if (digits.length() == 0) {
            return new ArrayList<>(queue);
        }
        queue.add("");

        String[] charMap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));

            while (queue.peek().length() == i) {
                String permutation = queue.remove();
                for (char c : charMap[index].toCharArray()) {
                    queue.add(permutation + c);
                }
            }
        }

        return new ArrayList<>(queue);
    }

    public static void main(String[] args) {
        LetterCombinationsofPhoneNumber letterCombinationsofPhoneNumber = new LetterCombinationsofPhoneNumber();
        List<String> combinations = letterCombinationsofPhoneNumber.letterCombinations("234");
        System.out.println("combinations = " + combinations);
        List<String> strings = letterCombinationsofPhoneNumber.letterCombinations2("234");
        System.out.println("strings = " + strings);
        System.out.println(combinations.equals(strings));
    }


}
