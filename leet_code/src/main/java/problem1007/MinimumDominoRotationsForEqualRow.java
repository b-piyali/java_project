package problem1007;

import java.util.HashMap;
import java.util.Map;

public class MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        if (tops.length != bottoms.length)
            return 0;
        int len = tops.length;
        Map<Integer, Integer> topFreqCount = new HashMap<>();
        Map<Integer, Integer> sameFreqCount = new HashMap<>();
        Map<Integer, Integer> bottomFreqCount = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            topFreqCount.merge(tops[i], 1, Integer::sum);
            bottomFreqCount.merge(bottoms[i], 1, Integer::sum);
            if (tops[i] == bottoms[i])
                sameFreqCount.merge(tops[i], 1, Integer::sum);
        }
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : topFreqCount.entrySet()) {
            int num = entry.getKey();
            if (bottomFreqCount.containsKey(num) ) {
                if ((sameFreqCount.containsKey(num) && (bottomFreqCount.get(num) + topFreqCount.get(num) - sameFreqCount.get(num) == len)) ||
                        (!sameFreqCount.containsKey(num) && (bottomFreqCount.get(num) + topFreqCount.get(num) == len))) {
                    maxCount = Math.max(bottomFreqCount.get(num), topFreqCount.get(num));
                }
            }
        }
        return maxCount != 0 ? len - maxCount : -1;
    }
}
