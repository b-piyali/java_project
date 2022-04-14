package online_class.sort;

import online_class.sorting.KthSmallestElement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthSmallestElementTest {
    KthSmallestElement smallestElement = new KthSmallestElement();
    ;

    @Test
    void test1() {
        List<Integer> input = Arrays.asList(8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92);
        int b = 9;
        assertEquals(17, smallestElement.kthsmallest(input, b));
    }
}
