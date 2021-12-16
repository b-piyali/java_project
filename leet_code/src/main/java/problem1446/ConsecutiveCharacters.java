package problem1446;

public class ConsecutiveCharacters {
    public static int maxPower(String s) {
        if ("".equals(s) || s == null) {
            return 0;
        }
        int maxCount = 1;
        int count = 1;
        char prevChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (prevChar == currChar) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Integer.max(maxCount, count);
            prevChar = currChar;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String s = "t";
        System.out.println(maxPower(s));
    }
}
