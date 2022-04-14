package online_class.assignments.class8;

import online_class.matrix.MatrixMultiplication;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixMultiplicationTest {
    MatrixMultiplication matrices = new MatrixMultiplication();

    @Test
    public void solveTest1(){
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2)));
        matrixA.add(new ArrayList<>(Arrays.asList(3, 4)));

        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        matrixB.add(new ArrayList<>(Arrays.asList(5, 6)));
        matrixB.add(new ArrayList<>(Arrays.asList(7, 8)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(19, 22)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(43, 50)));

        assertEquals(matrices.solve(matrixA, matrixB), resultMatrix);
    }

    @Test
    public void solveTest2(){
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 1)));

        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        matrixB.add(new ArrayList<>(Arrays.asList(2)));
        matrixB.add(new ArrayList<>(Arrays.asList(3)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(5)));

        assertEquals(matrices.solve(matrixA, matrixB), resultMatrix);
    }
}
