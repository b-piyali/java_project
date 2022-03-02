package online_class.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubArray0Sum {
    public int solve(ArrayList<Integer> A) {
        Map<Long, Integer> map = new HashMap<>();
        long pref = 0;
        map.put(0L, 0);
        for (int i = 0; i < A.size(); i++) {
            pref = pref + (A.get(i));
            if (map.containsKey(pref)) {
                return 1;
            } else {
                map.put(pref, i);
            }
        }
        return 0;
    }
}
