package Statistics.Day0.weightedmean;

import java.util.Scanner;

public class WeightedMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] weight = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            weight[i] = sc.nextInt();
        }
        sc.close();

        double wm = weightedMean(arr, weight, size);
        System.out.println(wm);
    }

    private static double weightedMean(int[] arr, int[] weight, int size) {
        double totalWeights=0.0;
        double total = 0.0;
        for(int i=0; i<size; i++){
            total = total+ (arr[i] * weight[i]);
            totalWeights = totalWeights +weight[i];
        }
        double wm = total / totalWeights ;

        return wm;
    }

}
