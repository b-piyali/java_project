package problem59;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixIITest {
    SpiralMatrixII spiralMatrix;

    @BeforeEach
    void setup(){
        spiralMatrix = new SpiralMatrixII();
    }

    @Test
    public void test1(){
        int[][] matrix = {{1,2,3}, {8, 9, 4}, {7, 6, 5}};
        assertEquals(matrix, spiralMatrix.generateMatrix(3));
    }
}
