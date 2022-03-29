package online_class.bit_manipulations;

import java.util.ArrayList;

public class SingleNumberTwice {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xorVal = 0;
        for (int num : A) {
            xorVal ^= num;
        }
        int checkIndex = getCheckIndex(xorVal);
        return findMissingNumbers(A, checkIndex);
    }

    private ArrayList<Integer> findMissingNumbers(ArrayList<Integer> A, int checkIndex) {
        ArrayList<Integer> result = new ArrayList<>();
        int set = 0;
        int unSet = 0;
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

    private boolean checkBit(int xorVal, int i) {
        return (((xorVal >> i) & 1) == 1);
    }
}
