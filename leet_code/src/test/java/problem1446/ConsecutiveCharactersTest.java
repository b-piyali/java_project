package problem1446;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static problem1446.ConsecutiveCharacters.maxPower;

/**
 * ConsecutiveCharacters Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Dec 13, 2021</pre>
 */
public class ConsecutiveCharactersTest {


    /**
     * Method: maxPower(String s)
     */
    @Test
    public void testMaxPower1() {
        String s = "leetcode";
        assertEquals(maxPower(s), 2);
    }

    @Test
    public void testMaxPower2() {
        String s = "abbcccddddeeeeedcba";
        assertEquals(maxPower(s), 5);
    }

    @Test
    public void testMaxPower3() {
        String s = "triplepillooooow";
        assertEquals(maxPower(s), 5);
    }

    @Test
    public void testMaxPower4() {
        String s = "hooraaaaaaaaaaay";
        assertEquals(maxPower(s), 11);
    }

    @Test
    public void testMaxPower5() {
        String s = "tourist";
        assertEquals(maxPower(s), 1);
    }

    @Test
    public void testMaxPower6() {
        String s = "tourist";
        assertNotEquals(maxPower(s), 2);
    }

    @Test
    public void testMaxPowerEmpty() {
        String s = "";
        assertNotEquals(maxPower(s), 3);
    }

    @Test
    public void testMaxPowerNull() {
        String s = null;
        assertEquals(maxPower(s), 0);
    }
}
