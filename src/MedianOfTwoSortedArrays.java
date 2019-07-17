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

}
