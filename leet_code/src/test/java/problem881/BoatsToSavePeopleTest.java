package problem881;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoatsToSavePeopleTest {
    BoatsToSavePeople boatsToSavePeople;

    @BeforeEach
    void setup() {
        boatsToSavePeople = new BoatsToSavePeople();
    }

    @Test
    public void boatTest1() {
        int[] people = {1, 2};
        int limit = 3;
        int result = 1;
        assertEquals(result, boatsToSavePeople.numRescueBoats(people, limit));
    }

    @Test
    public void boatTest3() {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        int result = 3;
        assertEquals(result, boatsToSavePeople.numRescueBoats(people, limit));
    }

    @Test
    public void boatTest4() {
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        int result = 4;
        assertEquals(result, boatsToSavePeople.numRescueBoats(people, limit));
    }

    @Test
    public void boatTest2() {
        int[] people = {3,8,7,1,4};
        int limit = 9;
        int result = 3;
        assertEquals(result, boatsToSavePeople.numRescueBoats(people, limit));
    }
}
