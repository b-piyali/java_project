package online_class.matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSumSubmatrix {
    public long solve(ArrayList<ArrayList<Integer>> A) {
        long maxSum = A.get(0).get(0);
        int rowLen = A.size();
        int colLen = A.get(0).size();
        for (int start = 0; start < rowLen; ++start) {
            ArrayList<Long> newArray = new ArrayList<>(Collections.nCopies(colLen, 0L));
            for (int end = start; end < rowLen; ++end) {
                for (int i = 0; i < colLen; ++i) {
                    long sum = newArray.get(i) + A.get(end).get(i);
                    newArray.set(i, sum);
                }
                long val = maxSubArray(newArray);
                maxSum = Math.max(maxSum, val);
            }
        }
        return maxSum;
    }

    private long maxSubArray(final List<Long> A) {
        long maxSum = A.get(0);
        long sum = 0;
        for (long num : A) {
            sum += num;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
