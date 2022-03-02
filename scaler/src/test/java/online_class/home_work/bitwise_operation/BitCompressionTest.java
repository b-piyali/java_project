package online_class.home_work.bitwise_operation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BitCompressionTest {
    BitCompression compression = new BitCompression();

    @Test
    public void compressBitsTest1(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5));
        assertEquals(compression.compressBits(nums), 7);
    }

    @Test
    public void compressBitsTest2(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 1));
        assertEquals(compression.compressBits(nums), 1);
    }
}
