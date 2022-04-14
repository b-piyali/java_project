package problem88;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m - 1, j = n - 1, r = n + m - 1;
        //begin from end
        while (k >= 0 && j >= 0) {
            if (nums1[k] > nums2[j]) {//put it in last free pos from end
                nums1[r] = nums1[k];
                k--;
            } else {
                nums1[r] = nums2[j];
                j--;
            }
            r--;
        }
        while (r >= 0 && j >= 0) {
            nums1[r] = nums2[j];
            r--;
            j--;
        }
    }
}
