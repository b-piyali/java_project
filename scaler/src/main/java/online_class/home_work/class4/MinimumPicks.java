package online_class.home_work.class4;

import java.util.ArrayList;

public class MinimumPicks {
    public int solve(ArrayList<Integer> A) {
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        for (int num : A) {
            if (num % 2 == 0)
                maxEven = Math.max(maxEven, num);
            else
                minOdd = Math.min(minOdd, num);
        }
        return maxEven - minOdd;
    }
}
