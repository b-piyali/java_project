package online_class.home_work.class7;

import java.util.ArrayList;

public class GoodSubarraysEasy {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        int len = A.size();
        for (int i = 0; i < len; ++i) {
            int sum = 0;
            int subArrayLen = 0;
            for (int j = i; j < len; ++j) {
                subArrayLen++;
                sum += A.get(j);
                if ((subArrayLen % 2 == 0 && sum < B) || (subArrayLen % 2 != 0 && sum > B)) {
                    count++;
                }
            }
        }
        return count;
    }
}
