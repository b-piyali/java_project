package online_class.home_work.class6;

import java.util.ArrayList;

public class LeadersInArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> leader = new ArrayList<>();
        int maxNum = Integer.MIN_VALUE;
        for (int i = A.size() - 1; i >= 0; --i) {
            if (maxNum < A.get(i)) {
                maxNum = A.get(i);
                leader.add(A.get(i));
            }
        }
        return leader;
    }
}
