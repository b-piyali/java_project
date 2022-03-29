package online_class.bit_manipulations;

import java.util.List;

public class SingleNumberThrice {
    public int singleNumber(final List<Integer> A) {
        int ans = 0;
        for (int i = 0; i < 30; ++i) {
            int count = 0;
            for (int num : A) {
                if (checkBit(num, i) == 1) {
                    count++;
                }
            }
            if (count % 3 == 1) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }

    private int checkBit(int num, int i) {
        return ((num >> i) & 1);
    }
}
