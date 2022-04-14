package problem1572;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            //sum += mat[i][i];
            if (i == (mat.length - 1) - i)
                sum += mat[i][i]; //this condition is for filtering no repeating elements
            else
                sum = sum + mat[i][i] + mat[i][(mat.length - 1) - i];
        }
        /*for (int i = mat[0].length - 1, j = 0; i >= 0; i--, j++) {
            if (j != i)
                sum += mat[j][i];
        }*/

        return sum;
    }
}
