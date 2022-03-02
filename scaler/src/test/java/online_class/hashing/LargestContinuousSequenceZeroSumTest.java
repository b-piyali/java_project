package online_class.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestContinuousSequenceZeroSumTest {
    LargestContinuousSequenceZeroSum largestZeroSum;

    @BeforeEach
    void setup() {
        largestZeroSum = new LargestContinuousSequenceZeroSum();
    }

    @Test
    public void lszeroTest1() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, -2, 4, -4));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(2, -2, 4, -4));
        assertEquals(result, largestZeroSum.lszero(nums));
    }

    @Test
    public void lszeroTest2() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, -3, 3));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(3, -3));
        assertEquals(result, largestZeroSum.lszero(nums));
    }

    @Test
    public void lszeroTest3() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(-19, 8, 2, -8, 19, 5, -2, -23));
        ArrayList<Integer> result = new ArrayList<>();
        assertEquals(result, largestZeroSum.lszero(nums));
    }
}
