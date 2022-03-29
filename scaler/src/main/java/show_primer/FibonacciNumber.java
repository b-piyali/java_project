package show_primer;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if(num == 0)
                System.out.println(0);
            if(num == 1)
                System.out.println(1);
            int f1 = 0;
            int f2 = 1;
            int fib = 0;
            for (int i = 2; i <= num; ++i) {
                fib = f1 + f2;
                f1 = f2;
                f2 = fib;
            }
            System.out.println(fib);
        }
    }
    private int fibonaccy(int n) {
        if(n < 2)
            return 1;
        return (n-1) + (n-2);
    }

}
