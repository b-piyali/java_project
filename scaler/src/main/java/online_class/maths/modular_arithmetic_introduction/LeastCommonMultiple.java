package online_class.maths.modular_arithmetic_introduction;

public class LeastCommonMultiple {
    public int LCM(int A, int B) {
        return (A / gcd(A, B)) * B;
    }

    private int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
