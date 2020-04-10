package problem69;// created by: bandypiy
// Date: 10/16/2018

public class Sqrtx {
    public int mySqrt(int x) {
        //return ((int)Math.sqrt((double)x));
        if (x == 0) {
            return 0;
        }
        int i = 1, j = x;
        while (i + 1 < j) {
            int mid = i + ((j - i) >> 1);
            if (mid == x / mid) {
                return mid;
            }
            if (mid < x / mid) {
                i = mid;
            }
            else {
                j = mid;
            }
        }
        if (j < x / j) {
            return j;
        }
        return i;
    }

    public static void main(String[] args) {
        int x=8;
        Sqrtx  sqrtx = new Sqrtx();
        System.out.println(sqrtx.mySqrt(x));
    }
}
