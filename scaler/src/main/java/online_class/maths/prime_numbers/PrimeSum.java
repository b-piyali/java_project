package online_class.maths.prime_numbers;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeSum {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> primeList = getPrimes(A + 1);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= A; ++i) {
            if (primeList.get(i) == 0 && primeList.get(A - i) == 0) {
                result.add(i);
                result.add(A - i);
                return result;
            }
        }
        return result;
    }

    private ArrayList<Integer> getPrimes(int num) {
        ArrayList<Integer> primeList = new ArrayList<>(Collections.nCopies((num), 0));
        primeList.set(0, 1);
        primeList.set(1, 1);
        for (int i = 2; i * i < num; ++i) {
            if (primeList.get(i) == 0) {
                for (int j = i * i; j < num; j = j + i) {
                    if (primeList.get(j) == 0) {
                        primeList.set(j, 1);
                    }
                }
            }
        }
        return primeList;
    }
}
