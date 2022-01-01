package problem1991;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMiddleIndexArrayTest {
    FindMiddleIndexArray fmia = new FindMiddleIndexArray();

    @Test
    public void findMiddleIndexTest1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        assertEquals(fmia.findMiddleIndex(nums), 3);
    }

    @Test
    public void findMiddleIndexTest2() {
        int[] nums = {2, 3, -1, 8, 4};
        assertEquals(fmia.findMiddleIndex(nums), 3);
    }

    @Test
    public void findMiddleIndexTest3() {
        int[] nums = {1, -1, 4};
        assertEquals(fmia.findMiddleIndex(nums), 2);
    }

    @Test
    public void findMiddleIndexTest4() {
        int[] nums = {2, 5};
        assertEquals(fmia.findMiddleIndex(nums), -1);
    }

}
