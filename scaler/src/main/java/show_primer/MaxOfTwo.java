package show_primer;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();
            int max = Math.max(firstNum, secondNum);
            System.out.println(max);
        }
    }
}
