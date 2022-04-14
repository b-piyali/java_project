package problem74;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Search2DMatrixTest {
    Search2DMatrix searchMatrix;

    @BeforeEach
    void setup() {
        searchMatrix = new Search2DMatrix();
    }

    @Test
    public void testTrue() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean result = true;
        assertEquals(result, searchMatrix.searchMatrix(matrix, target));
    }

    @Test
    public void testFalse() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        boolean result = false;
        assertEquals(result, searchMatrix.searchMatrix(matrix, target));
    }
}
