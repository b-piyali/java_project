package online_class.home_work.bitwise_operation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSatisfactionTest {
    MaximumSatisfaction satisfaction = new MaximumSatisfaction();

    @Test
    public void solveTest1() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 15, 4, 14));
        assertEquals(satisfaction.solve(nums), 4);
    }

    @Test
    public void solveTest2() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 7, 15));
        assertEquals(satisfaction.solve(nums), 2);
    }
}
