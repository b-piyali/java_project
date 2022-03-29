package online_class.bit_manipulations;

/**
 * Problem Description
 * Given an integer A.
 * Two numbers, X and Y, are defined as follows:
 *
 * X is the greatest number smaller than A such that the XOR sum of X and A is the same as the sum of X and A.
 * Y is the smallest number greater than A, such that the XOR sum of Y and A is the same as the sum of Y and A.
 * Find and return the XOR of X and Y.
 *
 * NOTE 1: XOR of X and Y is defined as X ^ Y where '^' is the BITWISE XOR operator.
 *
 * NOTE 2: Your code will be run against a maximum of 100000 Test Cases.
 */

public class StrangeEquality {
    public int solve(int A) {
        int checkIndex = 0;
        for (int i = 30; i >= 0; --i) {
            if (checkBit(A, i)) {
                checkIndex = i;
                break;
            }
        }
        int y = 1 << (checkIndex + 1);
        int x = 0;
        for (int i = checkIndex - 1; i >= 0; --i) {
            if (!checkBit(A, i)) {
                x += (1 << i);
            }
        }
        return x ^ y;
    }

    private boolean checkBit(int num, int index) {
        return (((num >> index) & 1) == 1);
    }
}
