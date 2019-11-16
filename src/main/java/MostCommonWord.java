import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWords = new HashSet<>();
        HashMap<String, Integer> validWords = new HashMap<>();

        for (String bannedWord : banned) {
            bannedWords.add(bannedWord);
        }

        String[] words = paragraph.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!bannedWords.contains(word)) {
                validWords.put(word, validWords.getOrDefault(word, 0) + 1);
            }
        }

        int max = 0;
        String result = "";

        for (String validWord : validWords.keySet()) {
            if (validWords.get(validWord) > max) {
                max = validWords.get(validWord);
                result = validWord;
            }
        }

        return result;
    }
}
