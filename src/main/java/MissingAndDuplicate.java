import java.util.ArrayList;
import java.util.List;

/**
 * @author Srinivas_Chintakindhi
 */

public class MissingAndDuplicate {
    public static List<List<Integer>> findAllMissingAndDuplicateValues(int[] arr) {
        if (arr.length == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> missingValues = new ArrayList<>();
        List<Integer> duplicateValues = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) { // if element not at present at its supposed index.
                int supposedIndex = arr[i] - 1;
                swap(arr, i, supposedIndex); //  shift to that index. not increment i and check again with new element.
            } else                           // since elements are swapped.
                i++;
        }



        for (int j = 0; j < arr.length; j++) {
            if (j + 1 != arr[j]) {
                missingValues.add(j + 1);
                duplicateValues.add(arr[j]);
            }
        }


        result.add(missingValues);
        result.add(duplicateValues);

        return result;
    }


    public static void swap(int[] A, int i, int j) {
        int x = A[i];
        A[i] = A[j];
        A[j] = x;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 4, 3, 2};
        System.out.println(new MissingAndDuplicate().findAllMissingAndDuplicateValues(arr));
    }
}
/*
First loop focus on actual element. checks whether element is at supposed index.
Second loop focus on index. if index has right elelment. i.e 0 index should have 1 value , 1 index should have 2 value.
 */