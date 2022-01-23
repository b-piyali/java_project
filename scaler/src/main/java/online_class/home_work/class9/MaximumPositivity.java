package online_class.home_work.class9;

import java.util.ArrayList;

public class MaximumPositivity {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxLen = 0;
        int endInd = 0;
        int count = 0;
        for (int i = 0; i < A.size(); ++i) {
            if (A.get(i) > 0) {
                count++;
                if (count > maxLen) {
                    endInd = i;
                    maxLen = count;
                }
            } else {
                count = 0;
            }
        }
        if (maxLen == A.size())
            return A;
        for (int i = maxLen; i > 0; --i) {
            list.add(A.get(endInd));
            endInd--;
        }
        reverseRows(maxLen, list);
        return list;
    }

    private void reverseRows(int colLen, ArrayList<Integer> rows) {
        int i = 0;
        int j = colLen - 1;
        while (i < j) {
            int temp = rows.get(i);
            rows.set(i, rows.get(j));
            rows.set(j, temp);
            ++i;
            --j;
        }
    }
}
