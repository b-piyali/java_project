package problem1822;

public class SignOfProductArray {
    public int arraySign(int[] nums) {
        int nCount = 0;
        for (int num : nums) {
            if (num == 0)
                return 0;
            else if (num < 0)
                nCount++;
        }
        if ((nCount & 1) == 1)
            return -1;
        return 1;
    }
}
