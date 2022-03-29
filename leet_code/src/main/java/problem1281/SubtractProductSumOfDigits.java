package problem1281;

public class SubtractProductSumOfDigits {
    public int subtractProductAndSum(int n) {
        long product = 1;
        long sum = 0;
        while (n > 0) {
            int mod = n % 10;
            product *= mod;
            sum += mod;
            n = n / 10;
        }
        return (int) (product - sum);
    }
}
