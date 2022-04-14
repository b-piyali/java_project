package online_class.maths.modular_arithmetic_introduction;

/**
 * Problem Description
 *
 * Given two integers A and B. Find the value of A-1 mod B where B is a prime number and gcd(A, B) = 1.
 *
 * A-1 mod B is also known as modular multiplicative inverse of A under modulo B.
 */

public class PrimeModuloInverse {
    public int solve(int A, int B) {
        int p = B - 2;
        return pow(A, p, B);
    }

    private int pow(int A, int p, int mod) {
        if (A == 0)
            return 0;
        if (p == 0)
            return 1;
        long power = pow(A, (p >> 1), mod) % mod;

        power = (power % mod * power % mod) % mod;

        return (int) (((p & 1) == 0) ? power : (((A % mod * power) % mod) + mod) % mod);
    }
}
