package online_class.assignments.class4;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int testCase = sc.nextInt();
            for (int j = 0; j < testCase; ++j) {
                boolean isMatched = false;
                int len = sc.nextInt();
                int[] nums = new int[len];
                for (int i = 0; i < len; ++i) {
                    nums[i] = sc.nextInt();
                }
                int matchInt = sc.nextInt();
                for (int i = 0; i < len; ++i) {
                    if (nums[i] == matchInt) {
                        isMatched = true;
                        break;
                    }
                }
                if (isMatched)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }
    }
}
