package online_class.bit_manipulations;

import java.util.ArrayList;

public class MaximumSatisfaction {
    public int solve(ArrayList<Integer> A) {
        int maxSatisfaction = 0;
        for (int i = 30; i >= 0; i--) {
            int possibleAns = (1 << i) | maxSatisfaction;
            int count = 0;
            for (Integer integer : A) {
                if ((integer & possibleAns) == possibleAns) {
                    count++;
                }
                if (count >= 4) {
                    maxSatisfaction = possibleAns;
                }
            }
        }
        return maxSatisfaction;
    }
}
