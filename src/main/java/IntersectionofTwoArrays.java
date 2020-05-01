import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays  {
     public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstArrayElems = new HashSet<>();

        for (int i : nums1) {
            firstArrayElems.add(i);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int i : nums2) {
            if (firstArrayElems.contains(i))
                intersection.add(i);
        }

        int[] result = convertToArray(intersection);
        return result;
    }

    private int[] convertToArray(Set<Integer> intersection) {
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int i : intersection) {
            result[index] = i;
            index++;
        }
        return result;
    }
}
