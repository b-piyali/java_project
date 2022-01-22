package online_class.assignments.class8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralOrderMatrixIITest {
    SpiralOrderMatrixII spiralMatrix = new SpiralOrderMatrixII();

    @Test
    public void generateMatrixTest() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1)));
        assertEquals(spiralMatrix.generateMatrix(1), matrix);
    }

    @Test
    public void generateMatrixTest1() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 3)));
        assertEquals(spiralMatrix.generateMatrix(2), matrix);
    }

    @Test
    public void generateMatrixTest2() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(8, 9, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 6, 5)));
        assertEquals(spiralMatrix.generateMatrix(3), matrix);
    }

    @Test
    public void generateMatrixTest3() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(12, 13, 14, 5)));
        matrix.add(new ArrayList<>(Arrays.asList(11, 16, 15, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(10, 9, 8, 7)));
        assertEquals(spiralMatrix.generateMatrix(4), matrix);
    }
}
