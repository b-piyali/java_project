package online_class.assignments.class6;

import java.util.ArrayList;
import java.util.Objects;

public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        if (Objects.nonNull(A)) {
            int maxVal = A.get(0);
            int minVal = A.get(0);
            for (int num : A) {
                maxVal = Math.max(maxVal, num);
                minVal = Math.min(minVal, num);
            }
            if (A.size() <= 2) {
                if (maxVal != minVal)
                    return 2;
                return 1;
            }
            if (maxVal == minVal)
                return 1;
            int len = Integer.MAX_VALUE;
            int maxIndex = -1;
            int minIndex = -1;
            for (int i = 0; i < A.size(); ++i) {
                boolean updated = false;
                if (A.get(i) == maxVal) {
                    maxIndex = i;
                    updated = true;
                } else if (A.get(i) == minVal) {
                    minIndex = i;
                    updated = true;
                }
                if (updated && maxIndex != -1 && minIndex != -1)
                    len = Math.min(len, Math.abs(maxIndex - minIndex) + 1);
            }
            return len;
        }
        return 0;
    }
}
