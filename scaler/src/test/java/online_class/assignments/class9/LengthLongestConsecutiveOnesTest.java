package online_class.assignments.class9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthLongestConsecutiveOnesTest {
    LengthLongestConsecutiveOnes longestConsecutiveOnes = new LengthLongestConsecutiveOnes();

    @Test
    public void solveTest1() {
        String str = "111000";
        assertEquals(longestConsecutiveOnes.solve(str), 3);
    }

    @Test
    public void solveTest2() {
        String str = "111011101";
        assertEquals(longestConsecutiveOnes.solve(str), 7);
    }

    @Test
    public void solveTest3() {
        String str = "010100110101";
        assertEquals(longestConsecutiveOnes.solve(str), 4);
    }
}
