public class SortCharactersByFreq {
    public String frequencySort(String s) {
       Map<Character, Integer> map = getCharacterIntegerMap(s);

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) ->map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        String result = "";

        while(!maxHeap.isEmpty()){
            char c = maxHeap.remove();
            for(int i = 0; i < map.get(c);i++)
                result = result + c;
        }

        return result;    
    }
    
        private Map<Character, Integer> getCharacterIntegerMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
