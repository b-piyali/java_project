package _30_day_challenge.week1.day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingElementsTest {

    private CountingElements countingElements = new CountingElements();

    @Test
    void countElements_1() {
        int[] i = {1,1,3,3,5,5,7,7};
        assertEquals(0,countingElements.countElements(i));
    }

    @Test
    void countElements_2() {
        int[] i = {1,3,2,3,5,0};
        assertEquals(3,countingElements.countElements(i));
    }

    @Test
    void countElements_3() {
        int[] i = {1,2,3};
        assertEquals(2,countingElements.countElements(i));
    }

    @Test
    void countElements_4() {
        int[] i = {2,9,0,7,6,2,7,7,0};
        assertEquals(1,countingElements.countElements(i));
    }

    @Test
    void countElements_5() {
        int[] i = {1,1,2,2};
        assertEquals(2,countingElements.countElements(i));
    }
}
