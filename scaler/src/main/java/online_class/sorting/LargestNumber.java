package online_class.sorting;

import java.util.Comparator;
import java.util.List;

public class LargestNumber {
    public String largestNumber(final List<Integer> A) {
        StringBuilder str = new StringBuilder();
        A.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                long v1 = Long.parseLong(String.valueOf(o1) + String.valueOf(o2));
                long v2 = Long.parseLong(String.valueOf(o2) + String.valueOf(o1));
                if (v1 <= v2) {
                    return 1;
                }
                return -1;
            }
        });

        for (int num : A) {
            str.append(num);
        }
        return A.get(0) == 0 ? "0" : str.toString();
    }
}
