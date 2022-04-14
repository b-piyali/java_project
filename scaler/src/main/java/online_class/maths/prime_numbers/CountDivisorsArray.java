package online_class.maths.prime_numbers;

import java.util.HashMap;
import java.util.Map;

public class CountDivisorsArray {
    public int[] solve(int[] A) {
        int[] output = new int[A.length];
        int[] primeFactorList = getSmallestPrimeFactor();
        for (int i = 0; i < A.length; i++) {
            output[i] = countDivisor(primeFactorList, A[i]);
        }
        return output;
    }

    private int countDivisor(int[] primeFactorList, int num) {
        int count = 1;

        Map<Integer, Integer> factorFrequency = getFactorFrequency(num, primeFactorList);

        for (Map.Entry<Integer, Integer> entry : factorFrequency.entrySet()) {
            count = count * (entry.getValue() + 1);
        }
        return count;
    }

    private Map<Integer, Integer> getFactorFrequency(int num, int[] primeFactorList) {
        Map<Integer, Integer> factorFrequency = new HashMap<>();
        while (num > 1) {
            int val = primeFactorList[num];
            factorFrequency.merge(val, 1, Integer::sum);
            num = num / val;
        }
        return factorFrequency;
    }

    private static int[] getSmallestPrimeFactor() {
        int num = 1000000;
        int[] countList = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            countList[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (countList[i] == i) {
                for (int j = i * i; j <= num; j = j + i) {
                    if (countList[j] == j) {
                        countList[j] = i;
                    }
                }
            }
        }
        return countList;
    }
}
