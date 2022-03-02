package online_class.hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindromeII {
    public int solve(String A) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : A.toCharArray()) {
            charMap.merge(ch, 1, Integer::sum);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> ch : charMap.entrySet()) {
            if (ch.getValue() % 2 == 1) {
                count++;
                if (count > 1)
                    return 0;
            }
        }
        return 1;
    }
}
