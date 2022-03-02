package online_class.assignments.class10;

import java.util.List;

public class SingleNumber {
    public int singleNumber(final List<Integer> A) {
        int num = 0;
        for (int element : A) {
            num = num ^ element;
        }
        return num;
    }
}
