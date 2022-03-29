package online_class.arrays;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) {
                nums[i] = sc.nextInt();
            }
            for (int num : nums) {
                maxNum = Math.max(maxNum, num);
                minNum = Math.min(minNum, num);
            }
            System.out.println(maxNum + " " + minNum);
        }
    }

}
