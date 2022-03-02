package online_class.hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public int solve(ArrayList<Integer> A) {
        LinkedHashMap<Integer, Integer> numMap = new LinkedHashMap<>();
        for (int num : A) {
            numMap.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entrySet : numMap.entrySet()) {
            if (entrySet.getValue() > 1) {
                return entrySet.getKey();
            }
        }
        return -1;
    }
}
