import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        Set<Character> jewels = new HashSet<>();
        int count = 0;

        for (char c : J.toCharArray())
            jewels.add(c);


        for (char c : S.toCharArray())
            if (jewels.contains(c))
                count++;

        return count;
    }

    public int numJewelsInStones2(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {

            if (J.indexOf(S.charAt(i)) >= 0) {
                count++;
            }
        }
        return count;
    }
}
