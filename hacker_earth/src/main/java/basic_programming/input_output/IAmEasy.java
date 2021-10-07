package basic_programming.input_output;

import java.util.Scanner;
import java.util.stream.IntStream;

public class IAmEasy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num > 0 && num <= 5000) {
            IntStream.rangeClosed(1, 10).map(i -> num * i).forEachOrdered(System.out::println);
        }
    }
}
