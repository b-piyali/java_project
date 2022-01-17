package online_class.home_work.class5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeEqualityTest {
    TimeEquality timeEquality = new TimeEquality();

    @Test
    public void solveTest1() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 1, 3, 2));
        assertEquals(timeEquality.solve(nums), 8);
    }
}
