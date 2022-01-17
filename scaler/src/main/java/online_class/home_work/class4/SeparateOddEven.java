package online_class.home_work.class4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int noTest = sc.nextInt();
            for (int i = 0; i < noTest; ++i) {
                // reading input arrays
                int len = sc.nextInt();
                int[] nums = new int[len];
                for (int j = 0; j < len; ++j) {
                    nums[j] = sc.nextInt();
                }
                //processing arrays
                separateOddEven(nums);
            }
        }
    }

    private static void separateOddEven(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        for (int n : even)
            System.out.print(n + " ");
        System.out.println();
        for (int n : odd)
            System.out.print(n + " ");
    }
}
