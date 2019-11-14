
public class ReverseNumber {
    public static int reverseDigits(int x) {
        boolean negFlg = false;

        if (x < 0) {
            negFlg = true;
            x = -x;
        }

        int prevNum = 0, revNum = 0;

        while (x != 0) {

            int rDigit = x % 10;
            revNum = revNum * 10 + rDigit;

            if ((revNum - rDigit) / 10 != prevNum) {
                System.out.println("WARNING OVERLOADED");
                return 0;
            }

            prevNum = revNum;
            x /= 10;
        }

        return (negFlg == true) ? -revNum : revNum;
    }
}
