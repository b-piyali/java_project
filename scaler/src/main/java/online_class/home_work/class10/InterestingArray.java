package online_class.home_work.class10;

import java.util.ArrayList;

public class InterestingArray {
    public String solve(ArrayList<Integer> A) {
        int merge = 0;
        for (int num : A) {
            merge = merge ^ num;
        }
        if (merge % 2 == 0)
            return "Yes";
        else
            return "No";
    }
}
