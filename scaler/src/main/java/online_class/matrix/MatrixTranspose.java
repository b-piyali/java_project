package online_class.matrix;

import java.util.ArrayList;

public class MatrixTranspose {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> newMatrix = new ArrayList<>();
        int colLen = A.get(0).size();
        for (int i = 0; i < colLen; ++i) {
            ArrayList<Integer> rows = new ArrayList<>();
            for (ArrayList<Integer> integers : A) {
                rows.add(integers.get(i));
            }
            newMatrix.add(rows);
        }
        return newMatrix;
    }

}
