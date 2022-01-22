package online_class.assignments.class8;

import java.util.ArrayList;
import java.util.Collections;

public class SpiralOrderMatrixII {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < A; i++) { // initializing matrix with 0 value
            ArrayList<Integer> temp = new ArrayList<>(Collections.nCopies(A, 0));
            ans.add(temp);
        }

        int i = 0, j = 0, count = 1;
        while (A > 1) {
            for (int k = 1; k < A; ++k) { // right
                ans.get(i).set(j, count);
                ++j;
                ++count;
            }
            for (int k = 1; k < A; ++k) { // down
                ans.get(i).set(j, count);
                ++i;
                ++count;
            }
            for (int k = 1; k < A; ++k) { // left
                ans.get(i).set(j, count);
                --j;
                ++count;
            }
            for (int k = 1; k < A; ++k) { // up
                ans.get(i).set(j, count);
                --i;
                ++count;
            }
            A = A - 2;
            ++i;
            ++j;
        }
        if (A == 1) {
            ans.get(i).set(j, count);
        }
        return ans;
    }
}
