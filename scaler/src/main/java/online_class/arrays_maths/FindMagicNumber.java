package online_class.arrays_maths;

public class FindMagicNumber {
    public int solve(int A) {
        int num = 1, ans = 0;
        while (A > 0) {
            num *= 5;
            if ((A & 1) == 1) ans += num;
            A = A >> 1;
        }
        return ans;
    }
}
