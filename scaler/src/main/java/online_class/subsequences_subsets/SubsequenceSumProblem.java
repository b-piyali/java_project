package online_class.subsequences_subsets;

import java.util.ArrayList;

public class SubsequenceSumProblem {
    public int solve(ArrayList<Integer> A, int B) {
        for (int i = 0; i < (1 << A.size()); ++i) {
            int sum = 0;
            for (int j = 0; j < A.size(); ++j) {
                if (checkBit(i, j)) {
                    sum += A.get(j);
                }
            }
            if (sum == B) {
                return 1;
            }
        }
        return 0;
    }

    private boolean checkBit(int i, int j) {
        return ((i >> j) & 1) == 1;
    }
}
