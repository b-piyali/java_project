package may.week3.day15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumCircularSubarrayTest {

    MaximumSumCircularSubarray sumCircularSubarray = new MaximumSumCircularSubarray();

    @Test
    void maxSubarraySumCircular_1() {
        int[] n = {1,-2,3,-2};
        assertEquals(3, sumCircularSubarray.maxSubarraySumCircular(n));
    }

    @Test
    void maxSubarraySumCircular_2() {
        int[] n = {5,-3,5};
        assertEquals(10, sumCircularSubarray.maxSubarraySumCircular(n));
    }

    @Test
    void maxSubarraySumCircular_3() {
        int[] n = {3,-1,2,-1};
        assertEquals(4, sumCircularSubarray.maxSubarraySumCircular(n));
    }

    @Test
    void maxSubarraySumCircular_4() {
        int[] n = {3,-2,2,-3};
        assertEquals(3, sumCircularSubarray.maxSubarraySumCircular(n));
    }

    @Test
    void maxSubarraySumCircular_5() {
        int[] n = {-2,-3,-1};
        assertEquals(-1, sumCircularSubarray.maxSubarraySumCircular(n));
    }

/*
    @Test
    void maxSubarraySumCircular_6() {
        int[] n = {1,-2,3,-2};
        assertEquals(3, sumCircularSubarray.maxSubarraySumCircular(n));
    }
*/
}
