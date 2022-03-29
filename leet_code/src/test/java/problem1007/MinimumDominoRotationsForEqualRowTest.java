package problem1007;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumDominoRotationsForEqualRowTest {
    MinimumDominoRotationsForEqualRow dominoRotationsForEqualRow;

    @BeforeEach
    void setup() {
        dominoRotationsForEqualRow = new MinimumDominoRotationsForEqualRow();
    }

    @Test
    public void dominosTest1() {
        int[] tops = {3, 5, 1, 2, 3};
        int[] bottoms = {3, 6, 3, 3, 4};
        int result = -1;
        assertEquals(result, dominoRotationsForEqualRow.minDominoRotations(tops, bottoms));
    }

    @Test
    public void dominosTest2() {
        int[] tops = {2, 1, 2, 4, 2, 2};
        int[] bottoms = {5, 2, 6, 2, 3, 2};
        int result = 2;
        assertEquals(result, dominoRotationsForEqualRow.minDominoRotations(tops, bottoms));
    }

    @Test
    public void dominosTest3() {
        int[] tops = {1, 2, 1, 3, 1, 1, 3, 4};
        int[] bottoms = {3, 2, 2, 1, 4, 1, 4, 2};
        int result = -1;
        assertEquals(result, dominoRotationsForEqualRow.minDominoRotations(tops, bottoms));
    }

    @Test
    public void dominosTest4() {
        int[] tops = {1, 2};
        int[] bottoms = {2, 1};
        int result = 1;
        assertEquals(result, dominoRotationsForEqualRow.minDominoRotations(tops, bottoms));
    }
}
