package interviewPreparationKit.warmupChallenges.countingValleys.months_preparation_kit.week1;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Integer::compare);
        long maxSum = 0;
        long minSum = 0;
        int len = arr.size();
        for (int i = 0; i < len - 1; i++)
            minSum += arr.get(i);
        for (int i = 1; i < len; i++)
            maxSum += arr.get(i);
        System.out.println(minSum + " " + maxSum);
    }
}
