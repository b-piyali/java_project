import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Hallo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntFunction<Boolean> isEven = (e -> e%2 == 0);
        Function<Integer, Integer> doubleVal = (a) -> a*2 ;
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;

        int result = Arrays.stream(numbers)
                .filter(e -> e%2 == 0)
                .map(a -> a*2)
                .reduce(0, Integer::sum);

        System.out.println(result);
        //ArrayList

        /*Scanner scanner = new Scanner(System.in);
        int initialHour = scanner.nextInt();
        int initialMinuite = scanner.nextInt();
        int initialSecond = scanner.nextInt();
        int nextHour = scanner.nextInt();
        int nextMinuite = scanner.nextInt();
        int nextSecond = scanner.nextInt();

        int second = 0;
        second += (nextSecond - initialSecond);
        second += (60 * (nextMinuite - initialMinuite));
        second += (60 * 60 * (nextHour - initialHour));

        System.out.println(second);*/


    }

        /*


        //snail:vertical climb
        int height = scanner.nextInt();
        int climb = scanner.nextInt();
        int slide = scanner.nextInt();
        System.out.println(((height - climb) + (climb - slide) - 1) / (climb - slide) + 1);*/



    public static int getNumberOfMaxParam(int a, int b, int c) {

        IntFunction<Boolean> isEven = (e -> e%2 == 0);

        if (a > b && a > c) {
            return 1;
        } else if (b > a && b > c) {
            return 2;
        } else if (c > a && c > b) {
            return 3;
        }
        return 0;
    }

    private static boolean isVowel(char ch) {
        return isA(ch) || isE(ch) || isI(ch) || isO(ch) || isU(ch);
    }

    private static boolean isA(char ch) {
        return (ch == 'a' || ch == 'A');
    }

    private static boolean isE(char ch) {
        return (ch == 'e' || ch == 'E');
    }

    private static boolean isI(char ch) {
        return (ch == 'i' || ch == 'I');
    }

    private static boolean isO(char ch) {
        return (ch == 'o' || ch == 'O');
    }

    private static boolean isU(char ch) {
        return (ch == 'u' || ch == 'U');
    }
}
