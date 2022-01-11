package show_primer;

import java.util.Scanner;

public class MinTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();
            int minNum = firstNum < secondNum ? firstNum : secondNum;
            System.out.println(minNum);
        }
    }
}
