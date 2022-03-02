package online_class.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonElementsTest {
    private CommonElements commonElements;

    @BeforeEach
    void setup() {
        commonElements = new CommonElements();
    }

    @Test
    public void threeCommeonElementTest() {
        ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(2, 3, 1, 2));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 2, 2));
        assertEquals(result, commonElements.solve(firstList, secondList));
    }

    @Test
    public void twoCommeonElementTest() {
        ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(2, 1, 4, 10));
        ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(3, 6, 2, 10, 10));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(2, 10));
        assertEquals(result, commonElements.solve(firstList, secondList));
    }

    @Test
    public void noCommeonElementTest() {
        ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(2, 1, 4, 10));
        ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(3, 6, 0, 9, 5));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList());
        assertEquals(result, commonElements.solve(firstList, secondList));
    }
}
