/*
 Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
s = "abc", t = "ahbgdc"

Return true.

Example 2:
s = "axc", t = "ahbgdc"

Return false.
 */
public class IsSubsequence {
    public boolean isSubsequence(String s,String t){
        if(s.length() ==0 ) return true;

        int s_pointer = 0;
        int t_pointer = 0;

        while(t_pointer < t.length()){
            if(t.charAt(t_pointer) == s.charAt(s_pointer)){
                s_pointer += 1;

                if(s_pointer == s.length())
                    return true;
            }
            t_pointer += 1;
        }

        return false;
    }
}
