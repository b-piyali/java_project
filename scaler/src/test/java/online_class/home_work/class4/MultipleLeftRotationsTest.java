package online_class.home_work.class4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultipleLeftRotationsTest {
    MultipleLeftRotations rotations = new MultipleLeftRotations();

    @Test
    public void solveTest1() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        newList.add(new ArrayList<>(Arrays.asList(3, 4, 5, 1, 2)));
        newList.add(new ArrayList<>(Arrays.asList(4, 5, 1, 2, 3)));
        assertEquals(rotations.solve(a, b), newList);
    }

    @Test
    public void solveTest2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5, 17, 100, 11));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1));
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
        newList.add(new ArrayList<>(Arrays.asList(17, 100, 11, 5)));
        //newList.add(new ArrayList<>(Arrays.asList(4, 5, 1, 2, 3)));
        assertEquals(rotations.solve(a, b), newList);
    }
}
