package problemSolving.algorithms.warmup.plusMinus;

import java.util.Scanner;

public class PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int len = arr.length;
        int zeroCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        for(int i=0; i<len; i++){
            if(arr[i] == 0)
                zeroCount++;
            else if(arr[i]<=0)
                negativeCount++;
            else
                positiveCount++;
        }

        System.out.printf("%6f",positiveCount/Double.valueOf(len));
        System.out.println();
        System.out.printf("%6f",negativeCount/Double.valueOf(len));
        System.out.println();
        System.out.printf("%6f",zeroCount/Double.valueOf(len));
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
