

// created by:bandypiy

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            long sum = nums[i] + nums[j];
            if (sum == target)
                return new int[]{i, j};
            if (sum < target)
                i++;
            else
                j--;
        }
        return null;
    }
}
