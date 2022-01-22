package online_class.assignments.class8;

import java.util.ArrayList;

public class MatrixMultiplication {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> multiplyMatrix = new ArrayList<>();
        int aColLen = A.get(0).size();
        int bRowLen = B.size();
        int bColLen = B.get(0).size();
        if (aColLen == bRowLen) {
            for (ArrayList<Integer> integers : A) {
                ArrayList<Integer> rows = new ArrayList<>();
                for (int j = 0; j < bColLen; j++) {
                    int sum = 0;
                    for (int k = 0; k < bRowLen; k++) {
                        sum += integers.get(k) * B.get(k).get(j);
                    }
                    rows.add(sum);
                }
                multiplyMatrix.add(rows);
            }
        }
        return multiplyMatrix;
    }
}
