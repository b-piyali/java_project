package online_class.assignments.class5;

import java.util.ArrayList;

public class EquilibriumIndexArray {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> preSum = new ArrayList<>();
        int sum = 0;
        for (int num : A) {
            preSum.add(sum += num);
        }
        for (int i = 0; i < preSum.size(); ++i) {
            int leftSum = i == 0 ? 0 : preSum.get(i - 1);
            int rightSum = preSum.get(preSum.size() - 1) - preSum.get(i);
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
}
