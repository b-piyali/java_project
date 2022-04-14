package online_class.assignments.class8;

import online_class.matrix.ColumnSum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColumnSumTest {
    ColumnSum columnSum = new ColumnSum();

    @Test
    public void solveTest1() {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrixA.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrixA.add(new ArrayList<>(Arrays.asList(9, 2, 3, 4)));
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(15, 10, 13, 16));
        assertEquals(columnSum.solve(matrixA), results);
    }
}
