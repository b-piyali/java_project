package basic_programming.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            if (str.length() <= 100)
                usingArray(str);
        }
    }

    private static void usingArray(String str) {
        int[] counter = new int[10];
        for(char ch: str.toCharArray()){
            counter[ch] += 1;
        }
        for (int i = 0; i < 10; i++)
            System.out.printf("%d %d%n", i, counter[i]);
    }

    private static void usingHashMap(int N) {
        Map<Integer, Integer> countDigit = new HashMap<>();
        for (int i = 0; i < 10; i++)
            countDigit.put(i, 0);

        while (N != 0) {
            int rem = N % 10;
            countDigit.put(rem, countDigit.get(rem) + 1);
            N = N / 10;
        }

        countDigit.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
