package array_and_string.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPivotIndexTest {
    FindPivotIndex fpi = new FindPivotIndex();

    @Test
    public void pivotIndexTest1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        assertEquals(fpi.pivotIndex(nums), 3);
    }

    @Test
    public void pivotIndexTest2() {
        int[] nums = {1, 2, 3};
        assertEquals(fpi.pivotIndex(nums), -1);
    }

    @Test
    public void pivotIndexTest3() {
        int[] nums = {2, 1, -1};
        assertEquals(fpi.pivotIndex(nums), 0);
    }
}
