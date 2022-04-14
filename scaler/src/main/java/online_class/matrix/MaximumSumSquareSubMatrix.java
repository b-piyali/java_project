package online_class.matrix;

import java.util.ArrayList;

/**
 * Problem Description
 * Given a 2D integer matrix A of size N x N,
 * find a B x B submatrix where B<= N and B>= 1,
 * such that the sum of all the elements in the submatrix is maximum.
 */

public class MaximumSumSquareSubMatrix {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int maxSum = A.get(0).get(0);
        int rowLen = A.size();
        int colLen = A.get(0).size();

        getPrefixSumMatrixRows(A);
        getPrefixSumMatrixCols(A);

        for (int i = 0; i < rowLen - B; ++i) {
            int a2 = i + B - 1;
            for (int j = 0; j < colLen - B; ++j) {
                int b2 = j + B - 1;
                int pfSum = A.get(a2).get(b2);
                if (j > 0)
                    pfSum = pfSum - A.get(a2).get(j - 1);
                if (i > 0)
                    pfSum = pfSum - A.get(i - 1).get(b2);
                if (i > 0 && j > 0)
                    pfSum = pfSum + A.get(i - 1).get(j - 1);

                maxSum = Math.max(pfSum, maxSum);
            }
        }
        return maxSum;
    }

    private void getPrefixSumMatrixRows(ArrayList<ArrayList<Integer>> A) {
        int rowLen = A.size();
        int colLen = A.get(0).size();
        for (int i = 0; i < rowLen; i++) {
            ArrayList<Integer> rows = A.get(i);
            for (int j = 1; j < colLen; ++j) {
                int sum = rows.get(j - 1) + rows.get(j);
                rows.set(j, sum);
            }
            A.set(i, rows);
        }
    }

    private void getPrefixSumMatrixCols(ArrayList<ArrayList<Integer>> A) {
        int rowLen = A.size();
        int colLen = A.get(0).size();
        for (int i = 1; i < rowLen; i++) {
            ArrayList<Integer> rows = A.get(i);
            for (int j = 0; j < colLen; ++j) {
                int sum = A.get(i - 1).get(j) + rows.get(j);
                rows.set(j, sum);
            }
            A.set(i, rows);
        }
    }
}
