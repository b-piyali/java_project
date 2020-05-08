package _30_day_challenge.week2.day13;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int maxLen = 1;
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            int mn = nums[i], mx = nums[i];
            for (int j = i + 1; j < size; j++) {
                mn = min(mn, nums[j]);
                mx = max(mx, nums[j]);
                if ((mx - mn) == j - i)
                    maxLen = max(maxLen, mx - mn + 1);
            }
        }
        return maxLen;
    }

    private int min(int x, int y) {
        return (x < y) ? x : y;
    }

    private int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
