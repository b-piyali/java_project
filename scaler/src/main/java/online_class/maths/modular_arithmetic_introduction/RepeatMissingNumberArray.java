package online_class.maths.modular_arithmetic_introduction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatMissingNumberArray {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> numberMap = new HashMap<>();

        int max = A.size();
        for (int i : A) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            } else {
                result.add(i);
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                result.add(i);
            }
        }
        return result;
    }
}
