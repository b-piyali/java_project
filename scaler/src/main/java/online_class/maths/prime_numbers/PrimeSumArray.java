package online_class.maths.prime_numbers;

public class PrimeSumArray {
    public int[] primesum(int A) {
        int[] primeList = new int[A + 1];
        primeList = getPrimes(A + 1);
        for (int i = 2; i <= A; ++i) {
            if (primeList[i] == 0 && primeList[A - i] == 0) {
                return new int[]{i, (A - i)};
            }
        }
        return new int[0];
    }

    private int[] getPrimes(int num) {
        int[] primeList = new int[num];
        for (int i = 0; i <= num; i++) {
            primeList[i] = 0;
        }
        primeList[0] = 1;
        primeList[1] = 1;
        for (int i = 2; i * i < num; ++i) {
            if (primeList[i] == 0) {
                for (int j = i * i; j < num; j = j + i) {
                    if (primeList[j] == 0) {
                        primeList[j] = 1;
                    }
                }
            }
        }
        return primeList;
    }
}
