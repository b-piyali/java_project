package problem202;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> numbers = new HashSet<>();
        while (numbers.add(n)) {
            sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }

        return sum == 1;
    }
}
