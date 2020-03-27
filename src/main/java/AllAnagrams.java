import java.util.ArrayList;
import java.util.List;

/**
 * @author Srinivas_Chintakindhi
 */

public class AllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0)
            return result;

        int[] char_counts = new int[26];

        for (char c : p.toCharArray()) {
            char_counts[c - 'a']++;
        }

        int i = 0;
        int j = 0;
        int count = p.length();

        while (j < s.length()) {

            if (char_counts[s.charAt(j++) - 'a']-- >= 1   ) {
                count--;
            }

            if (count == 0)
                result.add(i);

            if (j - i == p.length() && char_counts[s.charAt(i++) - 'a']++ >= 0){
                count++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> anagrams = new AllAnagrams().findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams);
    }
}
