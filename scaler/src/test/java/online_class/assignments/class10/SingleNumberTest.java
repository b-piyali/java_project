package online_class.assignments.class10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {
    SingleNumber singleNumber = new SingleNumber();

    @Test
    public void singleNumberTest1() {
        final List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1));
        assertEquals(singleNumber.singleNumber(A), 3);
    }

    @Test
    public void singleNumberTest2() {
        final List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 2));
        assertEquals(singleNumber.singleNumber(A), 1);
    }
}
