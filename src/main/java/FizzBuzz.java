import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        int fizz = 0;
        int buzz = 0;

        for (int i = 1; i <= n; i++) {
            fizz++;
            buzz++;

            if (fizz == 3 && buzz == 5) {
                fizz = 0;
                buzz = 0;
                result.add("FizzBuzz");
            } else if (fizz == 3) {
                fizz = 0;
                result.add(("Fizz"));
            } else if (buzz == 5) {
                buzz = 0;
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
