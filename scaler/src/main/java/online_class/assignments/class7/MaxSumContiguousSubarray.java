package online_class.assignments.class7;

import java.util.List;

public class MaxSumContiguousSubarray {
    public int maxSubArray(final List<Integer> A) {
        int maxSum = A.get(0);
        for (int i = 0; i < A.size(); ++i) {
            //max_sub(i)=max((max_sub(i-1)+A[i]),A[i])
            int sum = 0;
            for (int j = i; j < A.size(); ++j) {
                sum += A.get(j);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public int maxSubArray2(final List<Integer> A) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int integer : A) {
            max_ending_here = max_ending_here + integer;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
