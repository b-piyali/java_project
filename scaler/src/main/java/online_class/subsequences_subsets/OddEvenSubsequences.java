package online_class.subsequences_subsets;

import java.util.ArrayList;
import java.util.Objects;

public class OddEvenSubsequences {
    public int solve(ArrayList<Integer> A) {
        if (Objects.isNull(A)) {
            return 0;
        }
        int subLen = 0;
        boolean odd = ((A.get(0) & 1) == 1);
        boolean even = ((A.get(0) & 1) == 0);
        for (int num : A) {
            if ((num & 1) == 0 && even) {
                subLen++;
                even = false;
                odd = true;
            } else if (((num & 1) == 1 && odd)) {
                subLen++;
                even = true;
                odd = false;
            }
        }
        return subLen;
    }
}
