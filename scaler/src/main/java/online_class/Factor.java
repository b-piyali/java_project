package online_class;

import java.util.stream.IntStream;

public class Factor {
    public int findFactorFirst(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count;
    }

    public static int findFactorSecond(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        return (n % Math.sqrt(n)) == 0 ? count - 1 : count;
    }

/*
    public static int findFactorSecond2(int n) {
        int count = 0;
        int last = (int) (Math.sqrt(n) + 1);
        int reduce = IntStream.range(1, (int) Math.sqrt(n) + 1)
                .filter(i -> (n % i) == 0)
                .reduce(0, (c -> c + 2));

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        return (n % Math.sqrt(n)) == 0 ? count - 1 : count;
    }
*/

    public int findFactorThird(int n) {
        int count = 0;
        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0)
                count += 2;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 100 + 1).reduce(0, Integer::sum));
        System.out.println((int)(Math.log(50) / Math.log(2)));
    }
}
