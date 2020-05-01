import java.util.HashMap;

public class IntegerToRoman {
    static int[] bases = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static HashMap<Integer, String> map = new HashMap<>();

    public static void setUp() {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static void main(String[] args) {
        int n = 23;
        setUp();
        String romanNum = intToRoman(n);
        System.out.println("romanNum = " + romanNum);
    }

    private static String intToRoman(int n) {
        String romanNum = "";

        for (int i : bases) {
            while (n >= i) {// if n is 20 . we take x twice . that's y loop twice . 
                romanNum += map.get(i);
                n -= i;
            }
        }
        return romanNum;
    }
}
