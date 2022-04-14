package online_class.matrix;

import java.util.ArrayList;

public class ColumnSum {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> newList = new ArrayList<>();
        int width = A.get(0).size();
        for (int i = 0; i <width; ++i) {
            int sum = 0;
            for (ArrayList<Integer> integers : A) {
                sum += integers.get(i);
            }
            newList.add(sum);
        }
        return newList;
    }
}
