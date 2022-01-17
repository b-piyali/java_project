package online_class.home_work.class6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeadersInArrayTest {
    LeadersInArray leaders = new LeadersInArray();

    @Test
    public void solveTest1() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(5, 2, 17));

        assertEquals(leaders.solve(nums), results);
    }

    @Test
    public void solveTest2() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(93, 57, 83, 41, 100, 10, 79, 27, 94, 22, 4, 96, 48, 18, 89, 37, 21, 5, 46, 81, 15, 30, 47, 23, 34, 65, 55, 9, 36, 20, 54, 17, 7, 56, 78, 84, 87, 97, 16, 69, 28, 11, 44, 49, 8, 25, 98, 75, 53, 62, 19, 24, 80, 68, 50, 91, 1, 86, 77, 14, 72, 66, 42, 63, 73, 45, 31, 61, 85, 64, 35, 32, 92, 71, 74, 3, 99, 52, 90, 43, 6, 40, 38, 2, 12, 59, 29, 82, 76, 60, 67, 13, 70, 58, 39, 33, 95, 88, 51, 26));
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(26, 51, 88, 95, 99, 100));

        assertEquals(leaders.solve(nums), results);
    }
}
