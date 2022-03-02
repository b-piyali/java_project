package show_primer;

import java.util.Scanner;

public class OddGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            for (int i = 1; i < num; i++) {
                if ((i & 1) == 1) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
