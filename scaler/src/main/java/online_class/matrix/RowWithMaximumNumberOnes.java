package online_class.matrix;

import java.util.ArrayList;

public class RowWithMaximumNumberOnes {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int rowLen = A.size();
        int maxOneIndex = 0;
        int maxOneCount = 0;
        for (int i = 0; i < rowLen; ++i) {
            ArrayList<Integer> rows = A.get(i);
            int oneCount = 0;
            for (int num : rows) {
                if (num == 1)
                    oneCount++;
            }
            if (maxOneCount < oneCount) {
                maxOneCount = oneCount;
                maxOneIndex = i;
            }
        }
        return maxOneIndex;
    }
}
