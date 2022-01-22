package online_class.home_work.class7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GoodSubarraysEasyTest {
    GoodSubarraysEasy goodSubarrays = new GoodSubarraysEasy();

    @Test
    public void solveTest1(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(goodSubarrays.solve(nums, 4), 6);
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9));
        assertEquals(goodSubarrays.solve(nums, 65), 36);
    }
}
