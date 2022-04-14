package online_class.maths.modular_arithmetic_introduction;

public class AllGCDPair {
    public int[] solve(int[] A) {
        int orignalN = (int) Math.sqrt(A.length);//size of original array
        int[] ans = new int[orignalN]; // original array to return
        int max = 0;
        int j = 0;
        for (int i = 0; i < orignalN; i++) {
            for (; j < (i + 1) * orignalN; j++) {
                max = Math.max(max, A[j]);
            }

            ans[i] = max;
            max = 0;
        }
        return ans;
    }
}
