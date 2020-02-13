import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            int curr = n;
            int sum = 0;

            while (curr != 0) {
                sum += (curr % 10) * (curr % 10);
                curr /= 10;
            }

            if (seen.contains(sum))
                return false;

            seen.add(sum);
            n = sum;
        }
        return true;
    }
}
