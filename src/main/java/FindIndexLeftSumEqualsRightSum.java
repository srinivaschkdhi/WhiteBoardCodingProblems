public class FindIndexLeftSumEqualsRightSum {
    public static int isSherlock(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        int rightSum = sum - arr[0];
        int leftSum = 0;

        for (int i = 0; i < n - 1; i++) {
            if (leftSum == rightSum)
                return i;

            leftSum += arr[i];
            rightSum -= arr[i + 1];
        }

        if (leftSum == rightSum)
            return n - 1;

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,6,3,6};
        int ans = isSherlock(arr);
        System.out.println(ans);
    }
}
