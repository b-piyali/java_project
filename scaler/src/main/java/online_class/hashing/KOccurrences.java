package online_class.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KOccurrences {
    public int getSum(int A, int B, ArrayList<Integer> C) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int sum = 0;
        boolean isMached = false;
        for (int num : C) {
            numMap.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() == B) {
                sum += entry.getKey();
                isMached = true;
            }
        }
        return isMached ? sum : -1;
    }
}
