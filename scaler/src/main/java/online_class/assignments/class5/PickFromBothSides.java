package online_class.assignments.class5;

import java.util.ArrayList;

public class PickFromBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        int maxSum = 0;
        for (int i = 0; i < B; ++i) {
            maxSum += A.get(i);
        }
        int left = B - 1;
        int right = A.size() - 1;
        int sum = maxSum;
        while (left >= 0) {
            sum = sum - A.get(left) + A.get(right);
            maxSum = Math.max(sum, maxSum);
            left--;
            right--;
        }
        return maxSum;
    }
}
