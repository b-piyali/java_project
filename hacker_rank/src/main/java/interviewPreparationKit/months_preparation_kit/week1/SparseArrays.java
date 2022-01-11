package interviewPreparationKit.months_preparation_kit.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> countList = new ArrayList<>();
        queries.forEach(queryString -> {
            int count = (int) strings.stream()
                    .filter(str -> str.equals(queryString))
                    .count();
            countList.add(count);
        });
        return countList;
    }

    public static List<Integer> matchingStrings2(List<String> strings, List<String> queries) {
        List<Integer> countList = new ArrayList<>();
        Map<String, Integer> stringMap = new HashMap<>();
        strings.forEach(str -> stringMap.merge(str, 1, Integer::sum));

        queries.forEach(query -> countList.add(stringMap.getOrDefault(query, 0)));

        return countList;
    }
}
