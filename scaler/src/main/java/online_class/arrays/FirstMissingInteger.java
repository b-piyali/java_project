package online_class.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int len = A.size();
        Collections.sort(A);
        for (int i = 1; i < len; ++i) {
            while (A.get(i) > 0 && A.get(i) < len && A.get(i) != (i + 1)) {
                int val = A.get(i);
                if (A.get(i) == A.get(val - 1))
                    break;
                A.set(i, A.get(val - 1));
                A.set((val - 1), val);
            }
        }
        for (int i = 0; i < len; ++i) {
            if (!A.contains(i + 1))
                return i + 1;
        }
        return len + 1;
    }
}
