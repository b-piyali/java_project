package online_class.home_work.class10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {
    NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

    @Test
    public void numSetBitsTest1(){
        assertEquals(numberOf1Bits.numSetBits(11), 3);
    }

    @Test
    public void numSetBitsTest2(){
        assertEquals(numberOf1Bits.numSetBits(10), 2);
    }

    @Test
    public void numSetBitsTest3(){
        assertNotEquals(numberOf1Bits.numSetBits(28), 2);
    }
}
