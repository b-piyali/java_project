package online_class.home_work.class8;

import online_class.matrix.RowSum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RowSumTest {
    RowSum rowSum = new RowSum();

    @Test
    public void solveTest1() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrixA.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrixA.add(new ArrayList<>(Arrays.asList(9, 2, 3, 4)));
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(10,26,18));
        assertEquals(rowSum.solve(matrixA), results);
    }

}
