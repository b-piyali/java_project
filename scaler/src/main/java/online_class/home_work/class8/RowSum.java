package online_class.home_work.class8;

import java.util.ArrayList;

public class RowSum {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> newList = new ArrayList<>();
        int width = A.get(0).size();
        A.forEach(integers->{
            int sum = 0;
            for (int i = 0; i < width; ++i) {
                sum += integers.get(i);
            }
            newList.add(sum);
        });
        return newList;
    }
}
