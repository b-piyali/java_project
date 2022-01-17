package online_class.assignments.class6;

import java.util.ArrayList;

public class Bulbs {
    public int bulbs(ArrayList<Integer> A) {
        int switchPressed = 0;
        int currentState;
        for (int num : A) {
            if (switchPressed % 2 == 0) {
                currentState = num;
            } else {
                currentState = 1 - num;
            }
            if (currentState == 0) {
                switchPressed++;
            }
        }
        return switchPressed;
    }
}
