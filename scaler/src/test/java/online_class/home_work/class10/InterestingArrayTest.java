package online_class.home_work.class10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InterestingArrayTest {
    InterestingArray interestingArray = new InterestingArray();

    @Test
    public void solveTest1(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(9, 17));
        assertEquals(interestingArray.solve(nums), "Yes");
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1));
        assertEquals(interestingArray.solve(nums), "No");
    }
}
