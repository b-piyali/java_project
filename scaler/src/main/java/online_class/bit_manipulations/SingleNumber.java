package online_class.bit_manipulations;

import java.util.List;

public class SingleNumber {
    public int singleNumber(final List<Integer> A) {
        int ans = 0;
        for (int num : A) {
            ans ^= num;
        }
        return ans;
    }
}
