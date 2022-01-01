package interviewPreparationKit.warmupChallenges.countingValleys.months_preparation_kit.week1;

import java.util.Arrays;
import java.util.List;

public class BreakingRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxCount = -1;
        int minCount = -1;
        for (int score : scores) {
            if (score > max) {
                maxCount++;
                max = score;
            }
            if (score < min) {
                min = score;
                minCount++;
            }
        }

        return Arrays.asList(maxCount, minCount);
    }
}
