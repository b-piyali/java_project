package array_and_string.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestNumberTwiceOthersTest {
    LargestNumberTwiceOthers lNum = new LargestNumberTwiceOthers();

    @Test
    public void dominantIndexTest1() {
        int[] num = {3, 6, 1, 0};
        assertEquals(lNum.dominantIndex(num), 1);
    }

    @Test
    public void dominantIndexTest2() {
        int[] num = {1, 2, 3, 4};
        assertEquals(lNum.dominantIndex(num), -1);
    }

    @Test
    public void dominantIndexTest3() {
        int[] num = {1};
        assertEquals(lNum.dominantIndex(num), 0);
    }

    @Test
    public void dominantIndexTest4() {
        int[] num = {1, 0};
        assertEquals(lNum.dominantIndex(num), 0);
    }

    @Test
    public void dominantIndexTest5() {
        int[] num = {0, 0, 3, 2};
        assertEquals(lNum.dominantIndex(num), -1);
    }
}
