package array_and_string.array;

public class LargestNumberTwiceOthers {
    public int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int maxIndex = 0;
        int maxVal = Integer.MIN_VALUE;
        int secondMax = maxVal;
        for (int i = 0; i < len; i++) {
            if (maxVal <= nums[i]) {
                maxIndex = i;
                secondMax = maxVal;
                maxVal = nums[i];
            } else if (secondMax < nums[i]) {
                secondMax = nums[i];
            }
        }
        if (maxVal >= secondMax * 2)
            return maxIndex;
        return -1;
    }
}
