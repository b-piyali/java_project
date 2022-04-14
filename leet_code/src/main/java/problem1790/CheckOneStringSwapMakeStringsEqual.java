package problem1790;

import java.util.Arrays;
import java.util.Objects;

public class CheckOneStringSwapMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        if (Objects.isNull(s1) || Objects.isNull(s2) || s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return true;
        int counter = 0;
        int[] s = new int[26];
        int[] ss = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                counter++;

            if (counter > 2)
                return false;

            s[s1.charAt(i) - 'a']++;
            ss[s2.charAt(i) - 'a']++;
        }

        return Arrays.equals(s, ss);
    }
}
