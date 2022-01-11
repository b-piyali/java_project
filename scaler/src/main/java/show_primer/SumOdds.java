package show_primer;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOdds {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println(solve(num));
        }
    }

    private static int solve(int num) {
        return IntStream.range(1, num + 1).filter(i -> i % 2 != 0).reduce(0, Integer::sum);
    }
}
