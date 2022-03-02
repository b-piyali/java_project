package show_primer;

import java.util.ArrayList;

public class SumAdjacentElementsEven {
    public int solve(ArrayList<Integer> A) {
        int oddCount = 0;
        int evenCount = 0;
        for (int num : A) {
            if ((num & 1) == 0)
                evenCount++;
            else
                oddCount++;
        }
        return Math.min(evenCount, oddCount);
    }
}
