import java.util.HashSet;
import java.util.Set;

/**
 * @author Srinivas_Chintakindhi
 */

public class TwoProduct {
    public boolean checkIfProduct(int[] nums, int product) {
        Set<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (product % num == 0) {
                if (hashSet.contains(product / num))
                    return true;
                else
                    hashSet.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = new TwoProduct().checkIfProduct(new int[]{4, 2, 3, 10, 4, 15, 3, 6},15);
        System.out.println("b = " + b);
    }
}
