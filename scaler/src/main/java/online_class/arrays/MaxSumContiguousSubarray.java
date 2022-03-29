package online_class.arrays;

import java.util.List;

public class MaxSumContiguousSubarray {
    public int maxSubArray(final List<Integer> A) {
        int maxSum = Math.max(Integer.MIN_VALUE, A.get(0));
        int sum = 0;
        for (int num : A) {
            sum += num;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
