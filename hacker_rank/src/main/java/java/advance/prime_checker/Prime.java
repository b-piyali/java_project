package java.advance.prime_checker;

import java.util.stream.IntStream;

public class Prime {
    void checkPrime(int... numbers) {
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    boolean isPrime(int number) {
        /*if (n == 2)
            return true;
        if (n < 2 || n % 2 == 0)
            return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;*/

        return IntStream
                .rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }
}
