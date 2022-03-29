package online_class.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxNonNegativeSubArrayTest {
    MaxNonNegativeSubArray maxSubArray;

    @BeforeEach
    void setup(){
        maxSubArray = new MaxNonNegativeSubArray();
    }

    @Test
    public void Test1(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 5, -7, 2, 3));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 2, 5));
        assertEquals(result, maxSubArray.maxset(input));
    }

    @Test
    public void Test2(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 5, -7, 2, 5));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 2, 5));
        assertEquals(result, maxSubArray.maxset(input));
    }

    @Test
    public void Test3(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1, -1));
        ArrayList<Integer> result = new ArrayList<>();
        assertEquals(result, maxSubArray.maxset(input));
    }

    @Test
    public void Test4(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 0, -1, 0));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(0,0));
        assertEquals(result, maxSubArray.maxset(input));
    }
}
