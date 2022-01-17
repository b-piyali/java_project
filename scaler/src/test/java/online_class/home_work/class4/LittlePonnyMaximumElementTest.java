package online_class.home_work.class4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LittlePonnyMaximumElementTest {
    LittlePonnyMaximumElement maximumElement = new LittlePonnyMaximumElement();

    @Test
    public void solveTest1(){
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(2, 4, 3, 1, 5));
        assertEquals(maximumElement.solve(n, 3), 2);
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1, 4, 2));
        assertEquals(maximumElement.solve(n, 3), -1);
    }

    @Test
    public void solveTest3(){
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(24, 33, 13, 11, 30, 28, 19, 8, 30, 25, 42, 6, 30, 49, 3, 49, 24, 13, 3, 50));
        assertEquals(maximumElement.solve(n, 13), 13);
    }
}
