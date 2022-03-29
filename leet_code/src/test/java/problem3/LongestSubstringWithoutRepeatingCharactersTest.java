package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters longChar;

    @BeforeEach
    void setup() {
        longChar = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void test1(){
        String str= "pwwkew";
        int output = 3;
        assertEquals(output, longChar.lengthOfLongestSubstring(str));
    }

    @Test
    public void test2(){
        String str= "bbbbb";
        int output = 1;
        assertEquals(output, longChar.lengthOfLongestSubstring(str));
    }

    @Test
    public void test3(){
        String str= "abcabcbb";
        int output = 3;
        assertEquals(output, longChar.lengthOfLongestSubstring(str));
    }
}
