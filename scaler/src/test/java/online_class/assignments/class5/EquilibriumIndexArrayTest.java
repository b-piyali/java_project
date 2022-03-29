package online_class.assignments.class5;

import online_class.arrays.EquilibriumIndexArray;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EquilibriumIndexArrayTest {
    EquilibriumIndexArray equilibriumIndex = new EquilibriumIndexArray();

    @Test
    public void solveTest1(){
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
        assertEquals(equilibriumIndex.solve(num), 3);
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(equilibriumIndex.solve(num), -1);
    }
}
