import java.util.HashMap;

public class RomanToInteger {
    static HashMap<Character,Integer> map = new HashMap<>();

    public static void setUp() {
        map.put('M',1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
    }

    public static void main(String[] args) {
        String romanNum = "CDLXVIII";
        setUp();
        int integer = romanToInt(romanNum);
        System.out.println("integer = " + integer);
    }

    private static int romanToInt(String s) {
        int nums[] = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            nums[i] = map.get(s.charAt(i));
        }
        int sum = 0;
        for(int i = 0;i<nums.length -1 ;i++){
            if(nums[i]<nums[i+1])
                sum-=nums[i];
            else
                sum+=nums[i];
        }
        sum+=nums[nums.length-1];
        return sum;
    }
}
