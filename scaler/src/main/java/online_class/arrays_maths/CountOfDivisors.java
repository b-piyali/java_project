package online_class.arrays_maths;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an array of integers A, find and return the count of divisors of each element of the array.
 * <p>
 * NOTE: The order of the resultant array should be the same as the input array.
 */

public class CountOfDivisors {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> divisor = new ArrayList<>();
        for (int num : A) {
            int count = findFactor(num);
            divisor.add(count);
        }
        return divisor;
    }

    private static int findFactor(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        return (n % Math.sqrt(n)) == 0 ? count - 1 : count;
    }
}
