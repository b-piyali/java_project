package Statistics.Day1.interquartileRange;

import java.util.Arrays;
import java.util.Scanner;

public class InterQuartileRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read size of array
        int size = sc.nextInt();
        int[] element = new int[size];
        int[] frequency = new int[size];

        // read element
        for(int i=0; i<size; i++) {
            element[i] = sc.nextInt();
        }

        int totalSize =0;
        // read frequency of each element
        for(int i=0; i<size; i++) {
            frequency[i] = sc.nextInt();
            totalSize += frequency[i];
        }
        sc.close();

        int[] array = new int[totalSize];
        int dataIndex = 0;
        for(int i=0; i<size; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                array[dataIndex] = element[i];
                dataIndex++;
            }
        }

        /* Sort array: O(n log n) runtime */
        Arrays.sort(array);

        double q1Median = median(array, 0, totalSize/2-1);
        double q2Median = median(array, (totalSize+1)/2, totalSize-1);
        System.out.println(q2Median - q1Median);
    }

    private static double median(int[] array,int start, int end) {
        if ((end - start) % 2 == 0) { // odd number of elements
            return (array[(end + start) / 2]);
        } else { // even number of elements
            int value1 = array[(end + start) / 2];
            int value2 = array[(end + start) / 2 + 1];
            return (value1 + value2) / 2.0;
        }
    }
}
