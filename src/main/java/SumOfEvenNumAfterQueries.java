public class SumOfEvenNumAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] results = new int[A.length];
        int counter = 0;

        while (counter < results.length) {
            int currSum = 0;
            int val = queries[counter][0];
            int index = queries[counter][1];

            A[index] += val;

            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 == 0) {
                    currSum += A[i];
                }
            }

            results[counter] = currSum;
            counter++;
        }

        return results;
    }

    public int[] sumEvenAfterQueries2(int[] A, int[][] queries) {
        int sum = 0;
        for (int x : A) {
            if (x % 2 == 0) {
                sum += x;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];

            if (A[index] % 2 == 0) {
                sum -= A[index];//if it was even number remove that value from sum.if odd we ignore since we
                //are not adding odd num to sum
            }

            A[index] += val;

            if (A[index] % 2 == 0) {
                sum += A[index];//if updated value is even add that value to sum
            }

            ans[i] = sum;
        }

        return ans;

    }
}
