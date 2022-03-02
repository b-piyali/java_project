package problem171;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnNumberTest {
    ExcelSheetColumnNumber excelColumnNumber;

    @BeforeEach
    void setup() {
        excelColumnNumber = new ExcelSheetColumnNumber();
    }

    @Test
    public void columnTestA() {
        String str = "A";
        int result = 1;
        assertEquals(result, excelColumnNumber.titleToNumber(str));
    }

    @Test
    public void columnTestAB() {
        String str = "AB";
        int result = 28;
        assertEquals(result, excelColumnNumber.titleToNumber(str));
    }

    @Test
    public void columnTestZY() {
        String str = "ZY";
        int result = 701;
        assertEquals(result, excelColumnNumber.titleToNumber(str));
    }
}
