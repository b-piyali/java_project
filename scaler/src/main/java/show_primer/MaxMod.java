package show_primer;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMod {
    public int solve(ArrayList<Integer> A) {
        A.sort(Collections.reverseOrder());
        int maxMod = 0;
        int i = 1;
        int j = 0;
        while (i < A.size()) {
            if (A.get(i) != 0 && A.get(j) != 0)
                maxMod = Math.max(maxMod, Math.max((A.get(i) % A.get(j)), (A.get(j) % A.get(i))));
            ++i;
            ++j;
        }
        return maxMod;
    }
}
