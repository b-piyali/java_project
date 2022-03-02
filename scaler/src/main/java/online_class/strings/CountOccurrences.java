package online_class.strings;

public class CountOccurrences {
    public int solve(String A) {
        String str = "bob";
        return count(A, str, A.length(), str.length());
    }

    private int count(String str1, String str2, int m, int n) {
        if (m == 1 && n == 1) {
            return (str1.equals(str2)) ? 1 : 0;
        }

        if (m == 0 || n == 0 || n > m) {
            return 0;
        }
        char firstChar = str2.charAt(0);
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == firstChar && str1.length() >= (i + n)) {
                String subStr = str1.substring(i, i + n);
                if (subStr.equals(str2)) {
                    ++count;
                }
            }
        }
        return count;
    }
}
