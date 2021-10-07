package basic_programming.input_output;

import java.util.Scanner;

public class TeddyTweety {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(num % 3 == 0 ? "YES" : "NO");
    }
}
