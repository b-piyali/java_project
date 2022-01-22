package online_class.assignments.class7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayLeastAverageTest {
    SubarrayLeastAverage leastAverage = new SubarrayLeastAverage();

    @Test
    public void solveTest1(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 7, 90, 20, 10, 50, 40));
        assertEquals(leastAverage.solve(nums, 3), 3);
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 7, 5, 20, -10, 0, 12));
        assertEquals(leastAverage.solve(nums, 2), 4);
    }

    @Test
    public void solveTest3(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11));
        assertEquals(leastAverage.solve(nums, 9), 3);
    }

    @Test
    public void solveTest4(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(15, 3, 15, 6, 9, 14, 8, 10, 9, 17));
        assertEquals(leastAverage.solve(nums, 1), 1);
    }
}
