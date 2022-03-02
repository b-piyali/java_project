package online_class.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LargestContinuousSequenceZeroSum {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> subArray = new ArrayList<>();
        Map<Integer, Integer> preSumIndex = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        int start = 1;
        int end = 0;
        preSumIndex.put(0, -1);
        for (int i = 0; i < A.size(); ++i) {
            sum += A.get(i);
            if (preSumIndex.containsKey(sum)) {
                int len = i - preSumIndex.get(sum);
                if (maxLen < len) {
                    maxLen = len;
                    start = preSumIndex.get(sum) + 1;
                    end = i;
                }
            } else {
                preSumIndex.put(sum, i);
            }
        }
        for (int i = start; i <= end; ++i) {
            subArray.add(A.get(i));
        }

        return subArray;
    }
}
