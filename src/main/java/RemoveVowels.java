
public class RemoveVowels {
    public String removeVowels(String S){
        return S.replaceAll("[aeiou]","");
    }
    
    public String removeVowels2(String S){
        Set<Character> vowels = new HashSet<Character>(){{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
        }};
        
        StringBuilder result = new StringBuilder();
        for(char c:S.toCharArray()){
            if(!vowels.contains(c)){
                result.append(c);
            }
        }
        
       return result;
      
    }
}
