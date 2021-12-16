package problem198;

import java.util.Arrays;

public class HouseRobber {
    public static int rob(int[] nums) {
        /*int prevNo = 0;
        int prevYes = 0;
        for (int n : nums) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);*/

        return Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(rob(nums));
    }
}
