package online_class.home_work.class7;

import java.util.ArrayList;

public class AlternatingSubarraysEasy {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        int prev = A.get(0);
        int count = 0;
        if (B == 0) {
            result.add(0);
        }
        for (int i = 1; i < A.size(); i++) {
            if (prev != A.get(i)) {
                count++;
                if (count >= (2 * B)) {
                    result.add(i - B);
                }
                prev = A.get(i);
            } else {
                if (B == 0) {
                    result.add(i);
                }
                count = 0;
            }
        }
        return result;
    }
}
