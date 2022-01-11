package problem42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {
    TrappingRainWater rainWater = new TrappingRainWater();

    @Test
    public void trapTest1(){
        int[] height = {4,2,0,3,2,5};
        assertEquals(rainWater.trap(height), 9);
    }

    @Test
    public void trapTest2(){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(rainWater.trap(height), 6);
    }
}
