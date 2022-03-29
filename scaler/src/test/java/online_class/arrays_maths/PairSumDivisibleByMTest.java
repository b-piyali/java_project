package online_class.arrays_maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairSumDivisibleByMTest {
    PairSumDivisibleByM pairSumDivisibleByM;

    @BeforeEach
    void setup() {
        pairSumDivisibleByM = new PairSumDivisibleByM();
    }

    @Test
    public void Test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int mod = 2;
        int result = 4;
        assertEquals(result, pairSumDivisibleByM.solve(input, mod));
    }

    @Test
    public void Test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 17, 100, 11));
        int mod = 28;
        int result = 1;
        assertEquals(result, pairSumDivisibleByM.solve(input, mod));
    }
}
