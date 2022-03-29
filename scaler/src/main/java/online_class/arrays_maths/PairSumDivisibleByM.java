package online_class.arrays_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Problem Description
 * <p>
 * Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.
 * <p>
 * Since the answer may be large, return the answer modulo (109 + 7).
 */

public class PairSumDivisibleByM {
    public int solve(ArrayList<Integer> A, int B) {
        if (B == 0 || Objects.isNull(A))
            return 0;

        int mod = 1000000007;
        long pairCount = 0;
        Map<Integer, Integer> modMap = new HashMap<>();

        for (int num : A) {
            modMap.merge((num % B), 1, Integer::sum);
        }

        long x;
        if (Objects.nonNull(modMap.get(0))) {
            x = modMap.get(0) % mod;
            pairCount += ((x * (x - 1)) / 2);
        }

        if ((B & 1) == 0 && Objects.nonNull(modMap.get(B / 2))) {
            x = modMap.get(B / 2) % mod;
            pairCount += ((x * (x - 1)) / 2);
        }

        int len = (B + 1) / 2;
        for (int i = 1; i < len; ++i) {
            if (Objects.nonNull(modMap.get(i)) && Objects.nonNull(modMap.get(B - i)))
                pairCount += ((long) modMap.get(i) * modMap.get(B - i));
        }

        return (int) (pairCount < 0 ? (pairCount + mod) % mod : pairCount % mod);
    }
}
