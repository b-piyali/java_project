package problem1015;

public class SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0)
            return -1;
        int i = 1;
        for (int n = 1; n % k != 0; i++) {
            n %= k;
            n = n * 10 + 1;
        }
        return i;
    }
}
