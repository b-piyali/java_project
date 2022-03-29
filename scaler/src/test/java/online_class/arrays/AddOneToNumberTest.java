package online_class.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddOneToNumberTest {
    AddOneToNumber oneNum;

    @BeforeEach
    void setup() {
        oneNum = new AddOneToNumber();
    }

    @Test
    public void Test1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 4));
        assertEquals(output, oneNum.plusOne(input));
    }

    @Test
    public void Test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 0, 0));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 0, 1));
        assertEquals(output, oneNum.plusOne(input));
    }

    @Test
    public void Test3() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9, 9, 9));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 0, 0, 0));
        assertEquals(output, oneNum.plusOne(input));
    }

    @Test
    public void Test4() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 3, 7, 6, 4, 0, 5, 5, 5));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(3, 7, 6, 4, 0, 5, 5, 6));
        assertEquals(output, oneNum.plusOne(input));
    }
}
