package online_class.home_work.class8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RowToColumnZeroTest {
    RowToColumnZero columnZero = new RowToColumnZero();

    @Test
    public void solveTest1(){
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
        matrixA.add(new ArrayList<>(Arrays.asList(5,6,7,0)));
        matrixA.add(new ArrayList<>(Arrays.asList(9,2,0,4)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(1,2,0,0)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(0,0,0,0)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(0,0,0,0)));

        assertEquals(columnZero.solve(matrixA), resultMatrix);
    }

    /*@Test
    public void solveTest2(){
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2)));
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2)));
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(2, 2, 2)));

        assertEquals(columnZero.solve(matrixA), resultMatrix);
    }*/
}
