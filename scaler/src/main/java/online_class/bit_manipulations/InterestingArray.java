package online_class.bit_manipulations;

import java.util.ArrayList;

public class InterestingArray {
    public String solve(ArrayList<Integer> A) {
        int ans = 0;
        for (int num : A) {
            ans ^= num;
        }
        if ((ans & 1) == 0)
            return "Yes";
        return "No";
    }
}
