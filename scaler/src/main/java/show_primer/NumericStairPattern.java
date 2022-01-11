package show_primer;

import java.util.Scanner;

public class NumericStairPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            for (int i = 0; i < num; i++) {
                StringBuilder str = new StringBuilder();
                for (int j = 0; j <= i; j++) {
                    str.append(j + 1);
                    str.append(" ");
                }
                System.out.println(str.toString().trim());
            }
        }
    }
}
