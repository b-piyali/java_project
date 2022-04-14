package online_class.maths.prime_numbers;

import java.util.ArrayList;

public class LuckyNumbers {
    public int solve(int A) {
        ArrayList<Integer> primeFactorList = getSmallestPrimeFactor(A);
        int result = 0;
        for (int i = 2; i <= A; ++i) {
            int num = i;
            int count = 0;
            while (num > 1) {
                int d = primeFactorList.get(num);
                while (primeFactorList.get(num) == d) {
                    num /= d;
                }
                count++;
            }
            if (count == 2) {
                result++;
            }
        }
        return result;
    }

    private ArrayList<Integer> getSmallestPrimeFactor(int num) {
        ArrayList<Integer> countList = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            countList.add(i);
        }
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (countList.get(i) == i) {
                for (int j = i * i; j <= num; j = j + i) {
                    if (countList.get(j) == j) {
                        countList.set(j, i);
                    }
                }
            }
        }
        return countList;
    }
}
