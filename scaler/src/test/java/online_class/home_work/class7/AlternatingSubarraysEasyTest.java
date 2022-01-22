package online_class.home_work.class7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlternatingSubarraysEasyTest {
    AlternatingSubarraysEasy altSubarrays = new AlternatingSubarraysEasy();

    @Test
    public void solveTest1() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 0, 1, 0, 1));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(altSubarrays.solve(nums, 1), result);
    }

    @Test
    public void solveTest2() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0, 0, 0, 1, 1, 0, 1));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
        assertEquals(altSubarrays.solve(nums, 0), result);
    }
}
