package online_class.assignments.class7;

import java.util.ArrayList;

public class SubarrayLeastAverage {
    public int solve(ArrayList<Integer> A, int B) {
        int leastAvgIndex = 0;
        int prevSum = 0;
        for (int i = 0; i < B; i++) {
            prevSum += A.get(i);
        }
        int sum = prevSum;
        for (int i = 1; i <= A.size() - B; i++) {
            sum = sum - A.get(i - 1) + A.get(i + B - 1);
            if (sum < prevSum) {
                leastAvgIndex = i;
                prevSum = sum;
            }
        }
        return leastAvgIndex;
    }
}
