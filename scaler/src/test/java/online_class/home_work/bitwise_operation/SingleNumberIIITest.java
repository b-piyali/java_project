package online_class.home_work.bitwise_operation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberIIITest {
    SingleNumberIII singleNumber = new SingleNumberIII();

    @Test
    public void solveTest1(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 4));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(3, 4));
        assertEquals(singleNumber.solve(nums), result);
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(singleNumber.solve(nums), result);
    }

    @Test
    public void solveTest3(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(186, 256, 102, 377, 186, 377));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(102, 256));
        assertEquals(singleNumber.solve(nums), result);
    }
}
