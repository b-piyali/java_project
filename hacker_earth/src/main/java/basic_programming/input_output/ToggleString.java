package basic_programming.input_output;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            int len = str.length();
            for (int i = 0; i < len; i++) {
                int chNum = str.charAt(i);
                if (chNum >= 65 && chNum <= 90) {
                    System.out.print((char) (chNum + 32));
                } else {
                    System.out.print((char) (chNum - 32));
                }
            }
        }
    }
}
