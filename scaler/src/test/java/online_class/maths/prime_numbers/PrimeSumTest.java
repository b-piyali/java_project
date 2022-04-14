package online_class.maths.prime_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeSumTest {
    PrimeSum primeSum ;

    @BeforeEach
    void setup(){
        primeSum = new PrimeSum();
    }

    @Test
    public void test1(){
        int input = 16777214;
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(31, 16777183));
        assertEquals(result, primeSum.primesum(input));
    }

    @Test
    public void test2(){
        int input = 4;
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(2, 2));
        assertEquals(result, primeSum.primesum(input));
    }

}
