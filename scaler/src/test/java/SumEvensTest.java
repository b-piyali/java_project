import org.junit.jupiter.api.Test;
import show_primer.SumEvens;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumEvensTest {
    SumEvens sumEvens = new SumEvens();

    @Test
    public void sumEvensTest1() {
        assertEquals(sumEvens.solve(5), 6);
    }
}
