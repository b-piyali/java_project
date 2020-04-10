package problem387;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FirstUniqueCharacterString {
    public int firstUniqChar(String s) {
        /*int index = -1;
        if (Objects.isNull(s) || s.equals(""))
            return index;*/

        boolean isUnique;
        char current, checkChar;
        int size = s.length();
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            isUnique = true;
            current = s.charAt(i);
            charSet.add(current);
            for (int j = 0; j < size; j++) {
                checkChar = s.charAt(j);
                if (i != j && checkChar == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }
}
