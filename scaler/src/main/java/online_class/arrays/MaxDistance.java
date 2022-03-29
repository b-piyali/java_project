package online_class.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MaxDistance {
    public int maximumGap(final List<Integer> A) {
        if (Objects.isNull(A))
            return 0;
        int distance = 0;
        List<Integer> suffix = new ArrayList<>(Collections.nCopies(A.size(), 0));
        suffix.set((A.size() - 1), A.get(A.size() - 1));
        for (int i = A.size() - 2; i >= 0; --i) {
            suffix.set(i, (Math.max(suffix.get(i + 1), A.get(i))));
        }
        int i = 0, j = 0;
        while (i < A.size() && j < A.size()) {
            if (A.get(i) <= suffix.get(j)) {
                distance = Math.max(distance, (j - i));
                j++;
            } else
                i++;
        }
        return distance;
    }
}
