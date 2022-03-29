package online_class.matrix;

import java.util.ArrayList;

public class SubMatrixSumQueries {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A,
                                    ArrayList<Integer> B,
                                    ArrayList<Integer> C,
                                    ArrayList<Integer> D,
                                    ArrayList<Integer> E) {

        if (B.size() != C.size() || D.size() != E.size() || B.size() != D.size())
            return null;

        ArrayList<Integer> subMatrixSum = new ArrayList<>();
        getPrefixMatrix(A);

        for (int i = 0; i < B.size(); i++) {
            int topLeft = B.get(0);
            int topRight = C.get(0);
            int bottomLeft = D.get(0);
            int bottomRight = B.get(0);

            int pfSum = A.get(bottomLeft).get(bottomRight);
            if (topRight > 0)
                pfSum -= A.get(bottomLeft).get(topRight - 1);
            if (topLeft > 0)
                pfSum -= A.get(topLeft - 1).get(bottomRight);
            if (topRight > 0 && topLeft > 0)
                pfSum += A.get(topLeft - 1).get(topRight - 1);

            subMatrixSum.add(pfSum);
        }

        return subMatrixSum;
    }

    private void getPrefixMatrix(ArrayList<ArrayList<Integer>> A) {
        int rowLen = A.size();
        int colLen = A.get(0).size();
        // rowwise prefixsum
        for (int i = 0; i < rowLen; i++) {
            ArrayList<Integer> rows = A.get(i);
            int sum = 0;
            for (int j = 0; j < colLen; j++) {
                sum += rows.get(j);
                rows.set(j, sum);
            }
            A.set(i, rows);
        }
        // col wise prefixsum
        for (int i = 0; i < colLen; i++) {
            int sum = 0;
            for (int j = 0; j < rowLen; j++) {
                ArrayList<Integer> rows = A.get(j);
                sum += rows.get(i);
                rows.set(i, sum);
                A.set(j, rows);
            }
        }
    }
}
