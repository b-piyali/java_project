package online_class.home_work.class1;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                if (isArmstrong(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean isArmstrong(int n) {
        int originalNumber = n;
        int result = 0;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        return result == n;
    }
}
