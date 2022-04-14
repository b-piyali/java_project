package problem680;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidPalindromeIITest {
    ValidPalindromeII validPalindrome;

    @BeforeEach
    void setup() {
        validPalindrome = new ValidPalindromeII();
    }

    @Test
    public void test1() {
        String s = "aba";
        boolean output = true;
        assertEquals(output, validPalindrome.validPalindrome(s));
    }

    @Test
    public void test2() {
        String s = "abca";
        boolean output = true;
        assertEquals(output, validPalindrome.validPalindrome(s));
    }

    @Test
    public void test3() {
        String s = "abc";
        boolean output = false;
        assertEquals(output, validPalindrome.validPalindrome(s));
    }

    @Test
    public void test4() {
        String s = "ebcbbececabbacecbbcbe";
        boolean output = true;
        assertEquals(output, validPalindrome.validPalindrome(s));
    }

    @Test
    public void test5() {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        boolean output = true;
        assertEquals(output, validPalindrome.validPalindrome(s));
    }
}
