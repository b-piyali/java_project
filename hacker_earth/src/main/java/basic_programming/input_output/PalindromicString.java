package basic_programming.input_output;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            //String original, reverse = "";
            String original = s.nextLine();
            /*int length = original.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse += original.charAt(i);
            System.out.println(original.equals(reverse) ? "YES" : "NO");*/
            boolean isPalindrome = true;
            int len = original.length() / 2;
            for (int i = 0; i < len; i++) {
                if (original.charAt(i) != original.charAt(original.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println(isPalindrome ? "YES" : "NO");
        }
    }
}
