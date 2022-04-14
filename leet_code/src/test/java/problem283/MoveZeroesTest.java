package problem283;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoveZeroesTest {
    MoveZeroes moveZeroes;

    @BeforeEach
    void setup() {
        moveZeroes = new MoveZeroes();
    }

    @Test
    public void test1() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] output = {1, 3, 12, 0, 0};
        moveZeroes.moveZeroes(nums);
        assertTrue(nums.equals(output));
    }

    @Test
    public void test2() {
        int[] nums = {0};
        int[] output = {0};
        moveZeroes.moveZeroes(nums);
        assertEquals(nums, output);
    }
}
