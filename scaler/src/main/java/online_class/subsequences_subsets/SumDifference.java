package online_class.subsequences_subsets;

import java.util.ArrayList;
import java.util.Collections;

public class SumDifference {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        long maxSum = 0;
        for (int i = 0; i < A.size(); ++i) {
            maxSum += A.get(i) * (1 << i);
        }
        A.sort(Collections.reverseOrder());
        long minSum = 0;
        for (int i = 0; i < A.size(); ++i) {
            minSum += A.get(i) * (1 << i);
        }
        return (int) (maxSum - minSum);
    }
}
