package online_class.bit_manipulations;

public class NumberOf1Bits {
    public int numSetBits1(int A) {
        int count = 0;
        while (A != 0) {
            if ((A & 1) == 1) {
                count++;
            }
            A /= 2;
        }
        return count;
    }

    public int numSetBits(int A) {
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if (((A >> i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }
}
