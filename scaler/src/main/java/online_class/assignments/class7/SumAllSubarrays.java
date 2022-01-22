package online_class.assignments.class7;

import java.util.ArrayList;

public class SumAllSubarrays {
    public Long subarraySum(ArrayList<Integer> A) {
        long sum = 0L;
        int len = A.size();
        for (int i = 0; i < len; ++i) {
            long contri = (long) A.get(i) * (i + 1) * (len - i);
            sum += contri;
        }
        return sum;
    }
}
