package problem476;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * NumberComplement Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Dec 27, 2021</pre>
 */
public class NumberComplementTest {
    NumberComplement numberComplement = new NumberComplement();

    /**
     * Method: findComplement(int num)
     */
    @Test
    public void testFindComplement1() throws Exception {
        assertEquals(numberComplement.findComplement(5), 2);
    }

    @Test
    public void testFindComplement2() throws Exception {
        assertNotEquals(numberComplement.findComplement(3), 2);
    }

    @Test
    public void testFindComplement3() throws Exception {
        assertEquals(numberComplement.findComplement(1), 0);
    }
}
