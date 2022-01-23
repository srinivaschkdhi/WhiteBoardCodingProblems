import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        
        
        for(int i = 0;i <s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,-1);
            }else{
                map.put(c,i);
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        for(char c : map.keySet()){
            if(map.get(c) != -1 && map.get(c) < min)
                min = map.get(c);
        }
        return (min == Integer.MAX_VALUE)?-1:min;
    }
}
