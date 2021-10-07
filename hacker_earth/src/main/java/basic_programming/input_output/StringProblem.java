package basic_programming.input_output;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StringProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numTestCase = Integer.parseInt(s.nextLine());
        String[] name = IntStream.range(0, numTestCase).mapToObj(i -> s.nextLine()).toArray(String[]::new);
        Arrays.stream(name, 0, numTestCase).forEachOrdered(StringProblem::checkString);
    }

    private static void checkString(String s) {
        System.out.println((s.contains("a") || s.contains("A")) &&
                (s.contains("e") || s.contains("E")) &&
                (s.contains("i") || s.contains("I")) &&
                (s.contains("o") || s.contains("O")) &&
                (s.contains("u") || s.contains("U")) ? "lovely string" : "ugly string");
    }
}
