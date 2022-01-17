package problem849;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximizeDistanceClosestPersonTest {
    MaximizeDistanceClosestPerson maxDist = new MaximizeDistanceClosestPerson();

    @Test
    public void maxDistToClosestTest1() {
        int[] nums = {1, 0, 0, 0};
        assertEquals(maxDist.maxDistToClosest(nums), 3);
    }

    @Test
    public void maxDistToClosestTest2() {
        int[] nums = {0, 1};
        assertEquals(maxDist.maxDistToClosest(nums), 2);
    }

    @Test
    public void maxDistToClosestTest3() {
        int[] nums = {1,0,0,0,1,0,1};
        assertEquals(maxDist.maxDistToClosest(nums), 2);
    }
}
