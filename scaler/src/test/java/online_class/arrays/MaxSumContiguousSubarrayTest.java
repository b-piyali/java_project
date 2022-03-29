package online_class.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumContiguousSubarrayTest {
    MaxSumContiguousSubarray maxSubarraySum;

     @BeforeEach
    void setup(){
         maxSubarraySum = new MaxSumContiguousSubarray();
     }

     @Test
    public void test1(){
         List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -10));
         int output = 10;
         assertEquals(output, maxSubarraySum.maxSubArray(input));
     }

     @Test
    public void test2(){
         List<Integer> input = new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
         int output = 6;
         assertEquals(output, maxSubarraySum.maxSubArray(input));
     }
}
