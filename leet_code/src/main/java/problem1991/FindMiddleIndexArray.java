package problem1991;

public class FindMiddleIndexArray {
    public int findMiddleIndex(int[] nums) {
        int[] p = new int[nums.length];
        p[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            p[i] = p[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if ((p[i] - nums[i]) == (p[nums.length - 1] - p[i])) {
                return i;
            }
        }
        return -1;
    }
}
