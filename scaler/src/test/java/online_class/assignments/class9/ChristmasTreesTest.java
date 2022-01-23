package online_class.assignments.class9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreesTest {
    ChristmasTrees christmasTrees = new ChristmasTrees();

    @Test
    public void solveTest1(){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(christmasTrees.solve(A,B), 6);
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 6, 4, 2, 6, 9));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 5, 7, 3, 2, 7));
        assertEquals(christmasTrees.solve(A,B), 7);
    }
}
