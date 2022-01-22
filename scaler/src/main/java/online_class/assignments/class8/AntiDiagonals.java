package online_class.assignments.class8;

import java.util.ArrayList;

public class AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> newMatrix = new ArrayList<>();
        int width = A.get(0).size();
        for (int k = 0; k < width; ++k) {
            int i = 0, j = k;
            ArrayList<Integer> rows = new ArrayList<>();
            while (i < A.size() && j >= 0) {
                rows.add(A.get(i).get(j));
                ++i;
                --j;
            }
            if (rows.size() < width) {
                for (j = rows.size(); j < width; j++)
                    rows.add(0);
            }
            newMatrix.add(rows);
        }
        for (int k = 1; k < A.size(); ++k) {
            int i = k, j = width - 1;
            ArrayList<Integer> rows = new ArrayList<>();
            while (i < A.size() && j >= 0) {
                rows.add(A.get(i).get(j));
                ++i;
                --j;
            }
            if (rows.size() < width) {
                for (j = rows.size(); j < width; j++)
                    rows.add(0);
            }
            newMatrix.add(rows);
        }
        return newMatrix;
    }
}
