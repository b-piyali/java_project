package basic_programming.input_output;

import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int numArrayA;
            long ans = 1;
            long factor = (long) (Math.pow(10, 9) + 7);
            // Read numArray1
            for (int i = 0; i < N; i++) {
                numArrayA = s.nextInt();
                ans =  (ans * numArrayA) % factor;
            }
            System.out.println(ans);
        }
    }
}
