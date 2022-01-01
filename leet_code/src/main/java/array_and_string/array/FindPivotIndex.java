package array_and_string.array;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        for (int j = 0; j < nums.length; j++) {
            if (leftSum == (sum - leftSum - nums[j])) {
                return j;
            }
            leftSum += nums[j];
        }
        return -1;
    }
}
