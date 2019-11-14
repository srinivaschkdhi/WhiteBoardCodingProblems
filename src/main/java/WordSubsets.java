import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> result = new ArrayList<>();

        int[] max_b_frequencies = new int[26];

        for (String curr_word : B) {
            int[] char_frequencies = new int[26];
            char_frequencies = get_char_frequencies(curr_word);

            for (int i = 0; i < 26; i++) {
                max_b_frequencies[i] = Math.max(max_b_frequencies[i], char_frequencies[i]);
            }
        }

        for (String curr_word : A) {
            int[] char_frequencies = new int[26];
            char_frequencies = get_char_frequencies(curr_word);

            boolean valid = true;

            for (int i = 0; i < 26; i++) {
                if (max_b_frequencies[i] > char_frequencies[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(curr_word);
            }
        }

        return result;
    }

    public int[] get_char_frequencies(String s) {
        int[] result = new int[26];
        for (char c : s.toCharArray()) {
            result[c - 'a']++;
        }
        return result;
    }
}
