package online_class.assignments.class1;

import java.util.Scanner;

public class IsItPerfect {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (isPerfect(nums[i])) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static boolean isPerfect(int num) {
        /*int sumFactor = IntStream.range(1, (int) Math.sqrt(num) + 1)
                .filter(i -> num % i == 0)
                .sum();*/
        int sumFactor = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sumFactor = sumFactor + i + (num / i);
            }
        }
        return num == sumFactor;
    }
}
