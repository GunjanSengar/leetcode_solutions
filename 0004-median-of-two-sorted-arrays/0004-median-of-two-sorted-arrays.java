class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] merge = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                merge[k++] = nums1[i++];
            } else {
                merge[k++] = nums2[j++];
            }
        }

        while (i < n) {
            merge[k++] = nums1[i++];
        }

        while (j < m) {
            merge[k++] = nums2[j++];
        }

        int size = merge.length;

        if (size % 2 == 1) {
            return merge[size / 2];
        }

        return (merge[size / 2] + merge[size / 2 - 1]) / 2.0;
    }
}