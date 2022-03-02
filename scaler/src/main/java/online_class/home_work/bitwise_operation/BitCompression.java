package online_class.home_work.bitwise_operation;

import java.util.ArrayList;

public class BitCompression {
    public int compressBits(ArrayList<Integer> A) {
        int bit = 0;
        int i = 0;
        int j = 1;
        while ((i < j) & (j<A.size())) {
            int first = A.get(i);
            int second = A.get(j);
            A.set(i, (first & second));
            A.set(j, (first | second));
            i++;
            j++;
        }
        for (int num : A) {
            bit = bit ^ num;
        }
        return bit;
    }
}
