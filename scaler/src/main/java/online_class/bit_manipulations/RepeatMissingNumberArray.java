package online_class.bit_manipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RepeatMissingNumberArray {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        if (Objects.isNull(A))
            return null;
        int xorVal = 0;
        for (int i = 0; i < A.size(); ++i) {
            xorVal ^= A.get(i);
            xorVal ^= (i + 1);
        }
        int checkIndex = getCheckIndex(xorVal);
        ArrayList<Integer> result = findMissingNumbers(A, checkIndex);
        return result;
    }

    private int getCheckIndex(int xorVal) {
        int checkIndex = 0;
        for (int i = 0; i < 30; ++i) {
            if (checkBit(xorVal, i)) {
                checkIndex = i;
                break;
            }
        }
        return checkIndex;
    }

    private ArrayList<Integer> findMissingNumbers(List<Integer> A, int checkIndex) {
        int set = 0;
        int unSet = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : A) {
            if (checkBit(integer, checkIndex)) {
                set ^= integer;
            } else {
                unSet ^= integer;
            }
        }
        result.add(Math.min(set, unSet));
        result.add(Math.max(set, unSet));
        return result;
    }

    private boolean checkBit(int xorVal, int i) {
        return (((xorVal >> i) & 1) == 1);
    }
}
