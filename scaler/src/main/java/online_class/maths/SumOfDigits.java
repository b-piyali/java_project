package online_class.maths;

/**
 * Problem Description
 * Given a number A, we need to find the sum of its digits using recursion.
 */

public class SumOfDigits {
    public int solve(int A) {
        if (A == 0)
            return 0;

        return (A % 10 + solve(A / 10));
    }
}
