import java.util.*;

/**
 * @author Srinivas_Chintakindhi
 */

public class GroupAnagrams {
    public List<List<String>>   groupAnagram(String[] strs){
        List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();


        for (String cuur : strs) {
            char[] chars = cuur.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }

            map.get(sorted).add(cuur);
        }

        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }


    public List<List<String>> groupAnagram2(String[] strs){
        Map<Integer, List<String>> map = new HashMap<>();

        for (String curr : strs) {
            int[] char_counts = getCharCount(curr);

            int hashKey = Arrays.toString(char_counts).hashCode();

            if (!map.containsKey(hashKey))
                map.put(hashKey, new ArrayList<>());

            map.get(hashKey).add(curr);
        }

        return new ArrayList<>(map.values());
    }



    private int[] getCharCount(String string){
        int[] char_counts = new int[26];
        for (char c : string.toCharArray()) {
            char_counts[c - 'a']++;
        }
        return char_counts;
    }

    public static void main(String[] args) {
        List<List<String>> listList = new GroupAnagrams().groupAnagram2(new String[]{"bat", "abt", "sri", "tab", "irs", "son", "nos"});
        System.out.println("listList = " + listList);
    }
}
