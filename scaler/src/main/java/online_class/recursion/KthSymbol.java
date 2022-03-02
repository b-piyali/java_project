package online_class.recursion;

public class KthSymbol {
    public int solve(int A, int B) {
        if (A == 0) {
            return 0;
        }

        if (B % 2 == 0)
            return 1 - solve(A - 1, B / 2);

        return solve(A - 1, (B + 1) / 2);
    }
}
