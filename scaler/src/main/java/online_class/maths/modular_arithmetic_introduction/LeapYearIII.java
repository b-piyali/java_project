package online_class.maths.modular_arithmetic_introduction;

public class LeapYearIII {
    public int solve(int A) {
        if (A % 400 == 0 || (A % 100 != 0 && A % 4 == 0))
            return 1;
        return 0;
    }
}
