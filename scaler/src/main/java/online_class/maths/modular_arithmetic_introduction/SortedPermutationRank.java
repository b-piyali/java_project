package online_class.maths.modular_arithmetic_introduction;

public class SortedPermutationRank {
    public int findRank(String A) {
        int n = A.length();
        long ans = 0;
        int mod = 1000003;
        for (int i = 0; i < n; i++) {
            long count = 0;
            for (int j = i + 1; j < n; j++) {
                if (A.charAt(j) < A.charAt(i)) {
                    count++;
                }
            }
            ans += (count * fact(n - i - 1)) % mod;
        }
        return (int) (ans + 1) % mod;
    }

    private long fact(int n) {
        if (n == 0) return 1;
        int mod = 1000003;
        return (n * fact(n - 1)) % mod;
    }
}
