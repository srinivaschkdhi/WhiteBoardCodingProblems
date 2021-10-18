import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {

        if (A.length() != B.length()) {
            return false;
        }

        if (A.equals(B)) {
            Set<Character> uniqChars = new HashSet<>();
            for (char c : A.toCharArray()) {
                uniqChars.add(c);
            }

            if (uniqChars.size() < A.length()) {//there should be atleast one duplicate character
                return true;
            } else {
                return false;
            }
        }

        List<Integer> diffCharIndexes = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diffCharIndexes.add(i);
            }
        }
        if (diffCharIndexes.size() == 2 && A.charAt(diffCharIndexes.get(0)) == B.charAt(diffCharIndexes.get(1)) &&
                B.charAt(diffCharIndexes.get(0)) == A.charAt(diffCharIndexes.get(1))) {
            return true;

        } else {
            return false;
        }

    }
}
