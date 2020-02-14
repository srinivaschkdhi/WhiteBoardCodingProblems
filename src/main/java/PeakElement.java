/**
 * @author Srinivas_Chintakindhi
 */

public class PeakElement {
    public static Integer getPeakElement(int[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        int n = array.length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if ((mid == 0 || array[mid] >= array[mid - 1]) && (mid == n - 1 || array[mid] >= array[mid + 1])) {
                return array[mid]; // array[mid] is peak element
            } else if (mid > 0 && array[mid - 1] > array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}