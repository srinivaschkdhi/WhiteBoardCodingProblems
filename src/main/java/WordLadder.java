import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = listToSet(wordList);
        if (!set.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;
        int numNodesInCurrLvl = queue.size();

        while (!queue.isEmpty()) {
            String word = queue.poll();

            char[] charArray = word.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char origianl_char = charArray[i];

                for (char c = 'a'; c <= 'z'; c++) {
                    if (charArray[i] == c)
                        continue;

                    charArray[i] = c;
                    String newWord = String.valueOf(charArray);
                    if (newWord.equals(endWord)) return level + 1;

                    if (set.contains(newWord)) {
                        queue.add(newWord);
                        set.remove(newWord);
                    }
                }

                charArray[i] = origianl_char;
            }

            numNodesInCurrLvl--;
            if (numNodesInCurrLvl == 0) {
                level += 1;
                numNodesInCurrLvl = queue.size();
            }
        }

        return 0;
    }

    private Set<String> listToSet(List<String> wordList) {
        Set<String> set = new HashSet<>();
        for (String word : wordList) {
            set.add(word);
        }
        return set;
    }
}
