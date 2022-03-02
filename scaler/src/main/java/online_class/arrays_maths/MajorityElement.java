package online_class.arrays_maths;

import java.util.List;

public class MajorityElement {
    public int majorityElement(final List<Integer> A) {
        if (A.size() == 0)
            return 0;
        int count = 0;
        int mejorEle = A.get(0);
        for (int num : A) {
            if (count == 0) {
                count++;
                mejorEle = num;
            } else if (mejorEle != num) {
                count--;
            } else {
                count++;
            }
        }
        count = 0;
        for (int num : A) {
            if (num == mejorEle)
                count++;
        }
        if (count > (A.size() / 2))
            return mejorEle;
        else
            return 0;
    }
}
