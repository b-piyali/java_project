package problem560;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarraySumEqualsKTest {
    private SubarraySumEqualsK subarraySumEqualsK;

    @BeforeEach
    public void initEach(){
        subarraySumEqualsK = new SubarraySumEqualsK();
    }

    @Test
    public void subarraySumTest1() {
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = 2;
        assertEquals(result, subarraySumEqualsK.subarraySum(nums, k));
    }

    @Test
    public void subarraySumTest2() {
        int[] nums = {1, 2, 3};
        int k = 3;
        int result = 2;
        assertEquals(result, subarraySumEqualsK.subarraySum(nums, k));
    }
}
