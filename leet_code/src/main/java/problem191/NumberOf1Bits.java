package problem191;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; ++i) {
            if (checkBit(n, i))
                count++;
        }
        return count;
    }

    private boolean checkBit(int i, int j) {
        return ((i >> j) & 1) == 1;
    }
}
