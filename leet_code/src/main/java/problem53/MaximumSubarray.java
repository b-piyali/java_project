package problem53;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = Math.max(Integer.MIN_VALUE, nums[0]);
        int sum = 0;
        for (int num : nums) {
            sum += num;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
