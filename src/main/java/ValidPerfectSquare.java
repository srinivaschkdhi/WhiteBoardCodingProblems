import java.util.HashSet;
import java.util.Set;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        Set<Integer> factors = new HashSet<>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                factors.add(i);
                factors.add(num / i);
            }
        }

        if (factors.size() % 2 == 1)
            return true;

        return false;
    }

    public boolean isPerfectSquare2(int num) {
        int low = 1;
        int high = (int) Math.sqrt(num);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int square = mid * mid;

            if (square == num)
                return true;
            else if (square < num)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

}
