package Statistics.Day0.meanmedianmode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MeanMedianMode {
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

        double mean = mean(array);
        double median = median(array);
        int mode = mode(array);

        /* Print results */
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
    }

    private static int mode(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxOccurrences = 0;
        int mode = Integer.MAX_VALUE;
        for (int num : array) {
            map.merge(num, 1, Integer::sum);
            int occurrences = map.get(num);
            if (occurrences > maxOccurrences || (occurrences == maxOccurrences && num < mode)) {
                maxOccurrences = occurrences;
                mode = num;
            }
        }
        return mode;
    }

    private static double median(int[] array) {
        double median;
        int size = array.length;
        if (size % 2 == 0) {
            median = (array[size / 2 - 1] + array[size / 2]) / 2.0;
        } else {
            median = array[size / 2];
        }
        return median;
    }

    private static double mean(int[] array) {
        int size = array.length;
        int total = 0;
        for (int num : array) {
            total += num;
        }
        double mean = (double) total / size;

        return  mean;
    }
}
