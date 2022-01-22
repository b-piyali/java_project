package online_class.assignments.class7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayEasyTest {
    MaximumSubarrayEasy maximumSubarray = new MaximumSubarrayEasy();

    @Test
    public void maxSubarrayTest1(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5));
        assertEquals(maximumSubarray.maxSubarray(5, 12, nums), 12);
    }

    @Test
    public void maxSubarrayTest2(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 2));
        assertEquals(maximumSubarray.maxSubarray(3, 1, nums), 0);
    }

    @Test
    public void maxSubarrayTest3(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4));
        assertEquals(maximumSubarray.maxSubarray(1, 75, nums), 4);
    }
}
