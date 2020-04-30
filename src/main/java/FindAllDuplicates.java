import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Srinivas_Chintakindhi
 */

public class FindAllDuplicates {
    public List<Integer> findAllDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int x : nums){
            int index = Math.abs(x) - 1;

            if(nums[index] < 0){
                set.add(Math.abs(x));
            }else{
                nums[index] = -nums[index];
            }

        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> allDuplicates = new FindAllDuplicates().findAllDuplicates(new int[]{4, 2, 2, 1, 2, 4, 1});
        allDuplicates.forEach(System.out::println);
    }
}
