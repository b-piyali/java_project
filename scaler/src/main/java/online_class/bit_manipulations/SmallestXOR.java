package online_class.bit_manipulations;

/**
 * Problem Description
 * <p>
 * Given two integers A and B, find a number X such that
 * A xor X is minimum possible, and the number of set bits in X equals B.
 */

public class SmallestXOR {
    public int solve(int A, int B) {
        int smallXOR = 0;
        for (int i = 30; i >= 0; --i) {
            if (checkBit(A, i) && B != 0) {
                smallXOR += (1 << i);
                B--;
            }
        }
        if (B != 0) {
            for (int i = 0; i < 31; ++i) {
                if (!checkBit(A, i) && B != 0) {
                    smallXOR += (1 << i);
                    B--;
                }
            }
        }
        return smallXOR;
    }

    private boolean checkBit(int num, int index) {
        return (((num >> index) & 1) == 1);
    }
}
