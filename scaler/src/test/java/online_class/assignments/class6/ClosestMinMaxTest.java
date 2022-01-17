package online_class.assignments.class6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClosestMinMaxTest {
    ClosestMinMax closestMinMax = new ClosestMinMax();

    @Test
    public void solveTest1(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(814, 761, 697, 483, 981));
        assertEquals(closestMinMax.solve(list), 2);
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3));
        assertEquals(closestMinMax.solve(list), 2);
    }

    @Test
    public void solveTest3(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2));
        assertEquals(closestMinMax.solve(list), 1);
    }

    @Test
    public void solveTest4(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(377, 448, 173, 307, 108));
        assertEquals(closestMinMax.solve(list), 4);
    }

    @Test
    public void solveTest5(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 4, 4, 4, 4));
        assertEquals(closestMinMax.solve(list), 1);
    }
}
