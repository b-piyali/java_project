package Problem20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    ValidParentheses validParentheses;

    @BeforeEach
    public void setup() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void validParenthesesTest1() {
        String input = "{([)]}";
        assertFalse(validParentheses.isValid(input));
    }

    @Test
    public void validParenthesesTest2() {
        String input = "()";
        assertTrue(validParentheses.isValid(input));
    }

    @Test
    public void validParenthesesTest3() {
        String input = "()[]{}";
        assertTrue(validParentheses.isValid(input));
    }

    @Test
    public void validParenthesesTest4() {
        String input = "(]";
        assertFalse(validParentheses.isValid(input));
    }
}
