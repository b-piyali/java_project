package online_class.arrays_maths;

/**
 * Problem Description
 * Implement pow(A, B) % C.
 * In other words, given A, B and C, Find (AB % C).
 * <p>
 * Note: The remainders on division cannot be negative.
 * In other words, make sure the answer you return is non-negative.
 */
public class ImplementPowerFunction {
    public int pow(int A, int B, int C) {
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;
        long pow = pow(A, (B >> 1), C) % C;

        long p = (pow % C * pow % C) % C;

        return (int) (((B & 1) == 0) ? p : (((A % C * p) % C) + C) % C);
    }
}
