package online_class.assignments.class4;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = A.size() - 1; i >= 0; i--) {
            newList.add(A.get(i));
        }
        return newList;
    }
}
