package online_class.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ElementsRemoval {
    public int solve(ArrayList<Integer> A) {
        A.sort(Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < A.size(); ++i) {
            sum += A.get(i) * (i + 1);
        }
        return sum;
    }
}
