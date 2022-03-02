package online_class.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShaggyDistances {
    public int solve(ArrayList<Integer> A) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int minDistance = A.size();

        for (int i = 0; i < A.size(); ++i) {
            if (indexMap.containsKey(A.get(i))) {
                minDistance = Math.min(minDistance, i - indexMap.get(A.get(i)));
            } else {
                indexMap.put(A.get(i), i);
            }
        }
        return minDistance == A.size() ? -1 : minDistance;
    }
}
