package days_of_code.day11;// created by: bandypiy
// Date: 10/9/2018

import java.util.Scanner;

public class Arrays2D {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(maxSum(arr));
        scanner.close();
    }

    private static int maxSum(int[][] arr){
        int maxSum=Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {
                sum = arr[i][j] + arr[i][j+1] +arr[i][j+2] + arr[i+1][j+1] +arr[i+2][j] + arr[i+2][j+1] +arr[i+2][j+2];
                if(maxSum < sum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }
}
