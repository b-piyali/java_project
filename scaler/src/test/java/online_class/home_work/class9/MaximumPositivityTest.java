package online_class.home_work.class9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumPositivityTest {
    MaximumPositivity maxPositivity = new MaximumPositivity();

    @Test
    public void solveTest1() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 6, -1, 7, 8));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(5, 6));
        assertEquals(maxPositivity.solve(list), result);
    }

    @Test
    public void solveTest2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(maxPositivity.solve(list), result);
    }
}
