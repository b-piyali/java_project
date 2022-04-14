package online_class.assignments.class8;

import online_class.matrix.RotateMatrix;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class RotateMatrixTest {
    RotateMatrix matrix = new RotateMatrix();

    @Test
    public void solveTest1(){
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrixA.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrixA.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(1, 4, 7)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(2, 5, 8)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(3, 6, 9)));

        //assertEquals(matrix.solve(matrixA), resultMatrix);
    }

    @Test
    public void solveTest2(){
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2)));
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2)));
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(2, 2, 2)));

        //assertEquals(matrix.solve(matrixA), resultMatrix);
    }

}
