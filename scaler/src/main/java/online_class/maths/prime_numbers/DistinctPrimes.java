package online_class.maths.prime_numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * You have given an array A having N integers. Let say G is the product of all elements of A.
 *
 * You have to find the number of distinct prime divisors of G. *
 */

public class DistinctPrimes {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> primeList = getSmallestPrimeFactor();
        Set<Integer> primeCount = new HashSet<>();
        for (int num : A) {
            while (num > 1) {
                int val = primeList.get(num);
                num /= val;
                primeCount.add(val);
            }
        }
        return primeCount.size();
    }

    private ArrayList<Integer> getSmallestPrimeFactor() {
        int num = (int) (1e5 + 5);
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
