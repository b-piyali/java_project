package java.advance.lambda_example;

public class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return i -> i % 2 != 0;
    }

    public PerformOperation isPrime() {
        /*return number -> IntStream
                .rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);*/
        return number -> java.math.BigInteger.valueOf(number).isProbablePrime(1);
    }

    public PerformOperation isPalindrome() {
        /*return number -> IntStream.range(0, String.valueOf(number).length() / 2)
                .noneMatch(i ->
                        String.valueOf(number).charAt(i) != String.valueOf(number).charAt(
                                String.valueOf(number).length() - i - 1));*/
        //return number -> Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString());
        return number -> String.valueOf(number).equals(new StringBuilder(String.valueOf(number)).reverse().toString());


    }
}
