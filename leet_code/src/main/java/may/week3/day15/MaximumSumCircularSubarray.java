package may.week3.day15;

import java.util.Arrays;

public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            A[i] = -A[i];
        }
        int max_kadane = maxSubArray(A);
        for (int i = 0; i < n; i++) {
            A[i] = -A[i];
        }

        return Integer.max(maxSubArray(A), Arrays.stream(A).sum() + max_kadane);
    }

    private int maxSubArray(int[] nums) {
        int maxSoFar = 0;
        int overAllMax = Integer.MIN_VALUE;
        for (int num : nums) {
            maxSoFar = Math.max((maxSoFar + num), num);
            overAllMax = Math.max(overAllMax, maxSoFar);
        }
        return overAllMax;
    }

}
