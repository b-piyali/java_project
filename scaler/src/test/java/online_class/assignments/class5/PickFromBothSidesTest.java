package online_class.assignments.class5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PickFromBothSidesTest {
    PickFromBothSides pick = new PickFromBothSides();

    @Test
    public void solveTest1() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5, -2, 3, 1, 2));
        assertEquals(pick.solve(a, 3), 8);
    }

    @Test
    public void solveTest2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(pick.solve(a, 1), 2);
    }
}
