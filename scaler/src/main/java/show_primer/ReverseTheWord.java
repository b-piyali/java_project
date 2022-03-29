package show_primer;

import java.util.Scanner;

public class ReverseTheWord {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            String[] str = new String[num];
            for (int i = 0; i < num; i++) {
                str[i] = sc.next();
            }
            for (int i = 0; i < num; i++) {
                for (int j = str[i].length() - 1; j >= 0; --j) {
                    System.out.print(str[i].charAt(j));
                }
                System.out.println();
            }
        }
    }
}
