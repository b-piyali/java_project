package october_challenge;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length <= 1) return true;

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (max < i) return false;

            if (max >= nums.length - 1) break;

            max = Math.max(max, i + nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0};
        boolean flag = canJump(nums);
        System.out.println("hi " + flag);
    }
}
