package online_class.assignments.class6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialSubsequencesAGTest {
    SpecialSubsequencesAG subsequencesAG = new SpecialSubsequencesAG();

    @Test
    public void solveTest1(){
        String str = "ABCGAG";
        assertEquals(subsequencesAG.solve(str), 3);
    }

    @Test
    public void solveTest2(){
        String str = "GAB";
        assertEquals(subsequencesAG.solve(str), 0);
    }
}
