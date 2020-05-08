package Statistics.Day1.quartiles;

import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {
    public static void main(String[] args) {
        /* read input */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        /* Sort array: O(n log n) runtime */
        Arrays.sort(array);

        System.out.println(median(array, 0, size/2-1));
        System.out.println(median(array, 0, size-1));
        System.out.println(median(array, (size+1)/2, size-1));
    }

    private static int median(int[] array,int start, int end) {
        if ((end - start) % 2 == 0) { // odd number of elements
            return (array[(end + start) / 2]);
        } else { // even number of elements
            int value1 = array[(end + start) / 2];
            int value2 = array[(end + start) / 2 + 1];
            return Math.round((value1 + value2) / 2);
        }
    }
}
