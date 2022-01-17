package online_class.home_work.class5;

import java.util.ArrayList;

public class TimeEquality {
    public int solve(ArrayList<Integer> A) {
        int maxVal = A.get(0);
        for (int num : A) {
            maxVal = Math.max(maxVal, num);
        }
        int steps = 0;
        for (int num : A) {
            steps += maxVal - num;
        }
        return steps;
    }
}
