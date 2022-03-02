package online_class.maths.modular_arithmetic_introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelColumnNumberTest {
    ExcelColumnNumber columnNumber = new ExcelColumnNumber();

    @Test
    public void titleToNumberTest1(){
        assertEquals(columnNumber.titleToNumber("AB"), 28);
    }

    @Test
    public void titleToNumberTest2(){
        assertEquals(columnNumber.titleToNumber("ABCD"), 19010);
    }
}
