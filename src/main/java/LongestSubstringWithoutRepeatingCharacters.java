import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int aPtr = 0;
        int bPtr = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (bPtr < s.length()) {
            if (!hashSet.contains(s.charAt(bPtr))) {
                hashSet.add(s.charAt(bPtr));
                bPtr++;
                max = Math.max(max, hashSet.size());//bPtr - aPtr
            } else {
                hashSet.remove(s.charAt(aPtr));
                aPtr++;
            }
        }

        return max;

    }
}
// if not present add to hashmap and inc bptr
//if present remove aptr and inc
