package ds.array.subarray;

import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int negArr = negativeArray(arr, size);
        System.out.println(negArr);
    }

    private static int negativeArray(int[] array, int size) {
        int count = 0;
        for (int i = 0; i <size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
