package basic_programming.input_output;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            System.out.println(factorial(N));
        }
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
