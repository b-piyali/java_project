package online_class.assignments.class1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class IsItPrime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (isPrime(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isPrime(int num) {
        return IntStream.range(2, (int) Math.sqrt(num) + 1)
                .noneMatch(i -> (num % i) == 0);
    }
}
