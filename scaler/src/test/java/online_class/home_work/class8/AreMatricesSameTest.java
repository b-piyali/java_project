package online_class.home_work.class8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreMatricesSameTest {
    AreMatricesSame matrices = new AreMatricesSame();

    @Test
    public void solveTest1() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrixA.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrixA.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        matrixB.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrixB.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrixB.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        assertEquals(matrices.solve(matrixA, matrixB), 1);
    }

    @Test
    public void solveTest2() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrixA.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrixA.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        matrixB.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrixB.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        matrixB.add(new ArrayList<>(Arrays.asList(4, 5, 6)));

        assertEquals(matrices.solve(matrixA, matrixB), 0);
    }

}
