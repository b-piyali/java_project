package online_class.arrays_maths;

/**
 * Problem Description
 * Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.
 */

public class ABandModulo {
    public int solve(int A, int B) {
        if (A == B) {
            return A;
        }
        return A > B ? A - B : B - A;
    }
}
