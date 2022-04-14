package online_class.maths.prime_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountDivisorsTest {
    CountDivisors countDivisors;

    @BeforeEach
    void setup() {
        countDivisors = new CountDivisors();
    }

    @Test
    public void test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(2, 2, 3, 2));
        assertEquals(output, countDivisors.solve(input));
    }

    @Test
    public void test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(8, 9, 10));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(4, 3, 4));
        assertEquals(output, countDivisors.solve(input));
    }
}
