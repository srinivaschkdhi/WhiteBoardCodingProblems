import java.util.HashMap;
import java.util.Map;

public class RanSomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> counts = new HashMap<>();
        
        for(char c : magazine.toCharArray()){
            counts.put(c,counts.getOrDefault(c,0)+1);
        }
        
        for(char c : ransomNote.toCharArray()){
            if(!counts.containsKey(c) || counts.get(c) <=0)
                return false;
            
            counts.put(c,counts.get(c)-1);
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
            int[] char_counts = new int[26];

            for(char c : magazine.toCharArray()){
                char_counts[c - 'a']++;
            }

            for(char c : ransomNote.toCharArray())
                char_counts[c - 'a']--;

            for(int i : char_counts)
                if(i < 0)
                    return false;


            return true;
        }
}
