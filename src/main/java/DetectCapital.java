public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int countOfCaps = 0;
        
        for(char c : word.toCharArray()){
            if(Character.isUpperCase(c))
                countOfCaps++;
        }
        
        
        return countOfCaps == word.length() || countOfCaps == 0 || (countOfCaps == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
