package online_class.maths.modular_arithmetic_introduction;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an integer array A of size N. You have to delete one element such that
 * the GCD(Greatest common divisor) of the remaining array is maximum.
 * <p>
 * Find the maximum value of GCD.
 */

public class DeleteOne {
    public int solve(ArrayList<Integer> A) {
        int maxGCD = 0;
        ArrayList<Integer> pfGCD = new ArrayList<>(Collections.nCopies(A.size(), 0));
        ArrayList<Integer> sfGCD = new ArrayList<>(Collections.nCopies(A.size(), 0));
        int gcd = A.get(0);
        for (int i = 0; i < A.size(); ++i) {
            gcd = gcd(A.get(i), gcd);
            pfGCD.set(i, gcd);
        }

        gcd = A.get(A.size() - 1);
        for (int i = A.size() - 1; i >= 0; --i) {
            gcd = gcd(A.get(i), gcd);
            sfGCD.set(i, gcd);
        }
        for (int i = 0; i < A.size(); ++i) {
            int left = i == 0 ? 0 : pfGCD.get(i - 1);
            int right = i == A.size() - 1 ? 0 : sfGCD.get(i + 1);
            maxGCD = Math.max(maxGCD, gcd(left, right));
        }

        return maxGCD;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
