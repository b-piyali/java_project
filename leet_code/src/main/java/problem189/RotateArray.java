package problem189;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        if (len == 1 || k == 0) return;

        nums = reverseNum(nums, 0, len - 1);
        nums = reverseNum(nums, 0, k - 1);
        nums = reverseNum(nums, k, len - 1);
    }

    private int[] reverseNum(int[] nums, int from, int to) {
        while (from < to) {
            int temp = nums[from];
            nums[from] = nums[to];
            nums[to] = temp;
            from++;
            to--;
        }
        return nums;
    }
}
