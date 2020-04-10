package _30_day_challenge.week2.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackspaceStringCompareTest {
    BackspaceStringCompare stringCompare = new BackspaceStringCompare();

    @Test
    void backspaceCompare_1() {
        String S = "ab#c", T = "ad#c";
        assertEquals(true, stringCompare.backspaceCompare(S, T));
    }

    @Test
    void backspaceCompare_2() {
        String S = "ab##", T = "c#d#";
        assertEquals(true, stringCompare.backspaceCompare(S, T));
    }

    @Test
    void backspaceCompare_3() {
        String S = "a##c", T = "#a#c";
        assertEquals(true, stringCompare.backspaceCompare(S, T));
    }

    @Test
    void backspaceCompare_4() {
        String S = "a#c", T = "b";
        assertEquals(false, stringCompare.backspaceCompare(S, T));
    }
}
