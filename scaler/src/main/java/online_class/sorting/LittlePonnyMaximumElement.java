package online_class.sorting;

import java.util.ArrayList;

public class LittlePonnyMaximumElement {
    public int solve(ArrayList<Integer> A, int B) {
        if (A.contains(B)) {
            int count = 0;
            for (int num : A) {
                if (num > B) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }
}
