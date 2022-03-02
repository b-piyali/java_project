package online_class.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckPalindromeIITest {
    CheckPalindromeII checkPalindrome;

    @BeforeEach
    void setUp() {
        checkPalindrome = new CheckPalindromeII();
    }

    @Test
    public void palindromTest() {
        String A = "abcde";
        int result = 0;
        assertEquals(result, checkPalindrome.solve(A));
    }

    @Test
    public void palindromTest1() {
        String A = "abbaee";
        int result = 1;
        assertEquals(result, checkPalindrome.solve(A));
    }

    @Test
    public void palindromTest2() {
        String A = "mnxljrajwhxiaquajokwvoqqphylxpbanmmhfxsmssxzsdnprtgibuhaxnwxzfozexiascybplaaqjcthuydnoowmkzyamodzknkqmwdglqqnhflfslqyowcangsddhcjjuiyfbdkevlghbictrvnmnathotrekyrggwcmbzorqtyeowksywlbetsyhjvczcnvusfdrxythrhhoxtuuprqftgwohcgpngktkharijsovuknae";
        int result = 0;
        assertEquals(result, checkPalindrome.solve(A));
    }
}
