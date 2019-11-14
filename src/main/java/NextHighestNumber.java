
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class NextHighestNumber {

    public static void nextHighest(int num) {

        List<Integer> revDtsList = getRevDigitsList(num);

        int swapIndex = leftToRightDistAsc(revDtsList);

        int nextSmallGt = nextSmlGtRtToLt(revDtsList, swapIndex);

        swap(revDtsList, swapIndex, nextSmallGt);

        for (int i = revDtsList.size() - 1; i >= swapIndex; i--) {
            System.out.print(revDtsList.get(i));
        }

        //sort 0 to swapindex -1 left to right
        List<Integer> subList = revDtsList.subList(0, swapIndex);
        Collections.sort(subList);
        subList.forEach(System.out::print);

    }

    private static void swap(List<Integer> revDtsList, int swapIndex, int nextSmallGt) {
        int temp = revDtsList.get(swapIndex);
        revDtsList.set(swapIndex, revDtsList.get(nextSmallGt));
        revDtsList.set(nextSmallGt, temp);
    }

    private static int nextSmlGtRtToLt(List<Integer> revDtsList, int swapIndex) {
        int nextSmallGt = swapIndex - 1;

        for (int i = swapIndex - 2; i >= 0; i--) {
            if (revDtsList.get(i) > revDtsList.get(swapIndex) && revDtsList.get(i) < revDtsList.get(nextSmallGt)) {
                nextSmallGt = i;
            }
        }
        return nextSmallGt;
    }

    private static int leftToRightDistAsc(List<Integer> revDtsList) {
        int swapIndex = 0;
        for (int i = 0; i < revDtsList.size() - 1; i++) {
            if (revDtsList.get(i) > revDtsList.get(i + 1)) {
                swapIndex = i + 1;
                break;
            }
        }
        return swapIndex;
    }

    private static List<Integer> getRevDigitsList(int num) {
        List<Integer> revDtsList = new ArrayList<>();

        while (num != 0) {
            revDtsList.add(num % 10);
            num /= 10;
        }
        return revDtsList;
    }


    public static void main(String[] args) {
        nextHighest(1423);
    }
}
