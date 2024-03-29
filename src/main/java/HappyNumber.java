import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while(n != 1){
            int sum = 0;
            
            while(n != 0){
                sum += (n % 10) * (n  %  10);
                n /= 10;
            }
            
            if(seen.contains(sum))
                return false;
            seen.add(sum);
            
            n = sum;
        }
        
        return true;
    }
    
        public boolean isHappy2(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1) {
            int sum = squareSum(n);

            if (set.contains(sum))
                return false;

            set.add(sum);
            n = sum;
        }

        return true;
    }

    private int squareSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10) * (number % 10);
            number /= 10;
        }
        return sum;
    }
}
