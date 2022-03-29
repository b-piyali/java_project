package online_class.arrays;

import java.util.ArrayList;

public class MinimumSwaps {
    public int solve(ArrayList<Integer> A, int B) {
        int ans = 0, c = 0, count = 0;
        for (int integer : A) {
            if (integer <= B) {
                count++;
            }
        }

        int l = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) <= B) {
                c++;
            }
            if (i == l + count - 1) {
                if (ans < c) {
                    ans = c;
                }
                if (A.get(l) <= B) {
                    c--;
                }
                l++;
            }
        }
        return ans - count >= 0 ? ans - count : count - ans;

    }
}
