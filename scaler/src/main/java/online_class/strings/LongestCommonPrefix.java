package online_class.strings;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        StringBuilder B = new StringBuilder();
        int minLengthString = Integer.MAX_VALUE, index = 0;

        for (String str : A) {
            minLengthString = Math.min(minLengthString, str.length());
        }

        while (index < minLengthString) {
            HashSet<Character> hs = new HashSet<>();
            for (String str : A) {
                hs.add(str.charAt(index));
            }
            if (hs.size() != 1) {
                break;
            }
            B.append(A.get(0).charAt(index));
            index++;
        }
        return B.toString();
    }
}
