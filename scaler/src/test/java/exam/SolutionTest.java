package exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void solutionTest(){
        int[] nums = {1, 2, -3, 4, 5, -6};
        int result = 9;
        assertEquals(result, solution.solution(nums));
    }

    @Test
    public void solutionTest2(){
        int[] nums = {-1, -2, -3, -4, -5, -6};
        int result = -1;
        assertEquals(result, solution.solution(nums));
    }
}
