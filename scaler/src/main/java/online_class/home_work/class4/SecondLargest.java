package online_class.home_work.class4;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            for (int i = 0; i < test; ++i) {
                int len = sc.nextInt();
                int[] nums = new int[len];
                int maxNum = Integer.MIN_VALUE;
                int secondMax = -1;
                for (int j = 0; j < len; j++) {
                    nums[j] = sc.nextInt();
                }
                if (len < 2)
                    System.out.println(-1);
                for (int num : nums) {
                    if (num >= maxNum) {
                        secondMax = maxNum;
                        maxNum = num;
                    } else if (num > secondMax)
                        secondMax = num;
                }
                System.out.println(secondMax);
            }
        }
    }
}
