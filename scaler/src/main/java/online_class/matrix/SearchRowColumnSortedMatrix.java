package online_class.matrix;

import java.util.ArrayList;

public class SearchRowColumnSortedMatrix {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int rowLen = A.size();
        int colLen = A.get(0).size();
        int i = 0;
        int j = colLen - 1;
        int minVal = Integer.MAX_VALUE;
        int minRow = rowLen;
        int minCol = colLen;
        while (i < rowLen && j >= 0) {
            if (A.get(i).get(j) < B) {
                i++;
            } else if (A.get(i).get(j) > B) {
                j--;
            } else {
                minVal = Math.min(minVal, (((i + 1) * 1009) + (j + 1)));
                j--;
            }
        }
        return minVal == Integer.MAX_VALUE ? -1 : minVal;
    }
}
