package online_class.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KOccurrencesTest {
    private KOccurrences kOccurrences;

    @BeforeEach
    void setUp() {
        kOccurrences = new KOccurrences();
    }

    @Test
    public void getSum2OccuranceTest() {
        int N = 5, K = 2;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        int result = 5;
        assertEquals(result, kOccurrences.getSum(N, K, A));
    }

    @Test
    public void getSumNoOccuranceTest() {
        int N = 5, K = 5;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int result = -1;
        assertEquals(result, kOccurrences.getSum(N, K, A));
    }

    @Test
    public void getSumOneOccuranceTest() {
        int N = 3, K = 2;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 1));
        int result = 0;
        assertEquals(result, kOccurrences.getSum(N, K, A));
    }

    @Test
    public void getSum0OccuranceTest() {
        int N = 3, K = 1;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 0, 2));
        int result = 5;
        assertEquals(result, kOccurrences.getSum(N, K, A));
    }
}
