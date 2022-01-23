package online_class.assignments.class9;

import java.util.ArrayList;

public class ChristmasTrees {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size())
            return 0;
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < A.size() - 1; ++i) {
            int minLeft = Integer.MAX_VALUE;
            int minRight = Integer.MAX_VALUE;
            for (int j = i - 1; j >= 0; --j) { //to left
                if (A.get(j) < A.get(i)) {
                    minLeft = Math.min(minLeft, B.get(j));
                }
            }
            for (int j = i + 1; j < A.size(); ++j) { //to left
                if (A.get(j) > A.get(i)) {
                    minRight = Math.min(minRight, B.get(j));
                }
            }
            if (minLeft != Integer.MAX_VALUE && minRight != Integer.MAX_VALUE)
                minCost = Math.min(minCost, (minLeft + minRight + B.get(i)));
        }
        return minCost;
    }
}
