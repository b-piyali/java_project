package problem3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int count = 0;
        Set<Character> charSet = new HashSet<>();
        //charSet.add(s.charAt(0));
        for (int i = 0; i < s.length()-1; i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            if (ch != ch2 && !charSet.contains(ch)) {
                count++;
                charSet.add(ch);
            } else {
                maxLen = Math.max(maxLen, count);
                count = 0;
            }
        }
        return count == 0 ? Math.max(maxLen, (count+1)):maxLen;
    }
}
