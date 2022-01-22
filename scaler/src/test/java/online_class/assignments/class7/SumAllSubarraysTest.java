package online_class.assignments.class7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumAllSubarraysTest {
    SumAllSubarrays sumSubarrays = new SumAllSubarrays();

    @Test
    public void subarraySumTest1(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 9, 5));
        assertEquals(sumSubarrays.subarraySum(nums), 57);
    }

    @Test
    public void subarraySumTest2(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(sumSubarrays.subarraySum(nums), 20);
    }

    @Test
    public void subarraySumTest3(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 1, 3));
        assertEquals(sumSubarrays.subarraySum(nums), 19);
    }
}
