package problem74;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int i = 0;
        int j = colLen - 1;
        while (i < rowLen && j >= 0) {
            if (matrix[i][j] < target) {
                i++;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
