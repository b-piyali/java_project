package online_class.assignments.class5;

import online_class.arrays.RangeSumQuery;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeSumQueryTest {
    RangeSumQuery range = new RangeSumQuery();

    @Test
    public void rangeSumTest1() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        b.add(new ArrayList<>(Arrays.asList(1, 4)));
        b.add(new ArrayList<>(Arrays.asList(2, 3)));
        ArrayList<Long> newList = new ArrayList<>(Arrays.asList(10L, 5L));

        assertEquals(range.rangeSum(a, b), newList);
    }

    @Test
    public void rangeSumTest2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2, 2, 2));
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        b.add(new ArrayList<>(Arrays.asList(1, 1)));
        b.add(new ArrayList<>(Arrays.asList(2, 3)));
        ArrayList<Long> newList = new ArrayList<>(Arrays.asList(2L, 4L));

        assertEquals(range.rangeSum(a, b), newList);
    }
}
