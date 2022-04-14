package online_class.maths.prime_numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Description
 * Given an array of integers A, find and return the count of divisors of each element of the array.
 * <p>
 * NOTE: The order of the resultant array should be the same as the input array.
 */

public class CountDivisors {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<Integer> primeFactorList = getSmallestPrimeFactor(1000000);
        for (int num : A) {
            output.add(countDivisor(primeFactorList, num));
        }
        return output;
    }

    private int countDivisor(ArrayList<Integer> primeFactorList, int num) {
        int count = 1;

        Map<Integer, Integer> factorFrequency = getFactorFrequency(num, primeFactorList);

        for (Map.Entry<Integer, Integer> entry : factorFrequency.entrySet()) {
            count = count * (entry.getValue() + 1);
        }
        return count;
    }

    private Map<Integer, Integer> getFactorFrequency(int num, ArrayList<Integer> primeFactorList) {
        Map<Integer, Integer> factorFrequency = new HashMap<>();
        while (num > 1) {
            int val = primeFactorList.get(num);
            //while (primeFactorList.get(num) == val) {
                factorFrequency.merge(val, 1, Integer::sum);
                num = num / val;
            //}
        }
        return factorFrequency;
    }

    private static ArrayList<Integer> getSmallestPrimeFactor(int num) {
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
