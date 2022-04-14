package problem59;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int row = 0, col = 0, val = 1;
        while (n > 1) {
            for (int k = 1; k < n; k++) {//right
                matrix[row][col] = val;
                val++;
                col++;
            }
            for (int k = 1; k < n; k++) {//down
                matrix[row][col] = val;
                val++;
                row++;
            }
            for (int k = 1; k < n; k++) {//left
                matrix[row][col] = val;
                val++;
                col--;
            }
            for (int k = 1; k < n; k++) {//right
                matrix[row][col] = val;
                val++;
                row--;
            }
            n -= 2;
            row++;
            col++;
        }
        if (n == 1)
            matrix[row][col] = val;

        return matrix;
    }
}
