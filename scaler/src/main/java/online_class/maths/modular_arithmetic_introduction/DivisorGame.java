package online_class.maths.modular_arithmetic_introduction;

/**
 * Problem Description
 * Scooby has 3 three integers A, B, and C.
 * <p>
 * Scooby calls a positive integer special if it is divisible by B and it is divisible by C.
 * You need to tell the number of special integers less than or equal to A.
 */

public class DivisorGame {
    public int solve(int A, int B, int C) {
        int lcm = B * C / gcd(B, C);
        return A / lcm;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
