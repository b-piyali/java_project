package online_class.arrays;

import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 0;
        int len = A.size() - 1;
        int val = A.get(len);
        if (val < 9) {
            val++;
            A.set(len, val);
        } else {
            carry = 1;
            for (int i = len; i >= 0; i--) {
                val = A.get(i);
                int sum = val + carry;
                if (sum > 9) {
                    val = 0;
                    carry = 1;
                    A.set(i, val);
                } else {
                    carry = 0;
                    A.set(i, sum);
                    break;
                }
            }
        }
        if (carry != 0)
            A.add(0, carry);

        while (A.get(0) == 0)
            A.remove(0);

            return A;

    }
}
