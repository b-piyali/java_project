package online_class.strings;

public class AmazingSubarrays {
    public int solve(String A) {
        int count = 0;
        int len = A.length();
        for (int i = 0; i < len; ++i) {
            char ch = A.charAt(i);
            if (ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                count += (len - i);
            }
        }
        return count;
    }
}
