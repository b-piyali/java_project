package problem1502;

import java.util.Arrays;

public class CanMakeArithmeticProgressionSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if ((arr[i] - arr[i - 1]) != diff)
                return false;
        }
        return true;
    }
}
