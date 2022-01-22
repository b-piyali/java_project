package online_class.assignments.class7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSumContiguousSubarrayTest {
    MaxSumContiguousSubarray sumContiguousSubarray = new MaxSumContiguousSubarray();

    @Test
    public void maxSubArrayTest1(){
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -10));
        assertEquals(sumContiguousSubarray.maxSubArray(nums), 10);
    }

    @Test
    public void maxSubArrayTest2(){
        List<Integer> nums = new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        assertEquals(sumContiguousSubarray.maxSubArray(nums), 6);
    }
}
