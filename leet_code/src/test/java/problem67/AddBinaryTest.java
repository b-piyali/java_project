package problem67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @Test
    public void addBinaryTest1(){
        assertEquals(addBinary.addBinary("11", "1"), "100");
    }

    @Test
    public void addBinaryTest2(){
        assertEquals(addBinary.addBinary("1010", "1011"), "10101");
    }

    @Test
    public void addBinaryTest3(){
        assertNotEquals(addBinary.addBinary("1010", "1011"), "1001");
    }
}
