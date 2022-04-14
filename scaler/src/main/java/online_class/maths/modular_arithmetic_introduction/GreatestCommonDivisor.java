package online_class.maths.modular_arithmetic_introduction;

public class GreatestCommonDivisor {
    public int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }
}
