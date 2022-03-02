package online_class.class_work;

import java.util.*;

public class Main {
    static void findThePairs(int[] inputArray, int inputNumber) {
        Arrays.sort(inputArray);
        System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");
        int i = 0;
        int j = inputArray.length - 1;
        while (i < j) {
            if (inputArray[i] + inputArray[j] == inputNumber) {
                System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
                i++;
                j--;
            } else if (inputArray[i] + inputArray[j] < inputNumber) {
                i++;
            } else if (inputArray[i] + inputArray[j] > inputNumber) {
                j--;
            }
        }
    }

    public static int subarraySum(int[] nums, int k) { // leetcode solution
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, List<Integer>> sumToIndex = new HashMap<>();
        sumToIndex.put(0, new ArrayList<>(Collections.singletonList(-1)));
        int sum = 0;
        int count = 0; // answer
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sumToIndex.containsKey(sum - k)) {
                count = count + sumToIndex.get(sum - k).size();
            }
            if (!sumToIndex.containsKey(sum)) {
                sumToIndex.put(sum, new ArrayList<>());
            }
            sumToIndex.get(sum).add(i);
        }
        return count;
    }

    public static void main(String[] args) {
        //findThePairs(new int[]{4, 6, 5, -10, 8, 5, 20, 3, 2}, 10);
        //findVal(0, 10, new int[]{4, 6, 5, -10, 8, 5, 20, 3, 2});
        System.out.println(subarraySum(new int[]{4, 6, 5, 4, 1, -10, 8, 5, 20, 10, 5, 3, 2}, 10));

    }

    private static void findVal(int index, int sum, int[] ar) {
        if (sum == 0)
            return;
        for (int i = index; i < ar.length; ++i) {
            int num = ar[i];
            int remn = sum - num;
            if (remn >= 0) {
                findVal(i + 1, remn, ar);
                System.out.print(ar[i] + " ");
            }
        }
        System.out.println();
    }
}
