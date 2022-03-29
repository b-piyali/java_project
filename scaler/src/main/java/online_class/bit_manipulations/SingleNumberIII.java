package online_class.bit_manipulations;

import java.util.ArrayList;

public class SingleNumberIII {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> newList = new ArrayList<>();
        int xor = 0;
        for (int num : A) {
            xor = xor ^ num;
        }
        xor = xor & -xor;
        int num1 = 0;
        int num2 = 0;
        for (int num : A) {
            if ((xor & num) > 0) {
                num1 = num1 ^ num;
            } else {
                num2 = num2 ^ num;
            }
        }
        if (num2 > num1) {
            newList.add(num1);
            newList.add(num2);
        }else {
            newList.add(num2);
            newList.add(num1);
        }

        return newList;
    }
}
