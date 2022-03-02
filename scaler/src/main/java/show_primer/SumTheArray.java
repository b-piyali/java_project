package show_primer;

import java.util.Scanner;

public class SumTheArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < num; i++) {
                int n = sc.nextInt();
                sum += n;
            }
            System.out.println(sum);
        }
    }
}
