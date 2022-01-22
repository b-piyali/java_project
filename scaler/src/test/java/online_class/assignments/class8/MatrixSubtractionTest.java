package online_class.assignments.class8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixSubtractionTest {
    MatrixSubtraction matrices = new MatrixSubtraction();

    @Test
    public void solveTest1() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrixA.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrixA.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        matrixB.add(new ArrayList<>(Arrays.asList(9, 8, 7)));
        matrixB.add(new ArrayList<>(Arrays.asList(6, 5, 4)));
        matrixB.add(new ArrayList<>(Arrays.asList(3, 2, 1)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(-8, -6, -4)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(-2, 0, 2)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(4, 6, 8)));

        assertEquals(matrices.solve(matrixA, matrixB), resultMatrix);
    }

    @Test
    public void solveTest2() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 1)));

        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        matrixB.add(new ArrayList<>(Arrays.asList(2, 3)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(-1, -2)));

        assertEquals(matrices.solve(matrixA, matrixB), resultMatrix);
    }
}
