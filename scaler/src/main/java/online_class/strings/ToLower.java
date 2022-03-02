package online_class.strings;

import java.util.ArrayList;

public class ToLower {
    public ArrayList<Character> to_lower(ArrayList<Character> A) {
        for (int i = 0; i < A.size(); ++i) {
            char ch = A.get(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
                A.set(i, ch);
            }
        }
        return A;
    }
}
