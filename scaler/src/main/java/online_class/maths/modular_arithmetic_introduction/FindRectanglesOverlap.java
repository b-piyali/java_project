package online_class.maths.modular_arithmetic_introduction;

public class FindRectanglesOverlap {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (A == C || B == D || E == G || F == H) {
            return 0;
        }
        if (A > G || E > C) {
            return 0;
        }
        if (D > F || H > B) {
            return 0;
        }

        return 1;
    }
}
