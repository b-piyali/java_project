package october_challenge;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        return fib(n + 1);
    }

    private static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(36));
    }
}
