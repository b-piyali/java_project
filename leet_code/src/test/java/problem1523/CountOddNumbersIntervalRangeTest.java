package problem1523;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOddNumbersIntervalRangeTest {
    CountOddNumbersIntervalRange countOddNumbers;

    @BeforeEach
    void setup() {
        countOddNumbers = new CountOddNumbersIntervalRange();
    }

    @Test
    public void Test3() {
        int low = 3, high = 7, output = 3;
        assertEquals(output, countOddNumbers.countOdds(low, high));
    }

    @Test
    public void Test1() {
        int low = 8, high = 10, output = 1;
        assertEquals(output, countOddNumbers.countOdds(low, high));
    }
}
