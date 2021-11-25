package array.game1d;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long maxval = Long.MIN_VALUE;
        long minval = Long.MAX_VALUE;
        long sum = 0L;
        for (int j : arr) {
            sum = sum + j;
            if (maxval < j) {
                maxval = (long) j;
            }
            if (minval > j) {
                minval = (long) j;
            }
        }
        System.out.println((sum-maxval) +" "+(sum-minval));
    }
}
