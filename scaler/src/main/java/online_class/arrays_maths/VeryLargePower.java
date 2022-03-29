package online_class.arrays_maths;

/**
 * Problem Description
 * Given two Integers A, B. You have to calculate (A ^ (B!)) % (1e9 + 7).
 * <p>
 * "^" means power,
 * <p>
 * "%" means "mod", and
 * <p>
 * "!" means factorial.
 */

public class VeryLargePower {
    public int solve(int A, int B) {
        if (A == 0)
            return 0;

        if (B == 0)
            return 1;

        long mod = (long) (1e9 + 7);
        if (B == 1)
            return (int) (A % mod);

        long factorialB = 1;
        for (long i = 2; i <= B; i += 1) {
            factorialB = (factorialB * i) % (mod - 1);
        }

        return pow(A, factorialB, mod);
    }

    private int pow(int A, long B, long C) {
        long ans = 1;

        while (B > 0) {
            if ((B & 1) == 1) {
                ans = (ans * A) % C;
            }
            A = (int) ((int) (A % C * A % C) % C);
            B = B >> 1;
        }

        return (int) (ans % C);
    }
}
