package Statistics.Day1.standardDeviation;

import java.util.Arrays;
import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++)
            array[i] = sc.nextInt();
        sc.close();
        /* Sort array: O(n log n) runtime */
        Arrays.sort(array);

        System.out.println(standardDeviation(array,size));
    }

    private static double standardDeviation(int[] array, int size) {
        double sd;
        double mean = mean(array, size);
        double sub;
        double sum =0;
        for(int i=0; i<size; i++){
            sub = mean - array[i];
            sum += (sub * sub);
        }
        sd = Math.sqrt(sum / size);
        return sd;
    }

    private static double mean(int[] array, int size) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        double mean = (double) total / size;

        return  mean;
    }
}
