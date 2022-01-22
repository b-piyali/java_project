package online_class.home_work.class8;

import java.util.ArrayList;
import java.util.Objects;

public class AreMatricesSame {
    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int aSize = A.size();
        int bSize = B.size();
        if (aSize != bSize)
            return 0;

        int aColLen = A.get(0).size();
        int bColLen = B.get(0).size();
        if (aColLen != bColLen)
            return 0;

        for (int i = 0; i < aSize; ++i) {
            for (int j = 0; j < aColLen; ++j) {
                if (!Objects.equals(A.get(i).get(j), B.get(i).get(j)))
                    return 0;
            }
        }
        return 1;
    }
}
