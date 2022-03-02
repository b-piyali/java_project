package online_class.maths.modular_arithmetic_introduction;

public class ABModulo {
    public int solve(int A, int B) {
        int modulo = 0;
        int maxVal = Math.max(A, B);
        for (int i = maxVal; i > 0; --i) {
            long rem1 = (long) A  % i;
            long rem2 = (long) B  % i;
            if (rem1 == rem2) {
                modulo = i;
                break;
            }
        }
        return modulo;
    }
}
