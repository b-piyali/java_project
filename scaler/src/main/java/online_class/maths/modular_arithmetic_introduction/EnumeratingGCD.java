package online_class.maths.modular_arithmetic_introduction;

/**
 * Problem Description
 * You are given a number A and a number B. Greatest Common Divisor (GCD) of all numbers
 * between A and B inclusive is taken (GCD(A, A+1, A+2 ... B)).
 * As this problem looks a bit easy, it is given that numbers A and B can be in the range of 10100.
 * <p>
 * You have to return the value of GCD found.
 * <p>
 * The greatest common divisor of 2 numbers, A and B, is the largest number, D that divides both A and B perfectly.
 */

public class EnumeratingGCD {
    public String solve(String A, String B) {
        if (A.equals(B))
            return A;
        return "1";// continious number's GCD is 1. e.g. gcd(3,4,5,6,7,8) ==1
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
