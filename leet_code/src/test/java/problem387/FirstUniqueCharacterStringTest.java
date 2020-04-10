package problem387;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterStringTest {
    FirstUniqueCharacterString uniqueCharacterString = new FirstUniqueCharacterString();

    @Test
    void firstUniqChar_1() {
        String s = "leetcode";
        assertEquals(0, uniqueCharacterString.firstUniqChar(s));
    }

    @Test
    void firstUniqChar_2() {
        String s = "loveleetcode";
        assertEquals(2, uniqueCharacterString.firstUniqChar(s));
    }

    @Test
    void firstUniqChar_3() {
        String s = "";
        assertEquals(-1, uniqueCharacterString.firstUniqChar(s));
    }

    @Test
    void firstUniqChar_4() {
        String s = "cc";
        assertEquals(-1, uniqueCharacterString.firstUniqChar(s));
    }

    @Test
    void firstUniqChar_5() {
        String s = "cco";
        assertEquals(2, uniqueCharacterString.firstUniqChar(s));
    }
}
