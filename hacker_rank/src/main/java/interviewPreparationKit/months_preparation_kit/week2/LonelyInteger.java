package interviewPreparationKit.months_preparation_kit.week2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        Map<Integer, Integer> inputMap = new HashMap<>();
        a.forEach(i -> inputMap.merge(i, 1, Integer::sum));
        return inputMap.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().map(Map.Entry::getKey).orElse(0);
    }
}
