package _30_day_challenge.week1.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MaximumSubarrayTest {

    MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    void maxSubArray_1() {
        int[] n = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maximumSubarray.maxSubArray(n));
    }

    @Test
    void maxSubArray_2() {
        int[] n = {-2, -3, 4, -1, -2, 1, 5, -3};
        assertEquals(7, maximumSubarray.maxSubArray(n));
    }

    @Test
    void maxSubArray_3() {
        int[] n = {-2, 3, 4, -1, -2, 1, 5, -3};
        assertNotEquals(7, maximumSubarray.maxSubArray(n));
    }
}
