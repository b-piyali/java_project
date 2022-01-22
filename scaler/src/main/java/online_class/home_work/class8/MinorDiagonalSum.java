package online_class.home_work.class8;

import java.util.ArrayList;
import java.util.List;

public class MinorDiagonalSum {
    public int solve(final List<ArrayList<Integer>> A) {
        int sum = 0;
        int len = A.size();
        for (int i = 0; i < len; ++i) {
            sum += A.get(i).get(len - 1 - i);
        }
        return sum;
    }
}
