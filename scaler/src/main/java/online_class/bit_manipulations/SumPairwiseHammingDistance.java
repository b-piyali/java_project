package online_class.bit_manipulations;

import java.util.List;

public class SumPairwiseHammingDistance {
    public int hammingDistance(final List<Integer> A) {
        long sum = 0;
        long mod = 1000000007;
        for (int i = 30; i >= 0; i--) {
            long c1 = 0, c0 = 0;
            for (long num : A) {
                if (checkBit(num, i)) {
                    c1++;
                } else {
                    c0++;
                }
            }
            long con = ((c1 % mod) * (c0 % mod)) % mod;
            sum += (con) % mod;
        }
        return (int) ((int)(2 * sum) % mod);
    }

    private boolean checkBit(long num, int index) {
        return (((num >> index) & 1) == 1);
    }
}
