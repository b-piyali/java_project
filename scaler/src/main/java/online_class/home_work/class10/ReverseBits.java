package online_class.home_work.class10;

public class ReverseBits {
    public long reverse(long a) {
        long rev = 0;
        for (int i = 0; i < 32; i++, a >>= 1)
            rev = (rev << 1) | (a & 1);

        return rev;
    }
}
