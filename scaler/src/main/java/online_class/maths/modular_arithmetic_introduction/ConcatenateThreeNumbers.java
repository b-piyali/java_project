package online_class.maths.modular_arithmetic_introduction;

public class ConcatenateThreeNumbers {
    public int solve(int A, int B, int C) {
        StringBuilder str = new StringBuilder();
        int min = Math.min(A, Math.min(B, C));
        str.append(min);
        int max = Math.max(A, Math.max(B, C));
        str.append((A + B + C) - min - max);
        str.append(max);
        int val = Integer.parseInt(str.toString());
        return val;
    }
}
