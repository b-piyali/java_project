package online_class.assignments.class1;

import java.util.Scanner;

public class SummationGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum = (num * (num + 1)) / 2;
            System.out.println(sum);
        }
    }
}
