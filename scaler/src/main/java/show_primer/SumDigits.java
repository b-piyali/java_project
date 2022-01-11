package show_primer;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] nums = new int[t];
        for (int i = 0; i < t; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            System.out.println(sumDigit(nums[i]));
        }
    }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
}
