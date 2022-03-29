package online_class.matrix;

import java.util.ArrayList;

public class SumOfAllSubmatrices {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        long ans = 0L;
        int rowLen = A.size();
        int colLen = A.get(0).size();
        for (int i = 0; i < rowLen; ++i) {
            for (int j = 0; j < colLen; ++j) {
                ans += (long) A.get(i).get(j) * (i + 1) * (j + 1) * (rowLen - i) * (colLen - j);
            }
        }
        return (int) ans;
    }
}
