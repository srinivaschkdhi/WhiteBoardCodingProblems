import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
    public String toGoatLatin(String S) {
        Set<Character> vowels = getVowels();

        String result = "";
        int wordPosInSen = 1;

        for(String word : S.split(" ")){

            if(wordPosInSen > 1)
                result = result + " "; // from 2 word onwards adding space to left of the word.

            char firstLetter = word.charAt(0);

            if(vowels.contains(firstLetter)){
                result += word + "ma";
            }else{
                result += word.substring(1) + firstLetter + "ma";
            }

            for(int j = 0; j < wordPosInSen ; j++){//add no of a's based on wordpos.
                result += "a";
            }

            wordPosInSen++;
        }
        return result;
    }

    private HashSet<Character> getVowels() {
        HashSet<Character> vowels = new HashSet<>();

        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }
        return vowels;
    }
}
