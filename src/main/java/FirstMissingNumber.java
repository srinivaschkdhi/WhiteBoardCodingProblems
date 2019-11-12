public class FirstMissingNumber {
    public static int findMissingNumber(int[] A) {

        int low = 0;

        int high = A.length - 1;

        if (A[high] == high + 1)
            return -1;

        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] == mid + 1) {
                low = mid + 1;
            } else {
                result = A[mid] - 1;
                high = mid - 1;

            }

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int missingNumber=findMissingNumber(arr);
        System.out.println("Missing number is : "+missingNumber);
    }

}
