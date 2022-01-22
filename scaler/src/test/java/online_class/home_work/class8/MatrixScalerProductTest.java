package online_class.home_work.class8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixScalerProductTest {
    MatrixScalerProduct scalerProduct = new MatrixScalerProduct();

    @Test
    public void solveTest1(){
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrixA.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrixA.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(2, 4, 6)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(8, 10, 12)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(14, 16, 18)));

        assertEquals(scalerProduct.solve(matrixA, 2), resultMatrix);
    }

    @Test
    public void solveTest2(){
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        matrixA.add(new ArrayList<>(Arrays.asList(7)));
        matrixA.add(new ArrayList<>(Arrays.asList(10)));

        ArrayList<ArrayList<Integer>> resultMatrix = new ArrayList<>();
        resultMatrix.add(new ArrayList<>(Arrays.asList(28)));
        resultMatrix.add(new ArrayList<>(Arrays.asList(40)));

        assertEquals(scalerProduct.solve(matrixA, 4), resultMatrix);
    }

}
