package online_class.recursion;

public class KthSymbo {
    public int solve(int A, int B) {
        if (A == 1 && B == 1) {
            return 0;
        }
        int mid = (int) Math.pow(2, A - 1) / 2;
        if (B <= mid) {
            return solve(A - 1, B);
        } else {
            return 1 - solve(A - 1, B - mid);
        }
    }
}
