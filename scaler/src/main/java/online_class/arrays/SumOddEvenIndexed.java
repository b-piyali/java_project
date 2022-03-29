package online_class.arrays;

import java.util.ArrayList;

public class SumOddEvenIndexed {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> oddIndexSum = new ArrayList<>();
        ArrayList<Integer> evenIndexSum = new ArrayList<>();
        int oddSum = 0;
        int eveSum = 0;
        oddIndexSum.add(oddSum);
        evenIndexSum.add(0);
        int len = A.size();

        for (int i = 0; i < len; ++i) {
            if (i % 2 == 0) {
                eveSum += A.get(i);
            } else {
                oddSum += A.get(i);
            }
            evenIndexSum.add(eveSum);
            oddIndexSum.add(oddSum);
        }
        oddSum = 0;
        eveSum = 0;
        int count = 0;
        for (int i = 0; i < len; ++i) {
            oddSum = oddIndexSum.get(i) + evenIndexSum.get(len) - evenIndexSum.get(i + 1);
            eveSum = evenIndexSum.get(i) + oddIndexSum.get(len) - oddIndexSum.get(i + 1);
            if (oddSum == eveSum)
                ++count;
        }
        return count;
    }
}
