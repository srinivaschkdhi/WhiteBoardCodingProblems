public class MaxSubArrLenProductPositive {

    static int maxLenSub(int arr[], int N) {
        // Stores the length of current
        // subarray with positive product
        int Pos = 0;

        // Stores the length of current
        // subarray with negative product
        int Neg = 0;

        // Stores the length of the longest
        // subarray with positive product
        int res = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                // Reset the value
                Pos = Neg = 0;
            }

            // If current element is positive
            else if (arr[i] > 0) {
                // Increment the length of
                // sub array with positive product
                Pos += 1;

                // If at least one element is
                // present in the sub array with
                // negative product
                if (Neg != 0) {
                    Neg += 1;
                }

                // Update res
                res = Math.max(res, Pos);
            }

            // If current element is negative
            else {
                Pos = Pos + Neg;
                Neg = Pos - Neg;
                Pos = Pos - Neg;

                // Increment the length of sub array
                // with negative product
                Neg += 1;

                // If at least one element is present
                // in the sub array with positive product
                if (Pos != 0) {
                    Pos += 1;
                }

                // Update res
                res = Math.max(res, Pos);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {-1, -2, -3, 0, 1};
        int N = arr.length;
        System.out.print(maxLenSub(arr, N));
    }
}
