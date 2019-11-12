public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merArr = buildMerSortedArray(nums1, nums2);

        int merArrLen = merArr.length;
        int lastIndex = merArrLen - 1;

        if (ifEvenLenArr(merArrLen)) {
            return (merArr[lastIndex / 2] + merArr[(lastIndex + 1) / 2]) / 2.0;
        } else {
            return merArr[lastIndex / 2];
        }
    }

    private boolean ifEvenLenArr(int merArrLen) {
        return merArrLen % 2 == 0;
    }

    private int[] buildMerSortedArray(int[] nums1, int[] nums2) {
        int merArrLen = nums1.length + nums2.length;
        int[] merArr = new int[merArrLen];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merArr[k] = nums1[i];
                i++;
            } else {
                merArr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            merArr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            merArr[k] = nums2[j];
            j++;
            k++;
        }
        return merArr;
    }

    public double findMedianSortedArraysEff(int[] input1, int[] input2) {

        //if input1 is greater than input2 switch them so input1 is smaller
        if (input1.length > input2.length) findMedianSortedArrays(input2, input1);

        int x = input1.length;
        int y = input2.length;

        int low = 0;
        int high = x;

        while (low <= high) {

            int partitionX = (low + high)/2;
            int partitionY = (x + y + 1)/2 - partitionX;

            //if partitionX == 0 it means no elemetns left on left side Use -INF for maxLeft
            //if partitionX == y it means no elements left on right side USe +inf for maxright

            int maxLeftX = partitionX == 0 ? Integer.MIN_VALUE : input1[partitionX-1];
            int minRightX = partitionX == x ? Integer.MAX_VALUE : input2[partitionX];


            int maxLeftY = partitionY == 0 ? Integer.MIN_VALUE : input2[partitionY -1];
            int minRightY = partitionY == y ? Integer.MAX_VALUE : input2[partitionY];


            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                //We have partioned the array at correct place
                if(x + y % 2 ==0 ){
                    return (double)(Math.max(maxLeftX, maxLeftY) + Math.max(minRightX, minRightY)) / 2;
                }else{
                    return Math.max(maxLeftX,maxLeftY);
                }

            }else if(maxLeftX > minRightY){
                high = partitionX - 1;
            }else{
                low = partitionX + 1;
            }

            throw new IllegalArgumentException();
        }


        return 0;
    }

}
