package online_class.assignments.class5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOddEvenIndexedTest {
    SumOddEvenIndexed sumOddEvenIndexed = new SumOddEvenIndexed();

    @Test
    public void solveTest1() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 1, 6, 4));
        assertEquals(sumOddEvenIndexed.solve(nums), 1);
    }

    @Test
    public void solveTest2() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 1));
        assertEquals(sumOddEvenIndexed.solve(nums), 3);
    }
}
