package online_class.home_work.class8;

import online_class.matrix.MainDiagonalSum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainDiagonalSumTest {
    MainDiagonalSum diagonalSum = new MainDiagonalSum();

    @Test
    public void solveTest1() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, -2, -3)));
        matrixA.add(new ArrayList<>(Arrays.asList(-4, 5, -6)));
        matrixA.add(new ArrayList<>(Arrays.asList(-7, -8, 9)));
        assertEquals(diagonalSum.solve(matrixA), 15);
    }

    @Test
    public void solveTest2() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(3, 2)));
        matrixA.add(new ArrayList<>(Arrays.asList(2, 3)));
        assertEquals(diagonalSum.solve(matrixA), 6);
    }
}
