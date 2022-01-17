package online_class.assignments.class6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BulbsTest {
    Bulbs bulbs = new Bulbs();

    @Test
    public void bulbTests1() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0, 1, 0, 1));
        assertEquals(bulbs.bulbs(nums), 4);
    }

    @Test
    public void bulbTests2() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 1, 1));
        assertEquals(bulbs.bulbs(nums), 0);
    }
}
