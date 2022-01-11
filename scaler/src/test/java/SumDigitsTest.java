import org.junit.jupiter.api.Test;
import show_primer.SumDigits;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumDigitsTest {

    @Test
    public void testFindComplement1() {
        assertEquals(SumDigits.sumDigit(5), 5);
    }

    @Test
    public void testFindComplement2() {
        assertEquals(SumDigits.sumDigit(123), 6);
    }

    @Test
    public void testFindComplement3() {
        assertEquals(SumDigits.sumDigit(1001), 2);
    }

    @Test
    public void testFindComplement4() {
        assertEquals(SumDigits.sumDigit(1589), 23);
    }

}
