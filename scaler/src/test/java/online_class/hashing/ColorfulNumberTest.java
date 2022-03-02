package online_class.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorfulNumberTest {
    ColorfulNumber colorfulNumber;

    @BeforeEach
    void setup(){
        colorfulNumber = new ColorfulNumber();
    }

    @Test
    public void setColorfulNumberTest(){
        int A = 23;
        int result =1;
        assertEquals(result, colorfulNumber.colorful(A));
    }

    @Test
    public void colorfulNumberTest(){
        int A = 231;
        int result =0;
        assertEquals(result, colorfulNumber.colorful(A));
    }

    @Test
    public void notColorfulNumberTest(){
        int A = 236;
        int result =0;
        assertEquals(result, colorfulNumber.colorful(A));
    }
}
