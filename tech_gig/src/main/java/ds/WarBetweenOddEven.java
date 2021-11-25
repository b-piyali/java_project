package ds;

import java.util.Scanner;

public class WarBetweenOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

            if (nums[i] % 2 == 0)
                evenSum += nums[i];
            else
                oddSum += nums[i];
        }

        if (evenSum > oddSum)
            System.out.println("Even");
        else if (evenSum < oddSum)
            System.out.println("Odd");
        else
            System.out.println("Tied");
    }

    /*public void run(){
        for(int )
    }*/
}
