package _30_day_challenge.week1.day3;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * <p>
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * <p>
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
 * which is more subtle.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        /*int size = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int left = 0; left < size; left++) {
            int currentSum = 0;
            for (int right = left; right < size; right++) {
                currentSum += nums[right];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;*/

        int maxSoFar = 0;
        int overAllMax = Integer.MIN_VALUE;
        for (int num : nums) {
            maxSoFar = Math.max((maxSoFar + num), num);
            overAllMax = Math.max(overAllMax, maxSoFar);
        }
        return overAllMax;
    }
}
