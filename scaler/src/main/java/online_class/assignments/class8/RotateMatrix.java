package online_class.assignments.class8;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
    public void solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> newMatrix = transposeMatrix(A);
        int colLen = newMatrix.get(0).size();
        for (int k = 0; k < newMatrix.size(); ++k) {
            ArrayList<Integer> rows = newMatrix.get(k);
            reverseRows(colLen, rows);
            A.set(k, rows);
        }
    }

    private void reverseRows(int colLen, ArrayList<Integer> rows) {
        int i = 0;
        int j = colLen - 1;
        while (i < j) {
            int temp = rows.get(i);
            rows.set(i, rows.get(j));
            rows.set(j, temp);
            ++i;
            --j;
        }
    }

    private ArrayList<ArrayList<Integer>> transposeMatrix(ArrayList<ArrayList<Integer>> A) {
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

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrixA.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrixA.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        RotateMatrix matrix = new RotateMatrix();
        System.out.println(matrixA.toString());
        System.out.println("************");
        matrix.solve(matrixA);
        System.out.println(matrixA.toString());
        System.out.println("************");

    }

}
