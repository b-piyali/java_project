package show_primer;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            for (int i = num; i > 0; i--) {
                StringBuilder str = new StringBuilder();
                for (int j = i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
