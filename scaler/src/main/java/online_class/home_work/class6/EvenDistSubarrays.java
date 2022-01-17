package online_class.home_work.class6;

import java.util.ArrayList;

public class EvenDistSubarrays {
    public String solve(ArrayList<Integer> A) {
        int len = A.size();
        if (len % 2 == 0 && A.get(0) % 2 == 0 && A.get(len - 1) % 2 == 0)
            return "YES";
        return "NO";
    }
}
