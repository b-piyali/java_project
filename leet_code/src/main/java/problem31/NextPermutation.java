package problem31;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int len = nums.length;
        int left = len - 2;
        /**
         * from left to right, search for the first one which is smaller than the right digit.
         */
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }

        /**
         *  If the one exists, search a one which is larger than it from right to left.
         */
        if (left >= 0) {
            int right = len - 1;
            while (right >= 0 && nums[left] >= nums[right]) {
                right--;
            }
            /**
             * swap them.
             */
            swap(nums, left, right);
        }

        /**
         *  flip the right to make the number smaller.
         */
        reverse(nums, left + 1);
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void reverse(int[] nums, int low) {
        int left = low;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
