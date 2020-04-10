package _30_day_challenge.week1.day2;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number n is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1
 * (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 *
 * Return True if n is a happy number, and False if not.
 *
 * Example:
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2(1*1) + 9^2(9*9) = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        if (n < 1)
            return false;

        Set<Integer> uniqueNum = new HashSet<>();
        while(uniqueNum.add(n)){
            n = squareSum(n);
            if(n == 1)
                return true;
        }
        return false;
    }

    private int squareSum(int n) {
        int sqSum = 0;
        int num;
        while (n != 0) {
            num = n % 10;
            sqSum += num * num;
            n /= 10;
        }
        return sqSum;
    }
}
