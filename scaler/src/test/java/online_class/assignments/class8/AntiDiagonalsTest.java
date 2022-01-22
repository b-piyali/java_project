package online_class.assignments.class8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AntiDiagonalsTest {
    AntiDiagonals diagonals = new AntiDiagonals();

    @Test
    public void diagonalTest1() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrixA.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrixA.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(1, 0, 0)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(2, 4, 0)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(3, 5, 7)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(6, 8, 0)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(9, 0, 0)));

        assertEquals(diagonals.diagonal(matrixA), resultMatrix);
    }

    @Test
    public void diagonalTest2() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2)));
        matrixA.add(new ArrayList<>(Arrays.asList(3, 4)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(1, 0)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(2, 3)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(4, 0)));

        assertEquals(diagonals.diagonal(matrixA), resultMatrix);
    }

    @Test
    public void diagonalTest3() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(3, 7, 7, 1)));
        matrixA.add(new ArrayList<>(Arrays.asList(8, 4, 15, 1)));
        matrixA.add(new ArrayList<>(Arrays.asList(13, 5, 8, 5)));
        matrixA.add(new ArrayList<>(Arrays.asList(11, 6, 8, 7)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(1, 0)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(2, 3)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(4, 0)));

        assertEquals(diagonals.diagonal(matrixA), resultMatrix);
    }
}
