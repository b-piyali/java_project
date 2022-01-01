package array_and_string.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusOneTest {
    PlusOne plusOne = new PlusOne();

    @Test
    public void plusOneTest1() {
        int[] digits = {1, 2, 3};
        int[] result = {1, 2, 4};
        assertEquals(plusOne.plusOne(digits), result);
    }
}
