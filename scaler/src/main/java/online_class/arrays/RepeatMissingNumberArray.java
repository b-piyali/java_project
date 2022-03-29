package online_class.arrays;

import java.util.*;

public class RepeatMissingNumberArray {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        if (Objects.isNull(A))
            return null;
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : A) {
            frequency.merge(num, 1, Integer::sum);
        }
        int missing = 0;
        int duplicate = 0;
        for (int i = 1; i <= A.size(); i++) {
            if (!frequency.containsKey(i)) {
                    missing = i;
            } else if (frequency.get(i) == 2) {
                duplicate = i;
            }
        }
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}
