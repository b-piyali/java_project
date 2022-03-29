package online_class.arrays;

import java.util.ArrayList;

public class MinimumSwaps2 {
    public int solve(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); ++i) {
            if (A.get(i) != i) {
                while (A.get(i) != i) {
                    count++;
                    int val = A.get(i);
                    A.set(i, A.get(val));
                    A.set(val, val);
                }
            }
        }
        return count;
    }
}
