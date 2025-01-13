public class MedianOfTwoSortedArrays {
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int j = 0;
        double num = 0.00000;

        for (int k = 0; k < nums1.length; k++) {
            nums3[k] = nums1[k];
        }
        for (int i = nums1.length; i < nums1.length + nums2.length; i++) {
            nums3[i] = nums2[j];
            j++;
        }

        for (int l=0; l < nums3.length; l++) {
            if (nums3[i+1] < nums3[i])
        }

        return nums3;
    }
}