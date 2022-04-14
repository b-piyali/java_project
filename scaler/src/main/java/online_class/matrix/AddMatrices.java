package online_class.matrix;

import java.util.ArrayList;

public class AddMatrices {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> newMatrix = new ArrayList<>();
        int width = Math.max(A.get(0).size(), B.get(0).size());

        for (int i = 0; i < A.size(); ++i) {
            ArrayList<Integer> rows = new ArrayList<>();
            for (int j = 0; j < width; ++j) {
                int sum = A.get(i).get(j) + B.get(i).get(j);
                rows.add(sum);
            }
            newMatrix.add(rows);
        }
        return newMatrix;
    }
}
