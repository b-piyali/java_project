package problem763;

import java.util.*;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        if (Objects.isNull(s))
            return null;

        List<Integer> output = new ArrayList<>();
        Map<Character, Integer> charLastIndex = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            charLastIndex.put(s.charAt(i), i);
        }

        int pre = 0;
        int maxIndex = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            maxIndex = Math.max(maxIndex, charLastIndex.get(ch));
            if (maxIndex == i) {
                output.add(i - pre);
                pre = maxIndex;
            }
        }
        return output;
    }
}
