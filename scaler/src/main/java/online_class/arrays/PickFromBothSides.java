package online_class.arrays;

import java.util.ArrayList;

public class PickFromBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        int left = B - 1;
        int right = A.size();
        if (B > right)
            return 0;
        int maxSum = 0;
        for (int i = 0; i <= left; i++) {
            maxSum += A.get(i);
        }
        if (B == right)
            return maxSum;

        int sum = maxSum;
        while (left >= 0) {
            right--;
            sum = sum + A.get(right) - A.get(left);
            maxSum = Math.max(sum, maxSum);
            left--;
        }
        return maxSum;
    }
}
