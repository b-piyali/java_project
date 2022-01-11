package problem1094;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CarPoolingTest {
    CarPooling carPooling = new CarPooling();

    @Test
    public void carPoolingTest1() {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        assertEquals(carPooling.carPooling(trips, 4), false);
    }

    @Test
    public void carPoolingTest2() {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        assertEquals(carPooling.carPooling(trips, 5), true);
    }

    @Test
    public void carPoolingTest3() {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        assertNotEquals(carPooling.carPooling(trips, 5), false);
    }
}
