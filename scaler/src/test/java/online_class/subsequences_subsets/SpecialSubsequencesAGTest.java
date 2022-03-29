package online_class.subsequences_subsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecialSubsequencesAGTest {
    SpecialSubsequencesAG subsequencesAG;

    @BeforeEach
    void setup() {
        subsequencesAG = new SpecialSubsequencesAG();
    }

    @Test
    public void subSequence2Test() {
        String str = "ABCGAG";
        assertEquals(3, subsequencesAG.solve(str));
    }

    @Test
    public void subSequence0Test() {
        String str = "GAB";
        assertEquals(0, subsequencesAG.solve(str));
    }
}
