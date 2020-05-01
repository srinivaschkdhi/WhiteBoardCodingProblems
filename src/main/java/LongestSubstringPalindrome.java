public class LongestSubstringPalindrome {
    public String longestSubstring(String s) {

        int n = s.length();

        if (n == 0)
            return "";

        if (n == 1)
            return s;


        boolean[][] palindrome = new boolean[n][n];
        int maxLength = 1;
        int startIndex = 0;


        for (int i = 0; i < n; i++) {
            palindrome[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                palindrome[i][i + 1] = true;
                startIndex = i;
                maxLength = 2;
            }
        }

        for (int currLen = 3; currLen <= n; currLen++) {
            for (int i = 0; i < n - currLen + 1; i++) {
                int j = i + currLen - 1;
                if (s.charAt(i) == s.charAt(j) && palindrome[i + 1][j - 1]) {
                    palindrome[i][j] = true;
                    startIndex = i;
                    maxLength = currLen;
                }
            }
        }

        return s.substring(startIndex, startIndex + maxLength);
    }
}
