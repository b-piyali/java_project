package online_class.arrays;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> maxset = new ArrayList<>();
        int maxSum = A.get(0);
        int sum = A.get(0);
        int currentStart = 0;
        int currentEnd = 0;
        int preStart = currentStart;
        int preEnd = currentEnd;
        int preMaxSum = maxSum;
        int i = 1;
        while (i < A.size()) {
            if (A.get(i) < 0) {
                if (maxSum <= sum) {
                    preEnd = currentEnd;
                    preStart = currentStart;
                    maxSum = sum;
                    preMaxSum = maxSum;
                }
                i++;
                if (i != A.size()) {
                    currentEnd = i;
                    currentStart = i;
                }
                sum = 0;
            } else {
                currentEnd = i;
                sum += A.get(i);
                maxSum = Math.max(sum, maxSum);
                i++;
            }
        }
        if (preMaxSum < maxSum) {
            preEnd = currentEnd;
            preStart = currentStart;
        }
        if(maxSum >= 0) {
            for (int j = preStart; j <= preEnd; j++) {
                maxset.add(A.get(j));
            }
        }
        return maxset;
    }
}
