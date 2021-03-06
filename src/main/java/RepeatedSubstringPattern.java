/*
Given a non-empty string check if it can be constructed by taking a substring of it and appending
multiple copies of the substring together. You may assume the given string consists of lowercase
English letters only and its length will not exceed 10000.

 Example 1:

Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.

Example 2:

Input: "aba"
Output: False

Example 3:

Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)

 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {// can ith len substring divide string into equal parts

                int num_repeats = len / i;// if it can divide , how many no of parts .
                String substring = s.substring(0, i);
                StringBuilder stringBuilder = new StringBuilder();

                for (int j = 0; j < num_repeats; j++) {
                    stringBuilder.append(substring);
                }

                if (stringBuilder.toString().equals(s))
                    return true;
            }
        }

        return false;
    }
}
