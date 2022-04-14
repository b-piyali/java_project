package online_class.maths.modular_arithmetic_introduction;

import java.util.Arrays;

/**
 * Problem Description
 * Given three integers A, B, and C, where
 * A represents n,
 * B represents r, and
 * C represents m, f
 * ind and return the value of nCr % m where
 * nCr % m = (n!/((n-r)!*r!))% m.
 *
 * x! means factorial of x i.e. x! = 1 * 2 * 3... * x.
 */

public class ComputenCrModm {
    public int solve(int A, int B, int C) {
        int[][] a = new int[A + 1][B + 1];
        for (int[] i : a) {
            Arrays.fill(i, 0);
        }

        for (int i = 0; i <= A; i++) {
            a[i][0] = 1;
        }

        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= B; j++) {
                a[i][j] = (a[i - 1][j]) % C + (a[i - 1][j - 1]) % C;
                a[i][j] = a[i][j] % C;
            }
        }

        return a[A][B] % C;
    }
}
