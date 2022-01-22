package online_class.assignments.class7;

import java.util.ArrayList;

public class MaximumSubarrayEasy {
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int maxSum = 0;
        for (int i = 0; i < A; ++i) {
            int sum = 0;
            for (int j = i; j < A; ++j) {
                sum += C.get(j);
                if (sum <= B && sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }
}
