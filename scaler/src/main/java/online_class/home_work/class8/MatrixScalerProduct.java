package online_class.home_work.class8;

import java.util.ArrayList;

public class MatrixScalerProduct {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        ArrayList<ArrayList<Integer>> scalerMatrix = new ArrayList<>();
        for (ArrayList<Integer> rows : A) {
            ArrayList<Integer> newRows = new ArrayList<>();
            for (int num : rows) {
                newRows.add(num * B);
            }
            scalerMatrix.add(newRows);
        }
        return scalerMatrix;
    }
}
