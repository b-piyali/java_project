package online_class.assignments.class4;

import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int len = sc.nextInt();
            int[] nums = new int[len];
            for (int i = 0; i < len; ++i) {
                nums[i] = sc.nextInt();
            }
            int rotate = sc.nextInt();
            rotate = rotate % len;
            if (rotate != 0) {
                //reverse the array
                nums = reverseNum(nums, 0, len - 1);
                nums = reverseNum(nums, 0, rotate - 1);
                nums = reverseNum(nums, rotate, len - 1);
            }
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }

    private static int[] reverseNum(int[] nums, int from, int to) {
        while (from < to) {
            int temp = nums[from];
            nums[from] = nums[to];
            nums[to] = temp;
            from++;
            to--;
        }
        return nums;
    }
}
