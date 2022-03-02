package show_primer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoundedValTest {
    RoundedVal roundedVal;

    @BeforeEach
    void setup() {
        roundedVal = new RoundedVal();
    }

    @Test
    public void test1() {
        int num = -771;
        int output = -4;
        assertEquals(output, roundedVal.solve(num));
    }

    @Test
    public void test2() {
        int num = 398;
        int output = 2;
        assertEquals(output, roundedVal.solve(num));
    }
}
