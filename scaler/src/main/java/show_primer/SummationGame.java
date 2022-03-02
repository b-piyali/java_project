package show_primer;

import java.util.Scanner;

public class SummationGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            //String sc1 = sc.next()
            int sum = 0;
            for (int i = 0; i <= t; ++i) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
