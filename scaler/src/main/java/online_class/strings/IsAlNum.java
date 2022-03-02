package online_class.strings;

import java.util.ArrayList;

public class IsAlNum {
    public int solve(ArrayList<Character> A) {
        for (char ch : A) {
            if ((ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z') && (ch < '0' || ch > '9')) {
                return 0;
            }
        }
        return 1;
    }
}
