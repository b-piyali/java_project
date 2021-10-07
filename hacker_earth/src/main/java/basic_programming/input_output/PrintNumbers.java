package basic_programming.input_output;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numOfInt = Integer.parseInt(s.nextLine());
        int[] mumbers = IntStream.range(0, numOfInt).map(i -> s.nextInt()).toArray();
        Arrays.stream(mumbers, 0, numOfInt).mapToObj(i -> i + " ").forEach(System.out::print);
    }
}
