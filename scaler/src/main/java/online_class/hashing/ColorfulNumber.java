package online_class.hashing;

import java.util.HashSet;
import java.util.Set;

public class ColorfulNumber {
    public int colorful(int A) {
        Set<Integer> set = new HashSet<>();
        int prev = -1;
        int n = 10;
        while (A > 0) {
            int currDigit = A % n;
            A = A / n;

            if (set.contains(currDigit) || set.contains(currDigit * prev))
                return 0;
            set.add(currDigit);

            if (!set.add(currDigit * prev)) {
                return 0;
            }
            prev = currDigit;
        }
        return 1;
    }
}
