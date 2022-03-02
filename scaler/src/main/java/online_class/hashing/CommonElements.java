package online_class.hashing;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();

        Map<Integer, Integer> countMap = A.stream().mapToInt(num -> num).boxed().collect(Collectors.toMap(num -> num, num -> 1, Integer::sum));

        B.stream().mapToInt(num -> num).filter(num -> countMap.containsKey(num) && countMap.get(num) != 0).forEach(num -> {
            result.add(num);
            countMap.merge(num, -1, Integer::sum);
        });

        return result;
    }
}
