public class SingleNumber {
    public static int singleNumber(int[] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1,2,1,2,3,3,4};
        int numOccOne = singleNumber(A);
        System.out.println("numOccOne = " + numOccOne);
    }
}
