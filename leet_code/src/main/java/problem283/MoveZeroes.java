package problem283;

public class MoveZeroes {
    public void moveZeroes1(int[] nums) {
        int zIndex = -1;
        int nonZIndex = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                if (zIndex < 0 || nums[zIndex] != 0)
                    zIndex = i;
            } else {
                nonZIndex = i;
            }
            if (nonZIndex > zIndex) {
                int temp = nums[zIndex];
                nums[zIndex] = nums[nonZIndex];
                nums[nonZIndex] = temp;
                temp = nonZIndex;
                nonZIndex = zIndex;
                if (nums[zIndex + 1] == 0)
                    zIndex++;
                else
                    zIndex = temp;
            }
        }
    }

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[j] = num;
                j++;
            }
        }
        while (j < n) {
            nums[j] = 0;
            j++;
        }
    }
}
