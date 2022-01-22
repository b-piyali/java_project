package online_class.assignments.class9;

public class LengthLongestConsecutiveOnes {
    public int solve(String A) {
        int count = 0;
        int count1s = 0;
        int len = A.length();
        for (char ch : A.toCharArray()) {
            if (ch == '1') {
                count1s++;
            }
        }
        if (count1s == len) {
            return count1s;
        }
        for (int i = 0; i < len; ++i) {
            if (A.charAt(i) == '0') {
                int left = 0;
                int right = 0;
                for (int j = i - 1; j >= 0; --j) {
                    if (A.charAt(j) == '1') {
                        left++;
                    } else {
                        break;
                    }
                }
                for (int j = i + 1; j < len; ++j) {
                    if (A.charAt(j) == '1') {
                        right++;
                    } else {
                        break;
                    }
                }
                if ((left + right) < count1s) {
                    count = Math.max(count, (left + right + 1));
                } else {
                    count = Math.max(count, (left + right));
                }
            }
        }
        return count;
    }
}
