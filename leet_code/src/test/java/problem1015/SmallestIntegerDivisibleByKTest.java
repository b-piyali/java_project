package problem1015;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestIntegerDivisibleByKTest {
    SmallestIntegerDivisibleByK sd = new SmallestIntegerDivisibleByK();

    @Test
    public void smallestRepunitDivByKTest1(){
        assertEquals(sd.smallestRepunitDivByK(1), 1);
    }

    @Test
    public void smallestRepunitDivByKTest2(){
        assertEquals(sd.smallestRepunitDivByK(2), -1);
    }

    @Test
    public void smallestRepunitDivByKTest3(){
        assertEquals(sd.smallestRepunitDivByK(3), 3);
    }

    @Test
    public void smallestRepunitDivByKTest4(){
        assertEquals(sd.smallestRepunitDivByK(5), -1);
    }

    @Test
    public void smallestRepunitDivByKTest5(){
        assertEquals(sd.smallestRepunitDivByK(4), -1);
    }
    @Test
    public void smallestRepunitDivByKTest6(){
        assertNotEquals(sd.smallestRepunitDivByK(7), 1);
    }
}
