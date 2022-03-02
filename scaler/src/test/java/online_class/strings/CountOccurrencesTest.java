package online_class.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurrencesTest {
    CountOccurrences occurrences;

    @BeforeEach
    void setup(){
        occurrences = new CountOccurrences();
    }

    @Test
    public void oneOccurance(){
        String str = "abobc";
        int result = 1;
        assertEquals(result, occurrences.solve(str));
    }

    @Test
    public void twoOccurance(){
        String str = "bobob";
        int result = 2;
        assertEquals(result, occurrences.solve(str));
    }
}
