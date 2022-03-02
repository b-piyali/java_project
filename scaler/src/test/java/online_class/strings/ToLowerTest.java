package online_class.strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToLowerTest {
    ToLower lower = new ToLower();

    @Test
    public void to_lowerTest1() {
        ArrayList<Character> num = new ArrayList<>(Arrays.asList('S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'));
        ArrayList<Character> result = new ArrayList<>(Arrays.asList('s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y'));
        assertEquals(lower.to_lower(num), result);
    }

    @Test
    public void to_lowerTest2() {
        ArrayList<Character> num = new ArrayList<>(Arrays.asList('S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'));
        ArrayList<Character> result = new ArrayList<>(Arrays.asList('s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'));
        assertEquals(lower.to_lower(num), result);
    }
}
