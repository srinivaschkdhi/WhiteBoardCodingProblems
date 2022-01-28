import java.util.Arrays;

public class ThreeSumLess {
    public int countTripletsLessThanSum(int[] arr, int sum) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] <= sum)
                        count += 1;

                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        return count;
    }

    public int countTripletsLessThanSum2(int[] arr, int sum) {
        int n = arr.length;
        int count = 0;

        Arrays.sort(arr);

        for (int k = 0; k < n - 2; k++) {
            for (int i = k + 1, j = n - 1; i < j; ) {
                if (arr[k] + arr[i] + arr[j] <= sum) {
                    count += j - i;
                    i += 1;
                }else{
                    j--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int ans = new ThreeSumLess().countTripletsLessThanSum2(new int[]{1, 2, 3, 4, 6}, 8);
        System.out.println("ans = " + ans);
    }
}
