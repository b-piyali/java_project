package online_class.home_work.class8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RowToColumnZero {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> zeroMatrix = new ArrayList<>();
        Set<Integer> iIdx = new HashSet<>();
        Set<Integer> jIdx = new HashSet<>();
        int colLen = A.get(0).size();
        for (int i = 0; i < A.size(); ++i) {
            for (int j = 0; j < colLen; ++j) {
                if (A.get(i).get(j) == 0) {
                    iIdx.add(i);
                    jIdx.add(j);
                }
            }
        }

        for (int i = 0; i < A.size(); ++i) {
            ArrayList<Integer> rows = new ArrayList<>();
            for (int j = 0; j < colLen; ++j) {
                if (iIdx.contains(i) || jIdx.contains(j)) {
                    rows.add(0);
                } else {
                    rows.add(A.get(i).get(j));
                }
            }
            zeroMatrix.add(rows);
        }
        return zeroMatrix;
    }
}
