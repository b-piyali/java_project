package online_class.maths.prime_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DistinctPrimesTest {
    DistinctPrimes distinctPrimes;

    @BeforeEach
    void setup() {
        distinctPrimes = new DistinctPrimes();
    }

    @Test
    public void test1(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int output = 2;
        assertEquals(output, distinctPrimes.solve(input));
    }

    @Test
    public void test2(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(96, 98, 5, 41, 80 ));
        int output = 5;
        assertEquals(output, distinctPrimes.solve(input));
    }
}
