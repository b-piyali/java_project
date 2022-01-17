package online_class.home_work.class6;

public class AmazingSubarrays {
    public int solve(String A) {
        int count = 0;
        int ans = 0;
        for (char ch : A.toCharArray()) {
            if (ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                count++;
            }
            ans = ans + count;
        }
        return ans % 10003;
    }
}
