import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class VowelItTest {
    VowelIt vowelIt = new VowelIt();

    @Test
    public void stringOfVowelsTest1() {
        String str = "abcdye";
        assertEquals(vowelIt.stringOfVowels(str), "ae");
    }

    @Test
    public void stringOfVowelsTest2() {
        String str = "abhishek";
        assertEquals(vowelIt.stringOfVowels(str), "aie");
    }

    @Test
    public void stringOfVowelsTest3() {
        String str = "interviewbit";
        assertEquals(vowelIt.stringOfVowels(str), "ieiei");
    }

    @Test
    public void stringOfVowelsTest4() {
        String str = "abhishek";
        assertNotEquals(vowelIt.stringOfVowels(str), "ae");
    }

    @Test
    public void stringOfVowelsTest5() {
        String str = "interviewbit";
        assertNotEquals(vowelIt.stringOfVowels(str), "ae");
    }
}
