package online_class.arrays;

import java.util.ArrayList;

public class RangeSumQuery {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> preSum = new ArrayList<>();
        ArrayList<Long> ans = new ArrayList<>();
        long sum = 0;
        for (int num : A) {
            sum += num;
            preSum.add(sum);
        }

        for (ArrayList<Integer> query : B) {
            int left = query.get(0) - 1;
            int right = query.get(1) - 1;
            if (left != 0) {
                ans.add(preSum.get(right) - preSum.get(left - 1));
            } else {
                ans.add(preSum.get(right));
            }
        }
        return ans;
    }
}
