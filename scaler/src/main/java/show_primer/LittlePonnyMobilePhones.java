package show_primer;

import java.util.ArrayList;
import java.util.Collections;

public class LittlePonnyMobilePhones {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.sort(A);
        ArrayList<Integer> maxDistModel = new ArrayList<>();
        for (int amount : B) {
            int count = 0;
            int i = 0;
            while (amount > 0 && i < A.size()) {
                amount -= A.get(i);
                count++;
                i++;
            }
            if (amount < 0)
                count--;
            maxDistModel.add(count);
        }
        return maxDistModel;
    }
}
