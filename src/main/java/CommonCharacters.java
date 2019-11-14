import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonCharacters {
    public List<String> commonChars(String[] A) {
        List<String> commonChars = new ArrayList<>();

        int[] minFreqChars = new int[26];
        Arrays.fill(minFreqChars, Integer.MAX_VALUE);

        for (String s : A) {
            int[] charFreq = new int[26];

            for (char c : s.toCharArray()) {
                charFreq[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFreqChars[i] = Math.min(minFreqChars[i], charFreq[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (minFreqChars[i] > 0) {
                commonChars.add("" + (char)(i + 'a'));
                minFreqChars[i]--;
            }
        }

        return commonChars;
    }
}
