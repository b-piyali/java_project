package problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = {0, 1};
        assertEquals(true, twoSum.twoSum(nums, target).equals(output));
    }
}
